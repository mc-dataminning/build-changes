public class fyw extends fyj<cvg> {
   private static final alg G = alg.b("container/crafter/disabled_slot");
   private static final alg H = alg.b("container/crafter/powered_redstone");
   private static final alg I = alg.b("container/crafter/unpowered_redstone");
   private static final alg J = alg.b("textures/gui/container/crafter.png");
   private static final wy K = wy.c("gui.togglable_slot");
   private final cqy L;

   public fyw(cvg $$0, cqx $$1, wy $$2) {
      super($$0, $$1, $$2);
      this.L = $$1.k;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected void a(cwn $$0, int $$1, int $$2, cvb $$3) {
      if ($$0 instanceof cvh && !$$0.h() && !this.L.U_()) {
         switch ($$3) {
            case a:
               if (this.z.e($$1)) {
                  this.a($$1);
               } else if (this.z.g().f()) {
                  this.b($$1);
               }
               break;
            case c:
               cyy $$4 = this.L.gi().a($$2);
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
      this.L.a(awn.Bs.a(), 0.4F, $$2);
   }

   @Override
   public void a(fro $$0, cwn $$1) {
      if ($$1 instanceof cvh $$2 && this.z.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fro $$0, cvh $$1) {
      $$0.a(gqc::H, G, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0);
      this.a($$0, $$1, $$2);
      if (this.B instanceof cvh && !this.z.e(this.B.d) && this.z.g().f() && !this.B.h() && !this.L.U_()) {
         $$0.a(this.p, K, $$1, $$2);
      }
   }

   private void d(fro $$0) {
      int $$1 = this.n / 2 + 9;
      int $$2 = this.o / 2 - 48;
      alg $$3;
      if (this.z.l()) {
         $$3 = H;
      } else {
         $$3 = I;
      }

      $$0.a(gqc::H, $$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fro $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gqc::H, J, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
