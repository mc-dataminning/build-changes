import java.util.function.Consumer;

public class ih<T extends ex<T>> implements hu<T> {
   private final Consumer<hw<T>> a;
   private final es b;

   public ih(Consumer<hw<T>> $$0, es $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hv<T> $$0, hx $$1) {
      int $$2 = $$1.c() + 1;
      hx $$3 = new hx($$2, this.b, $$0.b($$2));
      this.a.accept(hw.a($$0, $$3));
   }
}
