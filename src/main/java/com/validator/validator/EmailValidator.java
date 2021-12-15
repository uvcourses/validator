package com.validator.validator;

public class EmailValidator implements Validator {
    String value;

    public EmailValidator(String value) {
        this.value = value;
    }

    @Override
    public ValidatorResult validate(String value) {
        ValidatorResult validatorResult = new ValidatorResult(ValidatorConstant.SCHEMA_VALIDATOR);
        validatorResult.getResults().add("Not a Valid Email - " + value);
        return validatorResult;
    }
}
