import java.util.function.Consumer;

public class ik<T extends ez<T>> implements hx<T> {
   private final Consumer<hz<T>> a;
   private final eu b;

   public ik(Consumer<hz<T>> $$0, eu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hy<T> $$0, ia $$1) {
      int $$2 = $$1.c() + 1;
      ia $$3 = new ia($$2, this.b, $$0.b($$2));
      this.a.accept(hz.a($$0, $$3));
   }
}
