import java.util.function.Consumer;

public class ij<T extends ez<T>> implements hw<T> {
   private final Consumer<hy<T>> a;
   private final eu b;

   public ij(Consumer<hy<T>> $$0, eu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hx<T> $$0, hz $$1) {
      int $$2 = $$1.c() + 1;
      hz $$3 = new hz($$2, this.b, $$0.b($$2));
      this.a.accept(hy.a($$0, $$3));
   }
}
