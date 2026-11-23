# ADR-001: Subsystem Encapsulation and Public Access Methods

## Status
Accepted

## Context
In `IntakeSubsystem` there are hardware-related fields (such as `maxSpeed`) owned by subsystem. They shouldn't be changed from different parts of the code in order to preserve accdental changes.

## Decision
Keep the fields `private` and add `final` so they can't be changed. Create a `public` method called `getMaxSpeed` that returns the `maxSpeed`'s value so we can learn the value of it without accessing it directly.

## Consequences
- **Positive:** Prevents accidents such as changing the value of the variable and causing problems.
- **Negative:** Requires adding new `public` methods whenever another class needs information about the subsystem!s fields.