package com.mdt.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SqsTest {

    @Test
    void ShouldCreateSqsInstance() {
        Sqs sqs = new Sqs();
        Assertions.assertTrue(true);
    }
}