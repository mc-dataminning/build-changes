public class gyr extends gxu<coo, hfb> {
   private static final float a = 0.0625F;
   private static final float g = 0.15F;
   private static final float h = 0.0625F;
   private final hhg i;
   private final bai j = bai.a();

   public gyr(gxv.a $$0) {
      super($$0);
      this.i = $$0.b();
      this.e = 0.15F;
      this.f = 0.75F;
   }

   public hfb a() {
      return new hfb();
   }

   public void a(coo $$0, hfb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.v = (float)$$0.f() + $$2;
      $$1.d = $$0.b;
      $$1.a($$0, $$0.e(), this.i);
   }

   private static ffx a(hhi $$0) {
      ffx.a $$1 = new ffx.a();
      $$0.a($$1::a);
      return $$1.a();
   }

   public void a(hfb $$0, fld $$1, grn $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         ffx $$4 = a($$0.a);
         float $$5 = -((float)$$4.b) + 0.0625F;
         float $$6 = azz.a($$0.v / 10.0F + $$0.d) * 0.1F + 0.1F;
         $$1.a(0.0F, $$6 + $$5, 0.0F);
         float $$7 = coo.f($$0.v, $$0.d);
         $$1.a(a.d.rotation($$7));
         a($$1, $$2, $$3, $$0, this.j, $$4);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public static void a(fld $$0, grn $$1, int $$2, hez $$3, bai $$4) {
      a($$0, $$1, $$2, $$3, $$4, a($$3.a));
   }

   public static void a(fld $$0, grn $$1, int $$2, hez $$3, bai $$4, ffx $$5) {
      int $$6 = $$3.b;
      if ($$6 != 0) {
         $$4.b((long)$$3.c);
         hhi $$7 = $$3.a;
         float $$8 = (float)$$5.d();
         if ($$8 > 0.0625F) {
            $$7.a($$0, $$1, $$2, hkg.d);

            for (int $$9 = 1; $$9 < $$6; $$9++) {
               $$0.a();
               float $$10 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               float $$11 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               float $$12 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               $$0.a($$10, $$11, $$12);
               $$7.a($$0, $$1, $$2, hkg.d);
               $$0.b();
            }
         } else {
            float $$13 = $$8 * 1.5F;
            $$0.a(0.0F, 0.0F, -($$13 * (float)($$6 - 1) / 2.0F));
            $$7.a($$0, $$1, $$2, hkg.d);
            $$0.a(0.0F, 0.0F, $$13);

            for (int $$14 = 1; $$14 < $$6; $$14++) {
               $$0.a();
               float $$15 = ($$4.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float $$16 = ($$4.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               $$0.a($$15, $$16, 0.0F);
               $$7.a($$0, $$1, $$2, hkg.d);
               $$0.b();
               $$0.a(0.0F, 0.0F, $$13);
            }
         }
      }
   }
}
