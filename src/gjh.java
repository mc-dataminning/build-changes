public class gjh extends glg {
   private final etv b;
   protected boolean a;

   gjh(ggy $$0, double $$1, double $$2, double $$3, etv $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected etv g() {
      return this.b;
   }

   @Override
   public gkk b() {
      return gkk.b;
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
               ji $$0 = ji.a(this.g, this.h, this.i);
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

   public static glg a(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.b($$1, $$2, $$3, $$4, etx.c, lt.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static glg b(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.e($$1, $$2, $$3, $$4, etx.c, lt.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static glg c(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gjh.a($$1, $$2, $$3, $$4, etx.e, lt.j);
   }

   public static glg d(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.e($$1, $$2, $$3, $$4, etx.e, lt.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static glg e(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.c($$1, $$2, $$3, $$4, etx.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static glg f(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh.b $$8 = new gjh.b($$1, $$2, $$3, $$4, etx.a, lt.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static glg g(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.g($$1, $$2, $$3, $$4, etx.a, lt.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static glg h(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.c($$1, $$2, $$3, $$4, etx.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static glg i(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.b($$1, $$2, $$3, $$4, etx.c, lt.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static glg j(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.d($$1, $$2, $$3, $$4, etx.c, lt.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static glg k(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gjh.a($$1, $$2, $$3, $$4, etx.e, lt.aP);
   }

   public static glg l(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.d($$1, $$2, $$3, $$4, etx.e, lt.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static glg m(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.f($$1, $$2, $$3, $$4, etx.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static glg n(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayz.b($$1.C_(), 0.1F, 0.9F));
      gjh $$9 = new gjh.f($$1, $$2, $$3, $$4, etx.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static glg o(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh.b $$8 = new gjh.b($$1, $$2, $$3, $$4, etx.a, lt.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static glg p(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.e($$1, $$2, $$3, $$4, etx.a, lt.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static glg q(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gjh $$8 = new gjh.c($$1, $$2, $$3, $$4, etx.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gjh.b {
      a(ggy $$0, double $$1, double $$2, double $$3, etv $$4, lr $$5) {
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

   static class b extends gjh {
      private final lr b;

      b(ggy $$0, double $$1, double $$2, double $$3, etv $$4, lr $$5) {
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

   static class c extends gjh {
      c(ggy $$0, double $$1, double $$2, double $$3, etv $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gjh.e {
      d(ggy $$0, double $$1, double $$2, double $$3, etv $$4, lr $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avz $$0 = this.g() == etx.e ? awa.hS : awa.hT;
            float $$1 = ayz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awb.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gjh.f {
      protected final lr b;

      e(ggy $$0, double $$1, double $$2, double $$3, etv $$4, lr $$5) {
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

   static class f extends gjh {
      f(ggy $$0, double $$1, double $$2, double $$3, etv $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(ggy $$0, double $$1, double $$2, double $$3, etv $$4, int $$5) {
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

   static class g extends gjh.e {
      g(ggy $$0, double $$1, double $$2, double $$3, etv $$4, lr $$5) {
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
