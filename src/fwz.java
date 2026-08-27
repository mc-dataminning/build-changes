public class fwz extends fyw {
   private final ela b;
   protected boolean a;

   fwz(fuq $$0, double $$1, double $$2, double $$3, ela $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ela g() {
      return this.b;
   }

   @Override
   public fya b() {
      return fya.b;
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
            if (this.b != elc.a) {
               id $$0 = id.a(this.g, this.h, this.i);
               elb $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cym)this.c, $$0))) {
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

   public static fyw a(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.b($$1, $$2, $$3, $$4, elc.c, kn.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyw b(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.e($$1, $$2, $$3, $$4, elc.c, kn.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyw c(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fwz.a($$1, $$2, $$3, $$4, elc.e, kn.k);
   }

   public static fyw d(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.e($$1, $$2, $$3, $$4, elc.e, kn.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fyw e(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.c($$1, $$2, $$3, $$4, elc.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fyw f(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz.b $$8 = new fwz.b($$1, $$2, $$3, $$4, elc.a, kn.au);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fyw g(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.g($$1, $$2, $$3, $$4, elc.a, kn.av);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fyw h(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.c($$1, $$2, $$3, $$4, elc.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fyw i(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.b($$1, $$2, $$3, $$4, elc.c, kn.aM);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyw j(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.d($$1, $$2, $$3, $$4, elc.c, kn.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fyw k(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fwz.a($$1, $$2, $$3, $$4, elc.e, kn.aK);
   }

   public static fyw l(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.d($$1, $$2, $$3, $$4, elc.e, kn.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fyw m(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.f($$1, $$2, $$3, $$4, elc.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fyw n(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / axm.b($$1.E_(), 0.1F, 0.9F));
      fwz $$9 = new fwz.f($$1, $$2, $$3, $$4, elc.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fyw o(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz.b $$8 = new fwz.b($$1, $$2, $$3, $$4, elc.a, kn.aD);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fyw p(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.e($$1, $$2, $$3, $$4, elc.a, kn.aE);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fyw q(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fwz $$8 = new fwz.c($$1, $$2, $$3, $$4, elc.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fwz.b {
      a(fuq $$0, double $$1, double $$2, double $$3, ela $$4, kl $$5) {
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

   static class b extends fwz {
      private final kl b;

      b(fuq $$0, double $$1, double $$2, double $$3, ela $$4, kl $$5) {
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

   static class c extends fwz {
      c(fuq $$0, double $$1, double $$2, double $$3, ela $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fwz.e {
      d(fuq $$0, double $$1, double $$2, double $$3, ela $$4, kl $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aun $$0 = this.g() == elc.e ? auo.hs : auo.ht;
            float $$1 = axm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aup.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fwz.f {
      protected final kl b;

      e(fuq $$0, double $$1, double $$2, double $$3, ela $$4, kl $$5) {
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

   static class f extends fwz {
      f(fuq $$0, double $$1, double $$2, double $$3, ela $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fuq $$0, double $$1, double $$2, double $$3, ela $$4, int $$5) {
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

   static class g extends fwz.e {
      g(fuq $$0, double $$1, double $$2, double $$3, ela $$4, kl $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = axm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, auo.bU, aup.e, $$0, 1.0F, false);
         }
      }
   }
}
