import java.util.Optional;

public record uk(String b) implements tg {
   @Override
   public <T> Optional<T> a(tj.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(tj.b<T> $$0, ub $$1) {
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
