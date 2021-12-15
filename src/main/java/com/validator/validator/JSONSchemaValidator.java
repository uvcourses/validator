package com.validator.validator;

public class JSONSchemaValidator implements Validator {

    String value;

    public JSONSchemaValidator(String value) {
        this.value = value;
    }

    @Override
    public ValidatorResult validate(String value) {
        ValidatorResult validatorResult = new ValidatorResult(ValidatorConstant.SCHEMA_VALIDATOR);
        validatorResult.getResults().add("Not a Valid Schema - " + value);
        return validatorResult;
    }
}
