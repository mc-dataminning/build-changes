import java.util.List;

public class hi<T extends ee<T>> implements hf<T> {
   private final hq<T> a;
   private final dz b;
   private final boolean c;

   public hi(hq<T> $$0, dz $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hb<T> $$1, hd $$2) {
      $$1.e();
      List<hf<T>> $$3 = this.a.b();
      he $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hd.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hd $$7 = new hd($$5, this.b, $$6);
      hj.a($$1, $$7, $$3, ($$1x, $$2x) -> new gx<>($$1x, $$2x.bind($$0)));
   }
}
