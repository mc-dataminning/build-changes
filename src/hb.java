import java.util.List;

public class hb<T extends dx<T>> implements gy<T> {
   private final hj<T> a;
   private final ds b;
   private final boolean c;

   public hb(hj<T> $$0, ds $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, gu<T> $$1, gw $$2) {
      $$1.e();
      List<gy<T>> $$3 = this.a.b();
      gx $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      gw.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      gw $$7 = new gw($$5, this.b, $$6);
      hc.a($$1, $$7, $$3, ($$1x, $$2x) -> new gq<>($$1x, $$2x.bind($$0)));
   }
}
