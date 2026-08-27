public class fwt extends fvw<can> {
   private static final float a = 0.15F;
   private static final int f = 48;
   private static final int g = 32;
   private static final int h = 16;
   private static final int i = 1;
   private static final float j = 0.0F;
   private static final float k = 0.0F;
   private static final float l = 0.09375F;
   private final fwv m;
   private final ats n = ats.a();

   public fwt(fvx.a $$0) {
      super($$0);
      this.m = $$0.b();
      this.d = 0.15F;
      this.e = 0.75F;
   }

   private int a(clj $$0) {
      int $$1 = 1;
      if ($$0.L() > 48) {
         $$1 = 5;
      } else if ($$0.L() > 32) {
         $$1 = 4;
      } else if ($$0.L() > 16) {
         $$1 = 3;
      } else if ($$0.L() > 1) {
         $$1 = 2;
      }

      return $$1;
   }

   public void a(can $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      clj $$6 = $$0.q();
      int $$7 = $$6.b() ? 187 : cle.a($$6.d()) + $$6.k();
      this.n.b((long)$$7);
      gdv $$8 = this.m.a($$6, $$0.dN(), null, $$0.aj());
      boolean $$9 = $$8.b();
      int $$10 = this.a($$6);
      float $$11 = 0.25F;
      float $$12 = atm.a(((float)$$0.s() + $$2) / 10.0F + $$0.b) * 0.1F + 0.1F;
      float $$13 = $$8.f().a(clg.h).d.y();
      $$3.a(0.0F, $$12 + 0.25F * $$13, 0.0F);
      float $$14 = $$0.a($$2);
      $$3.a(a.d.rotation($$14));
      float $$15 = $$8.f().h.d.x();
      float $$16 = $$8.f().h.d.y();
      float $$17 = $$8.f().h.d.z();
      if (!$$9) {
         float $$18 = -0.0F * (float)($$10 - 1) * 0.5F * $$15;
         float $$19 = -0.0F * (float)($$10 - 1) * 0.5F * $$16;
         float $$20 = -0.09375F * (float)($$10 - 1) * 0.5F * $$17;
         $$3.a($$18, $$19, $$20);
      }

      for (int $$21 = 0; $$21 < $$10; $$21++) {
         $$3.a();
         if ($$21 > 0) {
            if ($$9) {
               float $$22 = (this.n.i() * 2.0F - 1.0F) * 0.15F;
               float $$23 = (this.n.i() * 2.0F - 1.0F) * 0.15F;
               float $$24 = (this.n.i() * 2.0F - 1.0F) * 0.15F;
               $$3.a($$22, $$23, $$24);
            } else {
               float $$25 = (this.n.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float $$26 = (this.n.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               $$3.a($$25, $$26, 0.0F);
            }
         }

         this.m.a($$6, clg.h, false, $$3, $$4, $$5, gbl.d, $$8);
         $$3.b();
         if (!$$9) {
            $$3.a(0.0F * $$15, 0.0F * $$16, 0.09375F * $$17);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(can $$0) {
      return gbt.e;
   }
}
