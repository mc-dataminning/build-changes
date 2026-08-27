import java.util.Optional;

public record un(String b) implements tj {
   @Override
   public <T> Optional<T> a(tm.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(tm.b<T> $$0, ue $$1) {
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
