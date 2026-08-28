public class gnq extends gni<coj, gtt> {
   private static final alc a = alc.b("textures/entity/fishing_hook.png");
   private static final ghq b = ghq.e(a);
   private static final double h = 960.0;

   public gnq(gnj.a $$0) {
      super($$0);
   }

   public boolean a(coj $$0, gkx $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) && $$0.o() != null;
   }

   public void a(gtt $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.a();
      $$1.b(0.5F, 0.5F, 0.5F);
      $$1.a(this.e.b());
      fde.a $$4 = $$1.c();
      fdi $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      float $$6 = (float)$$0.a.d;
      float $$7 = (float)$$0.a.e;
      float $$8 = (float)$$0.a.f;
      fdi $$9 = $$2.getBuffer(ghq.z());
      fde.a $$10 = $$1.c();
      int $$11 = 16;

      for (int $$12 = 0; $$12 <= 16; $$12++) {
         a($$6, $$7, $$8, $$9, $$10, a($$12, 16), a($$12 + 1, 16));
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private eys a(cnu $$0, float $$1, float $$2) {
      int $$3 = $$0.fu() == bue.b ? 1 : -1;
      cvp $$4 = $$0.eW();
      if (!$$4.a(cvt.qW)) {
         $$3 = -$$3;
      }

      if (this.e.d.aD().a() && $$0 == fil.Q().t) {
         double $$12 = 960.0 / (double)this.e.d.aj().c().intValue();
         eys $$13 = this.e.b.j().a((float)$$3 * 0.525F, -0.1F).c($$12).b($$1 * 0.5F).a(-$$1 * 0.7F);
         return $$0.m($$2).e($$13);
      } else {
         float $$5 = azd.h($$2, $$0.aU, $$0.aT) * (float) (Math.PI / 180.0);
         double $$6 = (double)azd.a($$5);
         double $$7 = (double)azd.b($$5);
         float $$8 = $$0.ef();
         double $$9 = (double)$$3 * 0.35 * (double)$$8;
         double $$10 = 0.8 * (double)$$8;
         float $$11 = $$0.cf() ? -0.1875F : 0.0F;
         return $$0.m($$2).b(-$$7 * $$9 - $$6 * $$10, (double)$$11 - 0.45 * (double)$$8, -$$6 * $$9 + $$7 * $$10);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(fdi $$0, fde.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gws.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   private static void a(float $$0, float $$1, float $$2, fdi $$3, fde.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = azd.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(-16777216).b($$4, $$10, $$11, $$12);
   }

   public alc a(gtt $$0) {
      return a;
   }

   public gtt a() {
      return new gtt();
   }

   public void a(coj $$0, gtt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cnu $$3 = $$0.o();
      if ($$3 == null) {
         $$1.a = eys.c;
      } else {
         float $$4 = $$3.D($$2);
         float $$5 = azd.a(azd.c($$4) * (float) Math.PI);
         eys $$6 = this.a($$3, $$5, $$2);
         eys $$7 = $$0.o($$2).b(0.0, 0.25, 0.0);
         $$1.a = $$6.d($$7);
      }
   }

   protected boolean a(coj $$0) {
      return false;
   }
}
