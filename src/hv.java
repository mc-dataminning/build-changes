import java.util.function.Consumer;

public class hv<T extends el<T>> implements hj<T> {
   private final Consumer<hl<T>> a;
   private final eg b;

   public hv(Consumer<hl<T>> $$0, eg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hk<T> $$0, hm $$1) {
      int $$2 = $$1.c() + 1;
      hm $$3 = new hm($$2, this.b, $$0.b($$2));
      this.a.accept(hl.a($$0, $$3));
   }
}
