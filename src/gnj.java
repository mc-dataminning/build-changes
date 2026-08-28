public class gnj extends gnh<cfz, fvo<cfz>> {
   private static final ale a = new ale("textures/entity/sheep/sheep_fur.png");
   private final fvn<cfz> b;

   public gnj(gkr<cfz, fvo<cfz>> $$0, fwu $$1) {
      super($$0);
      this.b = new fvn<>($$1.a(fwx.bi));
   }

   public void a(ezw $$0, gdm $$1, int $$2, cfz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.ch()) {
            ffd $$10 = ffd.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               faa $$12 = $$1.getBuffer(gdu.r(a));
               this.b.a($$0, $$12, $$2, gjw.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ag() && "jeb_".equals($$3.af().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.al();
               int $$15 = ctg.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               float[] $$19 = cfz.a(ctg.a($$16));
               float[] $$20 = cfz.a(ctg.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cfz.a($$3.u());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
