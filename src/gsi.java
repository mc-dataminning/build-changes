public class gsi extends gsa<cpk, gyp> {
   private static final aku a = aku.b("textures/entity/fishing_hook.png");
   private static final gmf b = gmf.f(a);
   private static final double h = 960.0;

   public gsi(gsb.a $$0) {
      super($$0);
   }

   public boolean a(cpk $$0, gpn $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) && $$0.m() != null;
   }

   public void a(gyp $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.a();
      $$1.b(0.5F, 0.5F, 0.5F);
      $$1.a(this.e.b());
      ffs.a $$4 = $$1.c();
      ffw $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      float $$6 = (float)$$0.a.d;
      float $$7 = (float)$$0.a.e;
      float $$8 = (float)$$0.a.f;
      ffw $$9 = $$2.getBuffer(gmf.A());
      ffs.a $$10 = $$1.c();
      int $$11 = 16;

      for (int $$12 = 0; $$12 <= 16; $$12++) {
         a($$6, $$7, $$8, $$9, $$10, a($$12, 16), a($$12 + 1, 16));
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public static buz a(cov $$0) {
      return $$0.eZ().h() instanceof cvw ? $$0.fy() : $$0.fy().e();
   }

   private fay a(cov $$0, float $$1, float $$2) {
      int $$3 = a($$0) == buz.b ? 1 : -1;
      if (this.e.d.aE().a() && $$0 == flh.Q().t) {
         double $$11 = 960.0 / (double)this.e.d.ak().c().intValue();
         fay $$12 = this.e.b.j().a((float)$$3 * 0.525F, -0.1F).c($$11).b($$1 * 0.5F).a(-$$1 * 0.7F);
         return $$0.m($$2).e($$12);
      } else {
         float $$4 = ayy.h($$2, $$0.aY, $$0.aX) * (float) (Math.PI / 180.0);
         double $$5 = (double)ayy.a($$4);
         double $$6 = (double)ayy.b($$4);
         float $$7 = $$0.ek();
         double $$8 = (double)$$3 * 0.35 * (double)$$7;
         double $$9 = 0.8 * (double)$$7;
         float $$10 = $$0.ci() ? -0.1875F : 0.0F;
         return $$0.m($$2).b(-$$6 * $$8 - $$5 * $$9, (double)$$10 - 0.45 * (double)$$7, -$$5 * $$8 + $$6 * $$9);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(ffw $$0, ffs.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hec.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   private static void a(float $$0, float $$1, float $$2, ffw $$3, ffs.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = ayy.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(-16777216).b($$4, $$10, $$11, $$12);
   }

   public gyp a() {
      return new gyp();
   }

   public void a(cpk $$0, gyp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cov $$3 = $$0.m();
      if ($$3 == null) {
         $$1.a = fay.c;
      } else {
         float $$4 = $$3.D($$2);
         float $$5 = ayy.a(ayy.c($$4) * (float) Math.PI);
         fay $$6 = this.a($$3, $$5, $$2);
         fay $$7 = $$0.o($$2).b(0.0, 0.25, 0.0);
         $$1.a = $$6.d($$7);
      }
   }

   protected boolean a(cpk $$0) {
      return false;
   }
}
