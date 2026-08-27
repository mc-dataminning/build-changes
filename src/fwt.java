public class fwt extends fwr<bve, fga<bve>> {
   private static final aep a = new aep("textures/entity/sheep/sheep_fur.png");
   private final ffz<bve> b;

   public fwt(fue<bve, fga<bve>> $$0, fhf $$1) {
      super($$0);
      this.b = new ffz<>($$1.a(fhi.bc));
   }

   public void a(elh $$0, fng $$1, int $$2, bve $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.t()) {
         if ($$3.cd()) {
            eqn $$10 = eqn.N();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               ell $$12 = $$1.getBuffer(fno.p(a));
               this.b.a($$0, $$12, $$2, ftk.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.ac() && "jeb_".equals($$3.ab().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ah / 25 + $$3.ah();
               int $$15 = chk.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ah % 25) + $$6) / 25.0F;
               float[] $$19 = bve.a(chk.a($$16));
               float[] $$20 = bve.a(chk.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = bve.a($$3.q());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
