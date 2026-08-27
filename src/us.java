import java.util.Optional;

public record us(String b) implements to {
   @Override
   public <T> Optional<T> a(tr.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(tr.b<T> $$0, uj $$1) {
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
