import java.util.Optional;

public record uq(String b) implements tm {
   @Override
   public <T> Optional<T> a(tp.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(tp.b<T> $$0, uh $$1) {
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
