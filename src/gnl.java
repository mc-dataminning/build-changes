public class gnl extends gnj<cgb, fvq<cgb>> {
   private static final alf a = new alf("textures/entity/sheep/sheep_fur.png");
   private final fvp<cgb> b;

   public gnl(gkt<cgb, fvq<cgb>> $$0, fww $$1) {
      super($$0);
      this.b = new fvp<>($$1.a(fwz.bi));
   }

   public void a(ezy $$0, gdo $$1, int $$2, cgb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.ch()) {
            fff $$10 = fff.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               fac $$12 = $$1.getBuffer(gdw.r(a));
               this.b.a($$0, $$12, $$2, gjy.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ag() && "jeb_".equals($$3.af().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.al();
               int $$15 = cti.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               float[] $$19 = cgb.a(cti.a($$16));
               float[] $$20 = cgb.a(cti.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cgb.a($$3.u());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
