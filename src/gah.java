public class gah extends gaf<bxn, fjf<bxn>> {
   private static final agi a = new agi("textures/entity/sheep/sheep_fur.png");
   private final fje<bxn> b;

   public gah(fxs<bxn, fjf<bxn>> $$0, fkk $$1) {
      super($$0);
      this.b = new fje<>($$1.a(fkn.bc));
   }

   public void a(enw $$0, fqu $$1, int $$2, bxn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.A()) {
         if ($$3.ce()) {
            etd $$10 = etd.N();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               eoa $$12 = $$1.getBuffer(frc.q(a));
               this.b.a($$0, $$12, $$2, fwy.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ae() && "jeb_".equals($$3.ad().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.aj();
               int $$15 = cjx.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = bxn.a(cjx.a($$16));
               float[] $$20 = bxn.a(cjx.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = bxn.a($$3.w());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
