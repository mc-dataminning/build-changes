public class gnu extends gns<cfk, fvy<cfk>> {
   private static final akk a = new akk("textures/entity/sheep/sheep_fur.png");
   private final fvx<cfk> b;

   public gnu(glc<cfk, fvy<cfk>> $$0, fxe $$1) {
      super($$0);
      this.b = new fvx<>($$1.a(fxh.bi));
   }

   public void a(fag $$0, gdx $$1, int $$2, cfk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.ch()) {
            ffn $$10 = ffn.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               fak $$12 = $$1.getBuffer(gef.r(a));
               this.b.a($$0, $$12, $$2, gkh.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ag() && "jeb_".equals($$3.af().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.al();
               int $$15 = cst.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               float[] $$19 = cfk.a(cst.a($$16));
               float[] $$20 = cfk.a(cst.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cfk.a($$3.u());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
