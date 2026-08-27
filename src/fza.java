public class fza extends gay {
   private final emt b;
   protected boolean a;

   fza(fwr $$0, double $$1, double $$2, double $$3, emt $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected emt g() {
      return this.b;
   }

   @Override
   public gac b() {
      return gac.b;
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
            if (this.b != emv.a) {
               io $$0 = io.a(this.g, this.h, this.i);
               emu $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((dad)this.c, $$0))) {
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

   public static gay a(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.b($$1, $$2, $$3, $$4, emv.c, ky.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gay b(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.e($$1, $$2, $$3, $$4, emv.c, ky.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gay c(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fza.a($$1, $$2, $$3, $$4, emv.e, ky.j);
   }

   public static gay d(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.e($$1, $$2, $$3, $$4, emv.e, ky.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gay e(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.c($$1, $$2, $$3, $$4, emv.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gay f(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza.b $$8 = new fza.b($$1, $$2, $$3, $$4, emv.a, ky.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gay g(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.g($$1, $$2, $$3, $$4, emv.a, ky.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gay h(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.c($$1, $$2, $$3, $$4, emv.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gay i(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.b($$1, $$2, $$3, $$4, emv.c, ky.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gay j(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.d($$1, $$2, $$3, $$4, emv.c, ky.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gay k(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fza.a($$1, $$2, $$3, $$4, emv.e, ky.aM);
   }

   public static gay l(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.d($$1, $$2, $$3, $$4, emv.e, ky.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gay m(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.f($$1, $$2, $$3, $$4, emv.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gay n(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayd.b($$1.E_(), 0.1F, 0.9F));
      fza $$9 = new fza.f($$1, $$2, $$3, $$4, emv.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gay o(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza.b $$8 = new fza.b($$1, $$2, $$3, $$4, emv.a, ky.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gay p(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.e($$1, $$2, $$3, $$4, emv.a, ky.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gay q(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fza $$8 = new fza.c($$1, $$2, $$3, $$4, emv.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fza.b {
      a(fwr $$0, double $$1, double $$2, double $$3, emt $$4, kw $$5) {
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

   static class b extends fza {
      private final kw b;

      b(fwr $$0, double $$1, double $$2, double $$3, emt $$4, kw $$5) {
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

   static class c extends fza {
      c(fwr $$0, double $$1, double $$2, double $$3, emt $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fza.e {
      d(fwr $$0, double $$1, double $$2, double $$3, emt $$4, kw $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avg $$0 = this.g() == emv.e ? avh.hx : avh.hy;
            float $$1 = ayd.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, avi.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fza.f {
      protected final kw b;

      e(fwr $$0, double $$1, double $$2, double $$3, emt $$4, kw $$5) {
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

   static class f extends fza {
      f(fwr $$0, double $$1, double $$2, double $$3, emt $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fwr $$0, double $$1, double $$2, double $$3, emt $$4, int $$5) {
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

   static class g extends fza.e {
      g(fwr $$0, double $$1, double $$2, double $$3, emt $$4, kw $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ayd.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avh.bU, avi.e, $$0, 1.0F, false);
         }
      }
   }
}
