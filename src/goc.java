public class goc extends goa<cfo, fwg<cfo>> {
   private static final akk a = new akk("textures/entity/sheep/sheep_fur.png");
   private final fwf<cfo> b;

   public goc(glk<cfo, fwg<cfo>> $$0, fxm $$1) {
      super($$0);
      this.b = new fwf<>($$1.a(fxp.bi));
   }

   public void a(fao $$0, gef $$1, int $$2, cfo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.x()) {
         if ($$3.cj()) {
            ffw $$10 = ffw.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               fas $$12 = $$1.getBuffer(gen.r(a));
               this.b.a($$0, $$12, $$2, gkp.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ai() && "jeb_".equals($$3.ah().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.an();
               int $$15 = csw.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               float[] $$19 = cfo.a(csw.a($$16));
               float[] $$20 = cfo.a(csw.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cfo.a($$3.t());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
