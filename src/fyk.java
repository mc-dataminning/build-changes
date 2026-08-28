public class fyk extends fxx<cva> {
   private static final ale G = ale.b("container/crafter/disabled_slot");
   private static final ale H = ale.b("container/crafter/powered_redstone");
   private static final ale I = ale.b("container/crafter/unpowered_redstone");
   private static final ale J = ale.b("textures/gui/container/crafter.png");
   private static final ww K = ww.c("gui.togglable_slot");
   private final cqs L;

   public fyk(cva $$0, cqr $$1, ww $$2) {
      super($$0, $$1, $$2);
      this.L = $$1.k;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected void a(cwh $$0, int $$1, int $$2, cuv $$3) {
      if ($$0 instanceof cvb && !$$0.h() && !this.L.U_()) {
         switch ($$3) {
            case a:
               if (this.z.e($$1)) {
                  this.a($$1);
               } else if (this.z.g().f()) {
                  this.b($$1);
               }
               break;
            case c:
               cys $$4 = this.L.gi().a($$2);
               if (this.z.e($$1) && !$$4.f()) {
                  this.a($$1);
               }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(int $$0) {
      this.a($$0, true);
   }

   private void b(int $$0) {
      this.a($$0, false);
   }

   private void a(int $$0, boolean $$1) {
      this.z.a($$0, $$1);
      super.a($$0, this.z.l, $$1);
      float $$2 = $$1 ? 1.0F : 0.75F;
      this.L.a(awl.Bp.a(), 0.4F, $$2);
   }

   @Override
   public void a(frc $$0, cwh $$1) {
      if ($$1 instanceof cvb $$2 && this.z.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(frc $$0, cvb $$1) {
      $$0.a(gpn::H, G, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0);
      this.a($$0, $$1, $$2);
      if (this.B instanceof cvb && !this.z.e(this.B.d) && this.z.g().f() && !this.B.h() && !this.L.U_()) {
         $$0.a(this.p, K, $$1, $$2);
      }
   }

   private void d(frc $$0) {
      int $$1 = this.n / 2 + 9;
      int $$2 = this.o / 2 - 48;
      ale $$3;
      if (this.z.l()) {
         $$3 = H;
      } else {
         $$3 = I;
      }

      $$0.a(gpn::H, $$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(frc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gpn::H, J, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
