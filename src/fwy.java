public class fwy extends fww<bvg, fge<bvg>> {
   private static final aer a = new aer("textures/entity/sheep/sheep_fur.png");
   private final fgd<bvg> b;

   public fwy(fuj<bvg, fge<bvg>> $$0, fhj $$1) {
      super($$0);
      this.b = new fgd<>($$1.a(fhm.bc));
   }

   public void a(elg $$0, fnl $$1, int $$2, bvg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.t()) {
         if ($$3.cd()) {
            eqm $$10 = eqm.O();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               elk $$12 = $$1.getBuffer(fnt.q(a));
               this.b.a($$0, $$12, $$2, ftp.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ac() && "jeb_".equals($$3.ab().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.ah();
               int $$15 = chm.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = bvg.a(chm.a($$16));
               float[] $$20 = bvg.a(chm.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = bvg.a($$3.q());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
