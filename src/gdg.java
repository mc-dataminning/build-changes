public class gdg extends gfe {
   private final eqa b;
   protected boolean a;

   gdg(gax $$0, double $$1, double $$2, double $$3, eqa $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eqa g() {
      return this.b;
   }

   @Override
   public gei b() {
      return gei.b;
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
            if (this.b != eqc.a) {
               je $$0 = je.a(this.g, this.h, this.i);
               eqb $$1 = this.c.b_($$0);
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

   public static gfe a(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.b($$1, $$2, $$3, $$4, eqc.c, ln.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gfe b(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.e($$1, $$2, $$3, $$4, eqc.c, ln.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gfe c(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gdg.a($$1, $$2, $$3, $$4, eqc.e, ln.j);
   }

   public static gfe d(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.e($$1, $$2, $$3, $$4, eqc.e, ln.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gfe e(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.c($$1, $$2, $$3, $$4, eqc.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gfe f(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg.b $$8 = new gdg.b($$1, $$2, $$3, $$4, eqc.a, ln.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gfe g(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.g($$1, $$2, $$3, $$4, eqc.a, ln.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gfe h(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.c($$1, $$2, $$3, $$4, eqc.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gfe i(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.b($$1, $$2, $$3, $$4, eqc.c, ln.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gfe j(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.d($$1, $$2, $$3, $$4, eqc.c, ln.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gfe k(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gdg.a($$1, $$2, $$3, $$4, eqc.e, ln.aM);
   }

   public static gfe l(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.d($$1, $$2, $$3, $$4, eqc.e, ln.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gfe m(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.f($$1, $$2, $$3, $$4, eqc.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gfe n(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azc.b($$1.C_(), 0.1F, 0.9F));
      gdg $$9 = new gdg.f($$1, $$2, $$3, $$4, eqc.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gfe o(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg.b $$8 = new gdg.b($$1, $$2, $$3, $$4, eqc.a, ln.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gfe p(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.e($$1, $$2, $$3, $$4, eqc.a, ln.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gfe q(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gdg $$8 = new gdg.c($$1, $$2, $$3, $$4, eqc.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gdg.b {
      a(gax $$0, double $$1, double $$2, double $$3, eqa $$4, ll $$5) {
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

   static class b extends gdg {
      private final ll b;

      b(gax $$0, double $$1, double $$2, double $$3, eqa $$4, ll $$5) {
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

   static class c extends gdg {
      c(gax $$0, double $$1, double $$2, double $$3, eqa $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gdg.e {
      d(gax $$0, double $$1, double $$2, double $$3, eqa $$4, ll $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awc $$0 = this.g() == eqc.e ? awd.hy : awd.hz;
            float $$1 = azc.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awe.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gdg.f {
      protected final ll b;

      e(gax $$0, double $$1, double $$2, double $$3, eqa $$4, ll $$5) {
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

   static class f extends gdg {
      f(gax $$0, double $$1, double $$2, double $$3, eqa $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gax $$0, double $$1, double $$2, double $$3, eqa $$4, int $$5) {
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

   static class g extends gdg.e {
      g(gax $$0, double $$1, double $$2, double $$3, eqa $$4, ll $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azc.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awd.bU, awe.e, $$0, 1.0F, false);
         }
      }
   }
}
