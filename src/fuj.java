public class fuj extends fwg {
   private final eio b;
   protected boolean a;

   fuj(fsa $$0, double $$1, double $$2, double $$3, eio $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eio g() {
      return this.b;
   }

   @Override
   public fvk b() {
      return fvk.b;
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
            if (this.b != eiq.a) {
               ib $$0 = ib.a(this.g, this.h, this.i);
               eip $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cwh)this.c, $$0))) {
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

   public static fwg a(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.b($$1, $$2, $$3, $$4, eiq.c, kc.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fwg b(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.e($$1, $$2, $$3, $$4, eiq.c, kc.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fwg c(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fuj.a($$1, $$2, $$3, $$4, eiq.e, kc.k);
   }

   public static fwg d(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.e($$1, $$2, $$3, $$4, eiq.e, kc.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fwg e(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.c($$1, $$2, $$3, $$4, eiq.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fwg f(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj.b $$8 = new fuj.b($$1, $$2, $$3, $$4, eiq.a, kc.au);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fwg g(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.g($$1, $$2, $$3, $$4, eiq.a, kc.av);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fwg h(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.c($$1, $$2, $$3, $$4, eiq.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fwg i(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.b($$1, $$2, $$3, $$4, eiq.c, kc.aM);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fwg j(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.d($$1, $$2, $$3, $$4, eiq.c, kc.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fwg k(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fuj.a($$1, $$2, $$3, $$4, eiq.e, kc.aK);
   }

   public static fwg l(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.d($$1, $$2, $$3, $$4, eiq.e, kc.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fwg m(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.f($$1, $$2, $$3, $$4, eiq.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fwg n(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / aww.b($$1.E_(), 0.1F, 0.9F));
      fuj $$9 = new fuj.f($$1, $$2, $$3, $$4, eiq.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fwg o(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj.b $$8 = new fuj.b($$1, $$2, $$3, $$4, eiq.a, kc.aD);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fwg p(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.e($$1, $$2, $$3, $$4, eiq.a, kc.aE);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fwg q(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fuj $$8 = new fuj.c($$1, $$2, $$3, $$4, eiq.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fuj.b {
      a(fsa $$0, double $$1, double $$2, double $$3, eio $$4, ka $$5) {
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

   static class b extends fuj {
      private final ka b;

      b(fsa $$0, double $$1, double $$2, double $$3, eio $$4, ka $$5) {
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

   static class c extends fuj {
      c(fsa $$0, double $$1, double $$2, double $$3, eio $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fuj.e {
      d(fsa $$0, double $$1, double $$2, double $$3, eio $$4, ka $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            atx $$0 = this.g() == eiq.e ? aty.hq : aty.hr;
            float $$1 = aww.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, atz.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fuj.f {
      protected final ka b;

      e(fsa $$0, double $$1, double $$2, double $$3, eio $$4, ka $$5) {
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

   static class f extends fuj {
      f(fsa $$0, double $$1, double $$2, double $$3, eio $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fsa $$0, double $$1, double $$2, double $$3, eio $$4, int $$5) {
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

   static class g extends fuj.e {
      g(fsa $$0, double $$1, double $$2, double $$3, eio $$4, ka $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = aww.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aty.bU, atz.e, $$0, 1.0F, false);
         }
      }
   }
}
