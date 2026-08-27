public class fxh extends fxf<bvf, fgj<bvf>> {
   private static final aer a = new aer("textures/entity/sheep/sheep_fur.png");
   private final fgi<bvf> b;

   public fxh(fus<bvf, fgj<bvf>> $$0, fho $$1) {
      super($$0);
      this.b = new fgi<>($$1.a(fhr.bc));
   }

   public void a(elf $$0, fnu $$1, int $$2, bvf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.t()) {
         if ($$3.cd()) {
            eql $$10 = eql.O();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               elj $$12 = $$1.getBuffer(foc.q(a));
               this.b.a($$0, $$12, $$2, fty.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ac() && "jeb_".equals($$3.ab().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.ah();
               int $$15 = chl.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = bvf.a(chl.a($$16));
               float[] $$20 = bvf.a(chl.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = bvf.a($$3.q());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
