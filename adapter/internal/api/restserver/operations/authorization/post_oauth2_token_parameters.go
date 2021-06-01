// Code generated by go-swagger; DO NOT EDIT.

// Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package authorization

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"
	"io"
	"net/http"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/runtime"
	"github.com/go-openapi/runtime/middleware"
	"github.com/go-openapi/validate"

	"github.com/wso2/product-microgateway/adapter/internal/api/models"
)

// NewPostOauth2TokenParams creates a new PostOauth2TokenParams object
//
// There are no default values defined in the spec.
func NewPostOauth2TokenParams() PostOauth2TokenParams {

	return PostOauth2TokenParams{}
}

// PostOauth2TokenParams contains all the bound params for the post oauth2 token operation
// typically these are obtained from a http.Request
//
// swagger:parameters PostOauth2Token
type PostOauth2TokenParams struct {

	// HTTP Request Object
	HTTPRequest *http.Request `json:"-"`

	/*Credentials of the microgateway REST API user
	  Required: true
	  In: body
	*/
	Credentials *models.Credentials
}

// BindRequest both binds and validates a request, it assumes that complex things implement a Validatable(strfmt.Registry) error interface
// for simple values it will use straight method calls.
//
// To ensure default values, the struct must have been initialized with NewPostOauth2TokenParams() beforehand.
func (o *PostOauth2TokenParams) BindRequest(r *http.Request, route *middleware.MatchedRoute) error {
	var res []error

	o.HTTPRequest = r

	if runtime.HasBody(r) {
		defer r.Body.Close()
		var body models.Credentials
		if err := route.Consumer.Consume(r.Body, &body); err != nil {
			if err == io.EOF {
				res = append(res, errors.Required("credentials", "body", ""))
			} else {
				res = append(res, errors.NewParseError("credentials", "body", "", err))
			}
		} else {
			// validate body object
			if err := body.Validate(route.Formats); err != nil {
				res = append(res, err)
			}

			ctx := validate.WithOperationRequest(context.Background())
			if err := body.ContextValidate(ctx, route.Formats); err != nil {
				res = append(res, err)
			}

			if len(res) == 0 {
				o.Credentials = &body
			}
		}
	} else {
		res = append(res, errors.Required("credentials", "body", ""))
	}
	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}
