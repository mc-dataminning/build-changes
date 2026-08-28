public class gdv extends gft {
   private final eqs b;
   protected boolean a;

   gdv(gbm $$0, double $$1, double $$2, double $$3, eqs $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eqs g() {
      return this.b;
   }

   @Override
   public gex b() {
      return gex.b;
   }

   @Override
   public int a(float $$0) {
      return this.a ? 240 : super.a($$0);
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      this.h();
      if (!this.o) {
         this.k = this.k - (double)this.u;
         this.a(this.j, this.k, this.l);
         this.i();
         if (!this.o) {
            this.j *= 0.98F;
            this.k *= 0.98F;
            this.l *= 0.98F;
            if (this.b != equ.a) {
               jf $$0 = jf.a(this.g, this.h, this.i);
               eqt $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a(this.c, $$0))) {
                  this.k();
               }
            }
         }
      }
   }

   protected void h() {
      if (this.t-- <= 0) {
         this.k();
      }
   }

   protected void i() {
   }

   public static gft a(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.b($$1, $$2, $$3, $$4, equ.c, lo.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gft b(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.e($$1, $$2, $$3, $$4, equ.c, lo.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gft c(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gdv.a($$1, $$2, $$3, $$4, equ.e, lo.j);
   }

   public static gft d(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.e($$1, $$2, $$3, $$4, equ.e, lo.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gft e(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.c($$1, $$2, $$3, $$4, equ.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gft f(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv.b $$8 = new gdv.b($$1, $$2, $$3, $$4, equ.a, lo.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gft g(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.g($$1, $$2, $$3, $$4, equ.a, lo.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gft h(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.c($$1, $$2, $$3, $$4, equ.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gft i(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.b($$1, $$2, $$3, $$4, equ.c, lo.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gft j(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.d($$1, $$2, $$3, $$4, equ.c, lo.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gft k(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gdv.a($$1, $$2, $$3, $$4, equ.e, lo.aM);
   }

   public static gft l(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.d($$1, $$2, $$3, $$4, equ.e, lo.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gft m(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.f($$1, $$2, $$3, $$4, equ.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gft n(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azf.b($$1.D_(), 0.1F, 0.9F));
      gdv $$9 = new gdv.f($$1, $$2, $$3, $$4, equ.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gft o(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv.b $$8 = new gdv.b($$1, $$2, $$3, $$4, equ.a, lo.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gft p(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.e($$1, $$2, $$3, $$4, equ.a, lo.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gft q(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdv $$8 = new gdv.c($$1, $$2, $$3, $$4, equ.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gdv.b {
      a(gbm $$0, double $$1, double $$2, double $$3, eqs $$4, lm $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void h() {
         this.v = 1.0F;
         this.w = 16.0F / (float)(40 - this.t + 16);
         this.x = 4.0F / (float)(40 - this.t + 8);
         super.h();
      }
   }

   static class b extends gdv {
      private final lm b;

      b(gbm $$0, double $$1, double $$2, double $$3, eqs $$4, lm $$5) {
         super($$0, $$1, $$2, $$3, $$4);
         this.b = $$5;
         this.u *= 0.02F;
         this.t = 40;
      }

      @Override
      protected void h() {
         if (this.t-- <= 0) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, this.j, this.k, this.l);
         }
      }

      @Override
      protected void i() {
         this.j *= 0.02;
         this.k *= 0.02;
         this.l *= 0.02;
      }
   }

   static class c extends gdv {
      c(gbm $$0, double $$1, double $$2, double $$3, eqs $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gdv.e {
      d(gbm $$0, double $$1, double $$2, double $$3, eqs $$4, lm $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awf $$0 = this.g() == equ.e ? awg.hy : awg.hz;
            float $$1 = azf.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awh.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gdv.f {
      protected final lm b;

      e(gbm $$0, double $$1, double $$2, double $$3, eqs $$4, lm $$5) {
         super($$0, $$1, $$2, $$3, $$4);
         this.b = $$5;
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
         }
      }
   }

   static class f extends gdv {
      f(gbm $$0, double $$1, double $$2, double $$3, eqs $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gbm $$0, double $$1, double $$2, double $$3, eqs $$4, int $$5) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = $$5;
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
         }
      }
   }

   static class g extends gdv.e {
      g(gbm $$0, double $$1, double $$2, double $$3, eqs $$4, lm $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azf.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awg.bU, awh.e, $$0, 1.0F, false);
         }
      }
   }
}
