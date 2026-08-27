public class fwq extends fyn {
   private final ekr b;
   protected boolean a;

   fwq(fuh $$0, double $$1, double $$2, double $$3, ekr $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ekr g() {
      return this.b;
   }

   @Override
   public fxr b() {
      return fxr.b;
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
            if (this.b != ekt.a) {
               ib $$0 = ib.a(this.g, this.h, this.i);
               eks $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cyd)this.c, $$0))) {
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

   public static fyn a(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.b($$1, $$2, $$3, $$4, ekt.c, kl.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyn b(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.e($$1, $$2, $$3, $$4, ekt.c, kl.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyn c(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fwq.a($$1, $$2, $$3, $$4, ekt.e, kl.k);
   }

   public static fyn d(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.e($$1, $$2, $$3, $$4, ekt.e, kl.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fyn e(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.c($$1, $$2, $$3, $$4, ekt.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fyn f(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq.b $$8 = new fwq.b($$1, $$2, $$3, $$4, ekt.a, kl.au);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fyn g(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.g($$1, $$2, $$3, $$4, ekt.a, kl.av);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fyn h(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.c($$1, $$2, $$3, $$4, ekt.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fyn i(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.b($$1, $$2, $$3, $$4, ekt.c, kl.aM);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyn j(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.d($$1, $$2, $$3, $$4, ekt.c, kl.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyn k(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fwq.a($$1, $$2, $$3, $$4, ekt.e, kl.aK);
   }

   public static fyn l(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.d($$1, $$2, $$3, $$4, ekt.e, kl.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fyn m(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.f($$1, $$2, $$3, $$4, ekt.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fyn n(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / axk.b($$1.E_(), 0.1F, 0.9F));
      fwq $$9 = new fwq.f($$1, $$2, $$3, $$4, ekt.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fyn o(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq.b $$8 = new fwq.b($$1, $$2, $$3, $$4, ekt.a, kl.aD);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fyn p(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.e($$1, $$2, $$3, $$4, ekt.a, kl.aE);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fyn q(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwq $$8 = new fwq.c($$1, $$2, $$3, $$4, ekt.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fwq.b {
      a(fuh $$0, double $$1, double $$2, double $$3, ekr $$4, kj $$5) {
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

   static class b extends fwq {
      private final kj b;

      b(fuh $$0, double $$1, double $$2, double $$3, ekr $$4, kj $$5) {
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

   static class c extends fwq {
      c(fuh $$0, double $$1, double $$2, double $$3, ekr $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fwq.e {
      d(fuh $$0, double $$1, double $$2, double $$3, ekr $$4, kj $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aul $$0 = this.g() == ekt.e ? aum.hs : aum.ht;
            float $$1 = axk.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aun.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fwq.f {
      protected final kj b;

      e(fuh $$0, double $$1, double $$2, double $$3, ekr $$4, kj $$5) {
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

   static class f extends fwq {
      f(fuh $$0, double $$1, double $$2, double $$3, ekr $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fuh $$0, double $$1, double $$2, double $$3, ekr $$4, int $$5) {
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

   static class g extends fwq.e {
      g(fuh $$0, double $$1, double $$2, double $$3, ekr $$4, kj $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = axk.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aum.bU, aun.e, $$0, 1.0F, false);
         }
      }
   }
}
