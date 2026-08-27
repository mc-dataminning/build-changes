import java.util.function.Consumer;

public class hm<T extends ee<T>> implements ha<T> {
   private final Consumer<hc<T>> a;
   private final dz b;

   public hm(Consumer<hc<T>> $$0, dz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hb<T> $$0, hd $$1) {
      int $$2 = $$1.c() + 1;
      hd $$3 = new hd($$2, this.b, $$0.b($$2));
      this.a.accept(hc.a($$0, $$3));
   }
}
