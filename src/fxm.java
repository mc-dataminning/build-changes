public class fxm extends fxk<bvi, fgo<bvi>> {
   private static final aeu a = new aeu("textures/entity/sheep/sheep_fur.png");
   private final fgn<bvi> b;

   public fxm(fux<bvi, fgo<bvi>> $$0, fht $$1) {
      super($$0);
      this.b = new fgn<>($$1.a(fhw.bc));
   }

   public void a(elk $$0, fnz $$1, int $$2, bvi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.t()) {
         if ($$3.cd()) {
            eqq $$10 = eqq.O();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               elo $$12 = $$1.getBuffer(foh.q(a));
               this.b.a($$0, $$12, $$2, fud.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ac() && "jeb_".equals($$3.ab().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.ah();
               int $$15 = cho.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = bvi.a(cho.a($$16));
               float[] $$20 = bvi.a(cho.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = bvi.a($$3.q());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
