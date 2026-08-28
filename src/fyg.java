public class fyg extends fxx<cur> {
   private static final ale G = ale.b("container/brewing_stand/fuel_length");
   private static final ale H = ale.b("container/brewing_stand/brew_progress");
   private static final ale I = ale.b("container/brewing_stand/bubbles");
   private static final ale J = ale.b("textures/gui/container/brewing_stand.png");
   private static final int[] K = new int[]{29, 24, 20, 16, 11, 6, 0};

   public fyg(cur $$0, cqr $$1, ww $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(frc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gpn::H, J, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      int $$6 = this.z.l();
      int $$7 = azk.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(gpn::H, G, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
      }

      int $$8 = this.z.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - (float)$$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(gpn::H, H, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
         }

         $$9 = K[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(gpn::H, I, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
         }
      }
   }
}
