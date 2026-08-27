import java.util.function.Consumer;

public class hf<T extends dx<T>> implements gt<T> {
   private final Consumer<gv<T>> a;
   private final ds b;

   public hf(Consumer<gv<T>> $$0, ds $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(gu<T> $$0, gw $$1) {
      int $$2 = $$1.c() + 1;
      gw $$3 = new gw($$2, this.b, $$0.b($$2));
      this.a.accept(gv.a($$0, $$3));
   }
}
