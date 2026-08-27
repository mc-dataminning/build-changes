public class gpk extends gpi<cfa, fxi<cfa>> {
   private static final akt a = new akt("textures/entity/sheep/sheep_fur.png");
   private static final akt b = glt.a(a);
   private final fxh<cfa> c;

   public gpk(gmp<cfa, fxi<cfa>> $$0, fyo $$1) {
      super($$0);
      this.c = new fxh<>($$1.a(fyr.bm));
   }

   public void a(fbc $$0, gfg $$1, int $$2, cfa $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.x()) {
         if ($$3.cm()) {
            fgj $$10 = fgj.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.c);
               this.c.a($$3, $$4, $$5, $$6);
               this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
               fbg $$12 = $$1.getBuffer(gfo.r(a));
               this.c.a($$0, $$12, $$2, glt.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ag() && "jeb_".equals($$3.af().getString())) {
               int $$13 = 25;
               int $$14 = $$3.am / 25 + $$3.al();
               int $$15 = csy.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.am % 25) + $$6) / 25.0F;
               float[] $$19 = $$3.a(csy.a($$16));
               float[] $$20 = $$3.a(csy.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = $$3.a($$3.t());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.c, $$3.dV() ? b : a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
