import javax.annotation.Nullable;

public class haj<S extends hcg, M extends gfd<S>> extends gzy<S, M> {
   private final gez a;
   private final gez b;
   private final gzj c;

   public haj(gxh<S, M> $$0, gic $$1, gzj $$2) {
      super($$0);
      this.a = new gez($$1.a(gif.aL));
      this.b = new gez($$1.a(gif.aM));
      this.c = $$2;
   }

   public void a(fiq $$0, gpd $$1, int $$2, S $$3, float $$4, float $$5) {
      cys $$6 = $$3.W;
      dhb $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         ale $$8 = a($$3);
         gez $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hkf.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static ale a(hcg $$0) {
      if ($$0 instanceof hdb $$1) {
         hja $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.ay) {
            return $$2.c();
         }
      }

      return null;
   }
}
