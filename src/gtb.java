public class gtb extends gse<cld, gzi> {
   private static final float a = 0.15F;
   private static final float b = 0.0F;
   private static final float h = 0.0F;
   private static final float i = 0.09375F;
   private final hbn j;
   private final azh k = azh.a();

   public gtb(gsf.a $$0) {
      super($$0);
      this.j = $$0.b();
      this.f = 0.15F;
      this.g = 0.75F;
   }

   public gzi a() {
      return new gzi();
   }

   public void a(cld $$0, gzi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.m() + $$2;
      $$1.d = $$0.b;
      $$1.a($$0, $$0.l(), this.j);
   }

   public void a(gzi $$0, ffv $$1, glz $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         float $$4 = 0.25F;
         float $$5 = ayz.a($$0.u / 10.0F + $$0.d) * 0.1F + 0.1F;
         float $$6 = $$0.a.f().d.y();
         $$1.a(0.0F, $$5 + 0.25F * $$6, 0.0F);
         float $$7 = cld.f($$0.u, $$0.d);
         $$1.a(a.d.rotation($$7));
         a($$1, $$2, $$3, $$0, this.k);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public static void a(ffv $$0, glz $$1, int $$2, gzg $$3, azh $$4) {
      $$4.b((long)$$3.c);
      int $$5 = $$3.b;
      hbp $$6 = $$3.a;
      boolean $$7 = $$6.d();
      float $$8 = $$6.f().d.x();
      float $$9 = $$6.f().d.y();
      float $$10 = $$6.f().d.z();
      if (!$$7) {
         float $$11 = -0.0F * (float)($$5 - 1) * 0.5F * $$8;
         float $$12 = -0.0F * (float)($$5 - 1) * 0.5F * $$9;
         float $$13 = -0.09375F * (float)($$5 - 1) * 0.5F * $$10;
         $$0.a($$11, $$12, $$13);
      }

      for (int $$14 = 0; $$14 < $$5; $$14++) {
         $$0.a();
         if ($$14 > 0) {
            if ($$7) {
               float $$15 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               float $$16 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               float $$17 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               $$0.a($$15, $$16, $$17);
            } else {
               float $$18 = ($$4.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float $$19 = ($$4.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               $$0.a($$18, $$19, 0.0F);
            }
         }

         $$6.a($$0, $$1, $$2, hej.d);
         $$0.b();
         if (!$$7) {
            $$0.a(0.0F * $$8, 0.0F * $$9, 0.09375F * $$10);
         }
      }
   }
}
