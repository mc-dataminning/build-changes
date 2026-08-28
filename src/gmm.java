public class gmm extends gmr<cir, gsr> {
   private static final alb a = alb.b("textures/entity/end_crystal/end_crystal.png");
   private static final ghe b = ghe.f(a);
   private final fwx h;

   public gmm(gms.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new fwx($$0.a(gaa.aw));
   }

   public void a(gsr $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, gwb.d);
      $$1.b();
      eye $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.p);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gmn.a(-$$6, -$$7 + $$5, -$$8, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azc.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public alb a(gsr $$0) {
      return a;
   }

   public gsr a() {
      return new gsr();
   }

   public void a(cir $$0, gsr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.b + $$2;
      $$1.a = $$0.o();
      je $$3 = $$0.m();
      if ($$3 != null) {
         $$1.b = eye.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cir $$0, gkh $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.m() != null;
   }
}
