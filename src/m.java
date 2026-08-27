import java.util.Objects;

@FunctionalInterface
public interface m {
   boolean test(char var1);

   default m and(m $$0) {
      Objects.requireNonNull($$0);
      return $$1 -> this.test($$1) && $$0.test($$1);
   }

   default m negate() {
      return $$0 -> !this.test($$0);
   }

   default m or(m $$0) {
      Objects.requireNonNull($$0);
      return $$1 -> this.test($$1) || $$0.test($$1);
   }
}
