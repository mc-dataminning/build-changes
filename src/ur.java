import java.util.Optional;

public record ur(String b) implements tn {
   @Override
   public <T> Optional<T> a(tq.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(tq.b<T> $$0, ui $$1) {
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
