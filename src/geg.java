public class geg extends gge {
   private final erd b;
   protected boolean a;

   geg(gbx $$0, double $$1, double $$2, double $$3, erd $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected erd g() {
      return this.b;
   }

   @Override
   public gfi b() {
      return gfi.b;
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
            if (this.b != erf.a) {
               jg $$0 = jg.a(this.g, this.h, this.i);
               ere $$1 = this.c.b_($$0);
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

   public static gge a(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.b($$1, $$2, $$3, $$4, erf.c, lq.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gge b(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.e($$1, $$2, $$3, $$4, erf.c, lq.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gge c(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new geg.a($$1, $$2, $$3, $$4, erf.e, lq.j);
   }

   public static gge d(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.e($$1, $$2, $$3, $$4, erf.e, lq.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gge e(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.c($$1, $$2, $$3, $$4, erf.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gge f(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg.b $$8 = new geg.b($$1, $$2, $$3, $$4, erf.a, lq.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gge g(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.g($$1, $$2, $$3, $$4, erf.a, lq.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gge h(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.c($$1, $$2, $$3, $$4, erf.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gge i(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.b($$1, $$2, $$3, $$4, erf.c, lq.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gge j(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.d($$1, $$2, $$3, $$4, erf.c, lq.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gge k(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new geg.a($$1, $$2, $$3, $$4, erf.e, lq.aM);
   }

   public static gge l(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.d($$1, $$2, $$3, $$4, erf.e, lq.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gge m(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.f($$1, $$2, $$3, $$4, erf.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gge n(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azj.b($$1.E_(), 0.1F, 0.9F));
      geg $$9 = new geg.f($$1, $$2, $$3, $$4, erf.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gge o(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg.b $$8 = new geg.b($$1, $$2, $$3, $$4, erf.a, lq.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gge p(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.e($$1, $$2, $$3, $$4, erf.a, lq.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gge q(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      geg $$8 = new geg.c($$1, $$2, $$3, $$4, erf.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends geg.b {
      a(gbx $$0, double $$1, double $$2, double $$3, erd $$4, lo $$5) {
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

   static class b extends geg {
      private final lo b;

      b(gbx $$0, double $$1, double $$2, double $$3, erd $$4, lo $$5) {
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

   static class c extends geg {
      c(gbx $$0, double $$1, double $$2, double $$3, erd $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends geg.e {
      d(gbx $$0, double $$1, double $$2, double $$3, erd $$4, lo $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awj $$0 = this.g() == erf.e ? awk.hy : awk.hz;
            float $$1 = azj.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awl.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends geg.f {
      protected final lo b;

      e(gbx $$0, double $$1, double $$2, double $$3, erd $$4, lo $$5) {
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

   static class f extends geg {
      f(gbx $$0, double $$1, double $$2, double $$3, erd $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gbx $$0, double $$1, double $$2, double $$3, erd $$4, int $$5) {
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

   static class g extends geg.e {
      g(gbx $$0, double $$1, double $$2, double $$3, erd $$4, lo $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azj.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awk.bU, awl.e, $$0, 1.0F, false);
         }
      }
   }
}
