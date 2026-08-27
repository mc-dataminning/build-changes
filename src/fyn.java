public class fyn extends fyl<bwq, fhn<bwq>> {
   private static final afw a = new afw("textures/entity/sheep/sheep_fur.png");
   private final fhm<bwq> b;

   public fyn(fvy<bwq, fhn<bwq>> $$0, fis $$1) {
      super($$0);
      this.b = new fhm<>($$1.a(fiv.bc));
   }

   public void a(emh $$0, fpb $$1, int $$2, bwq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.y()) {
         if ($$3.cd()) {
            ero $$10 = ero.O();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               eml $$12 = $$1.getBuffer(fpj.q(a));
               this.b.a($$0, $$12, $$2, fve.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ac() && "jeb_".equals($$3.ab().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.ah();
               int $$15 = cix.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = bwq.a(cix.a($$16));
               float[] $$20 = bwq.a(cix.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = bwq.a($$3.t());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
