public class gsd extends gsb<gvi, fze> {
   private static final ale a = ale.b("textures/entity/sheep/sheep_fur.png");
   private final fxo<gvi> b;
   private final fxo<gvi> c;

   public gsd(gpk<gvi, fze> $$0, gam $$1) {
      super($$0);
      this.b = new fzd($$1.a(gap.cf));
      this.c = new fzd($$1.a(gap.cg));
   }

   public void a(fdi $$0, ghl $$1, int $$2, gvi $$3, float $$4, float $$5) {
      if (!$$3.c) {
         fxo<gvi> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fdm $$7 = $$1.getBuffer(ghv.r(a));
               $$6.a($$0, $$7, $$2, gop.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azf.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cum.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azf.i($$3.p)) / 25.0F;
               int $$15 = cgz.a(cum.a($$12));
               int $$16 = cgz.a(cum.a($$13));
               $$17 = axq.a($$14, $$15, $$16);
            } else {
               $$17 = cgz.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
