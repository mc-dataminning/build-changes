public class gho extends ghm<cca, fpv<cca>> {
   private static final ajh a = new ajh("textures/entity/sheep/sheep_fur.png");
   private final fpu<cca> b;

   public gho(gew<cca, fpv<cca>> $$0, frb $$1) {
      super($$0);
      this.b = new fpu<>($$1.a(fre.bi));
   }

   public void a(eub $$0, fxs $$1, int $$2, cca $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.ce()) {
            ezi $$10 = ezi.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               euf $$12 = $$1.getBuffer(fya.r(a));
               this.b.a($$0, $$12, $$2, gec.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ae() && "jeb_".equals($$3.ad().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.aj();
               int $$15 = cpd.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = cca.a(cpd.a($$16));
               float[] $$20 = cca.a(cpd.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cca.a($$3.s());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
