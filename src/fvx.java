public class fvx extends fux<ctc> {
   private static final aku G = aku.b("container/slot");
   private static final aku H = aku.b("container/horse/chest_slots");
   private static final aku I = aku.b("textures/gui/container/horse.png");
   private final cja J;
   private final int K;
   private float L;
   private float M;

   public fvx(ctc $$0, cou $$1, cja $$2, int $$3) {
      super($$0, $$1, $$2.p_());
      this.J = $$2;
      this.K = $$3;
   }

   @Override
   protected void a(fob $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmf::H, I, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.K > 0) {
         $$0.a(gmf::H, H, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.K * 18, 54);
      }

      if (this.J.f()) {
         this.c($$0, $$4 + 7, $$5 + 35 - 18);
      }

      if (this.J.e(bur.g)) {
         this.c($$0, $$4 + 7, $$5 + 35);
      }

      fvy.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.L, this.M, this.J);
   }

   private void c(fob $$0, int $$1, int $$2) {
      $$0.a(gmf::H, G, $$1, $$2, 18, 18);
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      this.L = (float)$$1;
      this.M = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}
