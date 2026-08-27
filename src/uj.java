import java.util.Optional;

public record uj(String b) implements tf {
   @Override
   public <T> Optional<T> a(ti.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(ti.b<T> $$0, ua $$1) {
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
