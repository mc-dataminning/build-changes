import java.util.Optional;

public record ub(String b) implements sx {
   @Override
   public <T> Optional<T> a(ta.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
      return $$0.accept($$1, this.b);
   }

   @Override
   public String toString() {
      return "literal{" + this.b + "}";
   }

   public String a() {
      return this.b;
   }
}
