public class ghs extends gjq {
   private final etv b;
   protected boolean a;

   ghs(gfi $$0, double $$1, double $$2, double $$3, etv $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected etv g() {
      return this.b;
   }

   @Override
   public giu b() {
      return giu.b;
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
            if (this.b != etx.a) {
               jh $$0 = jh.a(this.g, this.h, this.i);
               etw $$1 = this.c.b_($$0);
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

   public static gjq a(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.b($$1, $$2, $$3, $$4, etx.c, ls.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjq b(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.e($$1, $$2, $$3, $$4, etx.c, ls.an);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjq c(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new ghs.a($$1, $$2, $$3, $$4, etx.e, ls.j);
   }

   public static gjq d(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.e($$1, $$2, $$3, $$4, etx.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gjq e(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.c($$1, $$2, $$3, $$4, etx.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gjq f(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs.b $$8 = new ghs.b($$1, $$2, $$3, $$4, etx.a, ls.ax);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gjq g(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.g($$1, $$2, $$3, $$4, etx.a, ls.ay);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gjq h(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.c($$1, $$2, $$3, $$4, etx.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gjq i(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.b($$1, $$2, $$3, $$4, etx.c, ls.aP);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjq j(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.d($$1, $$2, $$3, $$4, etx.c, ls.an);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjq k(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new ghs.a($$1, $$2, $$3, $$4, etx.e, ls.aN);
   }

   public static gjq l(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.d($$1, $$2, $$3, $$4, etx.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gjq m(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.f($$1, $$2, $$3, $$4, etx.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gjq n(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / bae.b($$1.H_(), 0.1F, 0.9F));
      ghs $$9 = new ghs.f($$1, $$2, $$3, $$4, etx.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gjq o(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs.b $$8 = new ghs.b($$1, $$2, $$3, $$4, etx.a, ls.aG);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gjq p(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.e($$1, $$2, $$3, $$4, etx.a, ls.aH);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gjq q(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      ghs $$8 = new ghs.c($$1, $$2, $$3, $$4, etx.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends ghs.b {
      a(gfi $$0, double $$1, double $$2, double $$3, etv $$4, lq $$5) {
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

   static class b extends ghs {
      private final lq b;

      b(gfi $$0, double $$1, double $$2, double $$3, etv $$4, lq $$5) {
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

   static class c extends ghs {
      c(gfi $$0, double $$1, double $$2, double $$3, etv $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends ghs.e {
      d(gfi $$0, double $$1, double $$2, double $$3, etv $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            axe $$0 = this.g() == etx.e ? axf.hR : axf.hS;
            float $$1 = bae.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, axg.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends ghs.f {
      protected final lq b;

      e(gfi $$0, double $$1, double $$2, double $$3, etv $$4, lq $$5) {
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

   static class f extends ghs {
      f(gfi $$0, double $$1, double $$2, double $$3, etv $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gfi $$0, double $$1, double $$2, double $$3, etv $$4, int $$5) {
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

   static class g extends ghs.e {
      g(gfi $$0, double $$1, double $$2, double $$3, etv $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = bae.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, axf.bU, axg.e, $$0, 1.0F, false);
         }
      }
   }
}
