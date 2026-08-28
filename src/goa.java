public class goa extends gny<cfn, fwe<cfn>> {
   private static final akk a = new akk("textures/entity/sheep/sheep_fur.png");
   private final fwd<cfn> b;

   public goa(gli<cfn, fwe<cfn>> $$0, fxk $$1) {
      super($$0);
      this.b = new fwd<>($$1.a(fxn.bi));
   }

   public void a(fam $$0, ged $$1, int $$2, cfn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.ci()) {
            fft $$10 = fft.Q();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               faq $$12 = $$1.getBuffer(gel.r(a));
               this.b.a($$0, $$12, $$2, gkn.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ah() && "jeb_".equals($$3.ag().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ai / 25 + $$3.am();
               int $$15 = csv.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ai % 25) + $$6) / 25.0F;
               float[] $$19 = cfn.a(csv.a($$16));
               float[] $$20 = cfn.a(csv.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = cfn.a($$3.u());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
