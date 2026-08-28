public class fwa extends fva<cte> {
   private static final akv G = akv.b("container/slot");
   private static final akv H = akv.b("container/horse/chest_slots");
   private static final akv I = akv.b("textures/gui/container/horse.png");
   private final cjc J;
   private final int K;
   private float L;
   private float M;

   public fwa(cte $$0, cow $$1, cjc $$2, int $$3) {
      super($$0, $$1, $$2.p_());
      this.J = $$2;
      this.K = $$3;
   }

   @Override
   protected void a(foe $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmi::H, I, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.K > 0) {
         $$0.a(gmi::H, H, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.K * 18, 54);
      }

      if (this.J.f()) {
         this.c($$0, $$4 + 7, $$5 + 35 - 18);
      }

      if (this.J.e(but.g)) {
         this.c($$0, $$4 + 7, $$5 + 35);
      }

      fwb.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.L, this.M, this.J);
   }

   private void c(foe $$0, int $$1, int $$2) {
      $$0.a(gmi::H, G, $$1, $$2, 18, 18);
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      this.L = (float)$$1;
      this.M = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}
