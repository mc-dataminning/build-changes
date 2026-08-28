import java.util.List;

public class ia<T extends ev<T>> implements hx<T> {
   private final ij<T> a;
   private final eq b;
   private final boolean c;

   public ia(ij<T> $$0, eq $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, ht<T> $$1, hv $$2) {
      $$1.e();
      List<hx<T>> $$3 = this.a.b();
      hw $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hv.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hv $$7 = new hv($$5, this.b, $$6);
      ib.a($$1, $$7, $$3, ($$1x, $$2x) -> new hp<>($$1x, $$2x.bind($$0)));
   }
}
