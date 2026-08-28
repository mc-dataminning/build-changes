public class gje extends giw<cnl> {
   private static final alf a = new alf("textures/entity/fishing_hook.png");
   private static final gdw f = gdw.d(a);
   private static final double g = 960.0;

   public gje(gix.a $$0) {
      super($$0);
   }

   public void a(cnl $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      cmx $$6 = $$0.u();
      if ($$6 != null) {
         $$3.a();
         $$3.a();
         $$3.b(0.5F, 0.5F, 0.5F);
         $$3.a(this.c.b());
         $$3.a(a.d.rotationDegrees(180.0F));
         ezy.a $$7 = $$3.c();
         fac $$8 = $$4.getBuffer(f);
         a($$8, $$7, $$5, 0.0F, 0, 0, 1);
         a($$8, $$7, $$5, 1.0F, 0, 1, 1);
         a($$8, $$7, $$5, 1.0F, 1, 1, 0);
         a($$8, $$7, $$5, 0.0F, 1, 0, 0);
         $$3.b();
         float $$9 = $$6.z($$2);
         float $$10 = ayz.a(ayz.c($$9) * (float) Math.PI);
         evr $$11 = this.a($$6, $$10, $$2);
         evr $$12 = $$0.l($$2).b(0.0, 0.25, 0.0);
         float $$13 = (float)($$11.c - $$12.c);
         float $$14 = (float)($$11.d - $$12.d);
         float $$15 = (float)($$11.e - $$12.e);
         fac $$16 = $$4.getBuffer(gdw.z());
         ezy.a $$17 = $$3.c();
         int $$18 = 16;

         for (int $$19 = 0; $$19 <= 16; $$19++) {
            a($$13, $$14, $$15, $$16, $$17, a($$19, 16), a($$19 + 1, 16));
         }

         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private evr a(cmx $$0, float $$1, float $$2) {
      int $$3 = $$0.fu() == btj.b ? 1 : -1;
      cup $$4 = $$0.eX();
      if (!$$4.a(cus.qV)) {
         $$3 = -$$3;
      }

      if (this.c.d.aA().a() && $$0 == fff.Q().s) {
         double $$12 = 960.0 / (double)this.c.d.ah().c().intValue();
         evr $$13 = this.c.b.j().a((float)$$3 * 0.525F, -0.1F).a($$12).b($$1 * 0.5F).a(-$$1 * 0.7F);
         return $$0.j($$2).e($$13);
      } else {
         float $$5 = ayz.i($$2, $$0.aZ, $$0.aY) * (float) (Math.PI / 180.0);
         double $$6 = (double)ayz.a($$5);
         double $$7 = (double)ayz.b($$5);
         float $$8 = $$0.ee();
         double $$9 = (double)$$3 * 0.35 * (double)$$8;
         double $$10 = 0.8 * (double)$$8;
         float $$11 = $$0.ca() ? -0.1875F : 0.0F;
         return $$0.j($$2).b(-$$7 * $$9 - $$6 * $$10, (double)$$11 - 0.45 * (double)$$8, -$$6 * $$9 + $$7 * $$10);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(fac $$0, ezy.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(255, 255, 255, 255).a((float)$$5, (float)$$6).c(goq.d).b($$2).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(float $$0, float $$1, float $$2, fac $$3, ezy.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = ayz.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(0, 0, 0, 255).b($$4, $$10, $$11, $$12).e();
   }

   public alf a(cnl $$0) {
      return a;
   }
}
