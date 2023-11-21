package com.labfat.adda;
import static org.junit.Assert.*;
import org.junit.Test;
public class UserValidationtest {
	
	 @Test
	 public void testValidUser() {
	 assertTrue(Uservalidation.validate("myuser", "mypassword"));
	 }
	 @Test
	 public void testInvalidUser() {
	 assertFalse(Uservalidation.validate("wronguser", "wrongpassword"));	
	 }
}
