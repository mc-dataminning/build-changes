import java.util.Objects;

@FunctionalInterface
public interface n {
   boolean test(char var1);

   default n and(n $$0) {
      Objects.requireNonNull($$0);
      return $$1 -> this.test($$1) && $$0.test($$1);
   }

   default n negate() {
      return $$0 -> !this.test($$0);
   }

   default n or(n $$0) {
      Objects.requireNonNull($$0);
      return $$1 -> this.test($$1) || $$0.test($$1);
   }
}
