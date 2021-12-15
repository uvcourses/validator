package com.validator.validator;

public class CloudConfigValidator implements Validator {
    String value;

    public CloudConfigValidator(String value) {
        this.value = value;
    }

    @Override
    public ValidatorResult validate(String value) {
        ValidatorResult validatorResult = new ValidatorResult(ValidatorConstant.CLOUD_CONFIG_VALIDATOR);
        validatorResult.getResults().add("Not a Valid CCM - " + value);
        return validatorResult;
    }
}
