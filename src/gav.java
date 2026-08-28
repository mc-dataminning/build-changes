public class gav extends fzh<cxi> {
   private static final alg G = alg.b("container/stonecutter/scroller");
   private static final alg H = alg.b("container/stonecutter/scroller_disabled");
   private static final alg I = alg.b("container/stonecutter/recipe_selected");
   private static final alg J = alg.b("container/stonecutter/recipe_highlighted");
   private static final alg K = alg.b("container/stonecutter/recipe");
   private static final alg L = alg.b("textures/gui/container/stonecutter.png");
   private static final int M = 12;
   private static final int N = 15;
   private static final int O = 4;
   private static final int P = 3;
   private static final int Q = 16;
   private static final int R = 18;
   private static final int S = 54;
   private static final int T = 52;
   private static final int U = 14;
   private float V;
   private boolean W;
   private int X;
   private boolean Y;

   public gav(cxi $$0, crl $$1, wy $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::I);
      this.w--;
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fsm $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(grc::H, L, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      int $$6 = (int)(41.0F * this.V);
      alg $$7 = this.H() ? G : H;
      $$0.a(grc::H, $$7, $$4 + 119, $$5 + 15 + $$6, 12, 15);
      int $$8 = this.C + 52;
      int $$9 = this.D + 14;
      int $$10 = this.X + 12;
      this.a($$0, $$2, $$3, $$8, $$9, $$10);
      this.a($$0, $$8, $$9, $$10);
   }

   @Override
   protected void a(fsm $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      if (this.Y) {
         int $$3 = this.C + 52;
         int $$4 = this.D + 14;
         int $$5 = this.X + 12;
         der.b<dfe> $$6 = this.z.m();

         for (int $$7 = this.X; $$7 < $$5 && $$7 < $$6.d(); $$7++) {
            int $$8 = $$7 - this.X;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               baz $$11 = dfr.a(this.m.s);
               dfq $$12 = $$6.e().get($$7).c().b();
               $$0.b(this.p, $$12.b($$11), $$1, $$2);
            }
         }
      }
   }

   private void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.X; $$6 < $$5 && $$6 < this.z.n(); $$6++) {
         int $$7 = $$6 - this.X;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         alg $$11;
         if ($$6 == this.z.l()) {
            $$11 = I;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 = J;
         } else {
            $$11 = K;
         }

         $$0.a(grc::H, $$11, $$8, $$10 - 1, 16, 18);
      }
   }

   private void a(fsm $$0, int $$1, int $$2, int $$3) {
      der.b<dfe> $$4 = this.z.m();
      baz $$5 = dfr.a(this.m.s);

      for (int $$6 = this.X; $$6 < $$3 && $$6 < $$4.d(); $$6++) {
         int $$7 = $$6 - this.X;
         int $$8 = $$1 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$2 + $$9 * 18 + 2;
         dfq $$11 = $$4.e().get($$6).c().b();
         $$0.a($$11.b($$5), $$8, $$10);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.W = false;
      if (this.Y) {
         int $$3 = this.C + 52;
         int $$4 = this.D + 14;
         int $$5 = this.X + 12;

         for (int $$6 = this.X; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.X;
            double $$8 = $$0 - (double)($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - (double)($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.z.a(this.m.t, $$6)) {
               fpt.Q().ak().a(hnj.a(awn.BA, 1.0F));
               this.m.r.a(this.z.l, $$6);
               return true;
            }
         }

         $$3 = this.C + 119;
         $$4 = this.D + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 54)) {
            this.W = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.W && this.H()) {
         int $$5 = this.D + 14;
         int $$6 = $$5 + 54;
         this.V = ((float)$$1 - (float)$$5 - 7.5F) / ((float)($$6 - $$5) - 15.0F);
         this.V = azm.a(this.V, 0.0F, 1.0F);
         this.X = (int)((double)(this.V * (float)this.G()) + 0.5) * 4;
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else {
         if (this.H()) {
            int $$4 = this.G();
            float $$5 = (float)$$3 / (float)$$4;
            this.V = azm.a(this.V - $$5, 0.0F, 1.0F);
            this.X = (int)((double)(this.V * (float)$$4) + 0.5) * 4;
         }

         return true;
      }
   }

   private boolean H() {
      return this.Y && this.z.n() > 12;
   }

   protected int G() {
      return (this.z.n() + 4 - 1) / 4 - 3;
   }

   private void I() {
      this.Y = this.z.o();
      if (!this.Y) {
         this.V = 0.0F;
         this.X = 0;
      }
   }
}
