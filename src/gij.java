public class gij extends gki {
   private final esz b;
   protected boolean a;

   gij(gga $$0, double $$1, double $$2, double $$3, esz $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected esz g() {
      return this.b;
   }

   @Override
   public gjm b() {
      return gjm.b;
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
            if (this.b != etb.a) {
               ji $$0 = ji.a(this.g, this.h, this.i);
               eta $$1 = this.c.b_($$0);
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

   public static gki a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.b($$1, $$2, $$3, $$4, etb.c, lt.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gki b(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.e($$1, $$2, $$3, $$4, etb.c, lt.ao);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gki c(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gij.a($$1, $$2, $$3, $$4, etb.e, lt.j);
   }

   public static gki d(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.e($$1, $$2, $$3, $$4, etb.e, lt.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gki e(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.c($$1, $$2, $$3, $$4, etb.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gki f(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij.b $$8 = new gij.b($$1, $$2, $$3, $$4, etb.a, lt.ay);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gki g(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.g($$1, $$2, $$3, $$4, etb.a, lt.az);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gki h(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.c($$1, $$2, $$3, $$4, etb.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gki i(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.b($$1, $$2, $$3, $$4, etb.c, lt.aQ);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gki j(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.d($$1, $$2, $$3, $$4, etb.c, lt.ao);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gki k(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gij.a($$1, $$2, $$3, $$4, etb.e, lt.aO);
   }

   public static gki l(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.d($$1, $$2, $$3, $$4, etb.e, lt.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gki m(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.f($$1, $$2, $$3, $$4, etb.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gki n(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayz.b($$1.H_(), 0.1F, 0.9F));
      gij $$9 = new gij.f($$1, $$2, $$3, $$4, etb.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gki o(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij.b $$8 = new gij.b($$1, $$2, $$3, $$4, etb.a, lt.aH);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gki p(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.e($$1, $$2, $$3, $$4, etb.a, lt.aI);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gki q(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gij $$8 = new gij.c($$1, $$2, $$3, $$4, etb.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gij.b {
      a(gga $$0, double $$1, double $$2, double $$3, esz $$4, lr $$5) {
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

   static class b extends gij {
      private final lr b;

      b(gga $$0, double $$1, double $$2, double $$3, esz $$4, lr $$5) {
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

   static class c extends gij {
      c(gga $$0, double $$1, double $$2, double $$3, esz $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gij.e {
      d(gga $$0, double $$1, double $$2, double $$3, esz $$4, lr $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avz $$0 = this.g() == etb.e ? awa.hS : awa.hT;
            float $$1 = ayz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awb.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gij.f {
      protected final lr b;

      e(gga $$0, double $$1, double $$2, double $$3, esz $$4, lr $$5) {
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

   static class f extends gij {
      f(gga $$0, double $$1, double $$2, double $$3, esz $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gga $$0, double $$1, double $$2, double $$3, esz $$4, int $$5) {
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

   static class g extends gij.e {
      g(gga $$0, double $$1, double $$2, double $$3, esz $$4, lr $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ayz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awa.bU, awb.e, $$0, 1.0F, false);
         }
      }
   }
}
