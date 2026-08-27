import java.util.List;

public class hk<T extends eg<T>> implements hh<T> {
   private final hs<T> a;
   private final eb b;
   private final boolean c;

   public hk(hs<T> $$0, eb $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hd<T> $$1, hf $$2) {
      $$1.e();
      List<hh<T>> $$3 = this.a.b();
      hg $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hf.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hf $$7 = new hf($$5, this.b, $$6);
      hl.a($$1, $$7, $$3, ($$1x, $$2x) -> new gz<>($$1x, $$2x.bind($$0)));
   }
}
