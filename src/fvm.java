public class fvm extends fuz<csr> {
   private static final akv G = akv.b("container/crafter/disabled_slot");
   private static final akv H = akv.b("container/crafter/powered_redstone");
   private static final akv I = akv.b("container/crafter/unpowered_redstone");
   private static final akv J = akv.b("textures/gui/container/crafter.png");
   private static final wp K = wp.c("gui.togglable_slot");
   private final cow L;

   public fvm(csr $$0, cov $$1, wp $$2) {
      super($$0, $$1, $$2);
      this.L = $$1.k;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected void a(cty $$0, int $$1, int $$2, csm $$3) {
      if ($$0 instanceof css && !$$0.h() && !this.L.Z_()) {
         switch ($$3) {
            case a:
               if (this.z.e($$1)) {
                  this.a($$1);
               } else if (this.z.g().f()) {
                  this.b($$1);
               }
               break;
            case c:
               cwo $$4 = this.L.gi().a($$2);
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
      this.L.a(awa.Bf.a(), 0.4F, $$2);
   }

   @Override
   public void a(fod $$0, cty $$1) {
      if ($$1 instanceof css $$2 && this.z.e($$1.d)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(fod $$0, css $$1) {
      $$0.a(gmh::H, G, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0);
      this.a($$0, $$1, $$2);
      if (this.B instanceof css && !this.z.e(this.B.d) && this.z.g().f() && !this.B.h() && !this.L.Z_()) {
         $$0.a(this.p, K, $$1, $$2);
      }
   }

   private void d(fod $$0) {
      int $$1 = this.n / 2 + 9;
      int $$2 = this.o / 2 - 48;
      akv $$3;
      if (this.z.l()) {
         $$3 = H;
      } else {
         $$3 = I;
      }

      $$0.a(gmh::H, $$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fod $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmh::H, J, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
