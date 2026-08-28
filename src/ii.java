import java.util.function.Consumer;

public class ii<T extends ey<T>> implements hv<T> {
   private final Consumer<hx<T>> a;
   private final et b;

   public ii(Consumer<hx<T>> $$0, et $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hw<T> $$0, hy $$1) {
      int $$2 = $$1.c() + 1;
      hy $$3 = new hy($$2, this.b, $$0.b($$2));
      this.a.accept(hx.a($$0, $$3));
   }
}
