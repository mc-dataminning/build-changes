import javax.annotation.Nullable;

public class hcv<S extends hev, M extends ghn<S>> extends hcj<S, M> {
   private final ghj a;
   private final ghj b;
   private final hbu c;

   public hcv(gzs<S, M> $$0, gkn $$1, hbu $$2) {
      super($$0);
      this.a = new ghj($$1.a(gkq.aP));
      this.b = new ghj($$1.a(gkq.aQ));
      this.c = $$2;
   }

   public void a(fld $$0, grn $$1, int $$2, S $$3, float $$4, float $$5) {
      dak $$6 = $$3.Z;
      dit $$7 = $$6.a(kl.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         alr $$8 = a($$3);
         ghj $$9 = $$3.am ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hmw.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alr a(hev $$0) {
      if ($$0 instanceof hfq $$1) {
         hls $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.aB) {
            return $$2.c();
         }
      }

      return null;
   }
}
