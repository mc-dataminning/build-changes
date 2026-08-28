public class fyx extends fxx<cvm> {
   private static final ale G = ale.b("container/slot");
   private static final ale H = ale.b("container/horse/chest_slots");
   private static final ale I = ale.b("textures/gui/container/horse.png");
   private final ckx J;
   private final int K;
   private float L;
   private float M;

   public fyx(cvm $$0, cqr $$1, ckx $$2, int $$3) {
      super($$0, $$1, $$2.m_());
      this.J = $$2;
      this.K = $$3;
   }

   @Override
   protected void a(frc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gpn::H, I, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.K > 0) {
         $$0.a(gpn::H, H, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.K * 18, 54);
      }

      if (this.J.e(bwk.h)) {
         this.c($$0, $$4 + 7, $$5 + 35 - 18);
      }

      if (this.J.e(bwk.g) && this.J.aq().a(axd.K)) {
         this.c($$0, $$4 + 7, $$5 + 35);
      }

      fyy.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.L, this.M, this.J);
   }

   private void c(frc $$0, int $$1, int $$2) {
      $$0.a(gpn::H, G, $$1, $$2, 18, 18);
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      this.L = (float)$$1;
      this.M = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}
