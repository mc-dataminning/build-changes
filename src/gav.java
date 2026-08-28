public class gav extends gct {
   private final eoi b;
   protected boolean a;

   gav(fyl $$0, double $$1, double $$2, double $$3, eoi $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eoi g() {
      return this.b;
   }

   @Override
   public gbx b() {
      return gbx.b;
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
            if (this.b != eok.a) {
               ja $$0 = ja.a(this.g, this.h, this.i);
               eoj $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((dbm)this.c, $$0))) {
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

   public static gct a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.b($$1, $$2, $$3, $$4, eok.c, lj.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gct b(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.e($$1, $$2, $$3, $$4, eok.c, lj.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gct c(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gav.a($$1, $$2, $$3, $$4, eok.e, lj.j);
   }

   public static gct d(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.e($$1, $$2, $$3, $$4, eok.e, lj.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gct e(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.c($$1, $$2, $$3, $$4, eok.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gct f(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav.b $$8 = new gav.b($$1, $$2, $$3, $$4, eok.a, lj.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gct g(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.g($$1, $$2, $$3, $$4, eok.a, lj.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gct h(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.c($$1, $$2, $$3, $$4, eok.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gct i(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.b($$1, $$2, $$3, $$4, eok.c, lj.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gct j(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.d($$1, $$2, $$3, $$4, eok.c, lj.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gct k(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gav.a($$1, $$2, $$3, $$4, eok.e, lj.aM);
   }

   public static gct l(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.d($$1, $$2, $$3, $$4, eok.e, lj.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gct m(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.f($$1, $$2, $$3, $$4, eok.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gct n(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayg.b($$1.E_(), 0.1F, 0.9F));
      gav $$9 = new gav.f($$1, $$2, $$3, $$4, eok.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gct o(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav.b $$8 = new gav.b($$1, $$2, $$3, $$4, eok.a, lj.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gct p(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.e($$1, $$2, $$3, $$4, eok.a, lj.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gct q(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gav $$8 = new gav.c($$1, $$2, $$3, $$4, eok.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gav.b {
      a(fyl $$0, double $$1, double $$2, double $$3, eoi $$4, lh $$5) {
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

   static class b extends gav {
      private final lh b;

      b(fyl $$0, double $$1, double $$2, double $$3, eoi $$4, lh $$5) {
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

   static class c extends gav {
      c(fyl $$0, double $$1, double $$2, double $$3, eoi $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gav.e {
      d(fyl $$0, double $$1, double $$2, double $$3, eoi $$4, lh $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avg $$0 = this.g() == eok.e ? avh.hx : avh.hy;
            float $$1 = ayg.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, avi.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gav.f {
      protected final lh b;

      e(fyl $$0, double $$1, double $$2, double $$3, eoi $$4, lh $$5) {
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

   static class f extends gav {
      f(fyl $$0, double $$1, double $$2, double $$3, eoi $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fyl $$0, double $$1, double $$2, double $$3, eoi $$4, int $$5) {
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

   static class g extends gav.e {
      g(fyl $$0, double $$1, double $$2, double $$3, eoi $$4, lh $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ayg.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avh.bU, avi.e, $$0, 1.0F, false);
         }
      }
   }
}
