import java.util.List;

public class hn<T extends ej<T>> implements hk<T> {
   private final hv<T> a;
   private final ee b;
   private final boolean c;

   public hn(hv<T> $$0, ee $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hg<T> $$1, hi $$2) {
      $$1.e();
      List<hk<T>> $$3 = this.a.b();
      hj $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hi.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hi $$7 = new hi($$5, this.b, $$6);
      ho.a($$1, $$7, $$3, ($$1x, $$2x) -> new hc<>($$1x, $$2x.bind($$0)));
   }
}
