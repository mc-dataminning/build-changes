public class gom extends gqm {
   private final exp b;
   protected boolean a;

   gom(gmd $$0, double $$1, double $$2, double $$3, exp $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected exp g() {
      return this.b;
   }

   @Override
   public gpq b() {
      return gpq.b;
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
            if (this.b != exr.a) {
               iw $$0 = iw.a(this.g, this.h, this.i);
               exq $$1 = this.c.b_($$0);
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

   public static gqm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.b($$1, $$2, $$3, $$4, exr.c, lz.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqm b(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.e($$1, $$2, $$3, $$4, exr.c, lz.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqm c(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gom.a($$1, $$2, $$3, $$4, exr.e, lz.j);
   }

   public static gqm d(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.e($$1, $$2, $$3, $$4, exr.e, lz.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gqm e(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.c($$1, $$2, $$3, $$4, exr.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gqm f(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom.b $$8 = new gom.b($$1, $$2, $$3, $$4, exr.a, lz.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gqm g(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.g($$1, $$2, $$3, $$4, exr.a, lz.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gqm h(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.c($$1, $$2, $$3, $$4, exr.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gqm i(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.b($$1, $$2, $$3, $$4, exr.c, lz.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqm j(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.d($$1, $$2, $$3, $$4, exr.c, lz.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqm k(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gom.a($$1, $$2, $$3, $$4, exr.e, lz.aP);
   }

   public static gqm l(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.d($$1, $$2, $$3, $$4, exr.e, lz.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gqm m(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.f($$1, $$2, $$3, $$4, exr.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gqm n(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azq.b($$1.G_(), 0.1F, 0.9F));
      gom $$9 = new gom.f($$1, $$2, $$3, $$4, exr.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gqm o(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom.b $$8 = new gom.b($$1, $$2, $$3, $$4, exr.a, lz.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gqm p(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.e($$1, $$2, $$3, $$4, exr.a, lz.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gqm q(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gom $$8 = new gom.c($$1, $$2, $$3, $$4, exr.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gom.b {
      a(gmd $$0, double $$1, double $$2, double $$3, exp $$4, lx $$5) {
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

   static class b extends gom {
      private final lx b;

      b(gmd $$0, double $$1, double $$2, double $$3, exp $$4, lx $$5) {
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

   static class c extends gom {
      c(gmd $$0, double $$1, double $$2, double $$3, exp $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gom.e {
      d(gmd $$0, double $$1, double $$2, double $$3, exp $$4, lx $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awq $$0 = this.g() == exr.e ? awr.hV : awr.hW;
            float $$1 = azq.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aws.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gom.f {
      protected final lx b;

      e(gmd $$0, double $$1, double $$2, double $$3, exp $$4, lx $$5) {
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

   static class f extends gom {
      f(gmd $$0, double $$1, double $$2, double $$3, exp $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gmd $$0, double $$1, double $$2, double $$3, exp $$4, int $$5) {
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

   static class g extends gom.e {
      g(gmd $$0, double $$1, double $$2, double $$3, exp $$4, lx $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azq.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awr.bU, aws.e, $$0, 1.0F, false);
         }
      }
   }
}
