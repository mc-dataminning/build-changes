public class gbu extends gau<cwu> {
   private static final alk G = alk.b("container/slot");
   private static final alk H = alk.b("container/horse/chest_slots");
   private static final alk I = alk.b("textures/gui/container/horse.png");
   private final clv J;
   private final int K;
   private float L;
   private float M;

   public gbu(cwu $$0, cry $$1, clv $$2, int $$3) {
      super($$0, $$1, $$2.m_());
      this.J = $$2;
      this.K = $$3;
   }

   @Override
   protected void a(ftz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gsn::H, I, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.K > 0) {
         $$0.a(gsn::H, H, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.K * 18, 54);
      }

      if (this.J.e(bxf.h) && this.J.an().a(axj.J)) {
         this.c($$0, $$4 + 7, $$5 + 35 - 18);
      }

      boolean $$6 = this.J instanceof cly;
      if (this.J.e(bxf.g) && (this.J.an().a(axj.K) || $$6)) {
         this.c($$0, $$4 + 7, $$5 + 35);
      }

      gbv.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.L, this.M, this.J);
   }

   private void c(ftz $$0, int $$1, int $$2) {
      $$0.a(gsn::H, G, $$1, $$2, 18, 18);
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      this.L = (float)$$1;
      this.M = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}
