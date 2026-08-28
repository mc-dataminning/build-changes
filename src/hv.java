import java.util.List;

public class hv<T extends er<T>> implements hs<T> {
   private final id<T> a;
   private final em b;
   private final boolean c;

   public hv(id<T> $$0, em $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, ho<T> $$1, hq $$2) {
      $$1.e();
      List<hs<T>> $$3 = this.a.b();
      hr $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hq.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hq $$7 = new hq($$5, this.b, $$6);
      hw.a($$1, $$7, $$3, ($$1x, $$2x) -> new hk<>($$1x, $$2x.bind($$0)));
   }
}
