public class gnx extends gpx {
   private final exz b;
   protected boolean a;

   gnx(glo $$0, double $$1, double $$2, double $$3, exz $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected exz g() {
      return this.b;
   }

   @Override
   public gpb b() {
      return gpb.b;
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
            if (this.b != eyb.a) {
               iw $$0 = iw.a(this.g, this.h, this.i);
               eya $$1 = this.c.b_($$0);
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

   public static gpx a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.b($$1, $$2, $$3, $$4, eyb.c, lz.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gpx b(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.e($$1, $$2, $$3, $$4, eyb.c, lz.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gpx c(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gnx.a($$1, $$2, $$3, $$4, eyb.e, lz.j);
   }

   public static gpx d(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.e($$1, $$2, $$3, $$4, eyb.e, lz.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gpx e(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.c($$1, $$2, $$3, $$4, eyb.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gpx f(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx.b $$8 = new gnx.b($$1, $$2, $$3, $$4, eyb.a, lz.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gpx g(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.g($$1, $$2, $$3, $$4, eyb.a, lz.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gpx h(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.c($$1, $$2, $$3, $$4, eyb.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gpx i(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.b($$1, $$2, $$3, $$4, eyb.c, lz.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gpx j(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.d($$1, $$2, $$3, $$4, eyb.c, lz.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gpx k(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gnx.a($$1, $$2, $$3, $$4, eyb.e, lz.aP);
   }

   public static gpx l(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.d($$1, $$2, $$3, $$4, eyb.e, lz.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gpx m(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.f($$1, $$2, $$3, $$4, eyb.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gpx n(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azz.b($$1.G_(), 0.1F, 0.9F));
      gnx $$9 = new gnx.f($$1, $$2, $$3, $$4, eyb.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gpx o(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx.b $$8 = new gnx.b($$1, $$2, $$3, $$4, eyb.a, lz.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gpx p(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.e($$1, $$2, $$3, $$4, eyb.a, lz.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gpx q(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gnx $$8 = new gnx.c($$1, $$2, $$3, $$4, eyb.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gnx.b {
      a(glo $$0, double $$1, double $$2, double $$3, exz $$4, lx $$5) {
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

   static class b extends gnx {
      private final lx b;

      b(glo $$0, double $$1, double $$2, double $$3, exz $$4, lx $$5) {
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

   static class c extends gnx {
      c(glo $$0, double $$1, double $$2, double $$3, exz $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gnx.e {
      d(glo $$0, double $$1, double $$2, double $$3, exz $$4, lx $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awx $$0 = this.g() == eyb.e ? awy.hV : awy.hW;
            float $$1 = azz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awz.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gnx.f {
      protected final lx b;

      e(glo $$0, double $$1, double $$2, double $$3, exz $$4, lx $$5) {
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

   static class f extends gnx {
      f(glo $$0, double $$1, double $$2, double $$3, exz $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(glo $$0, double $$1, double $$2, double $$3, exz $$4, int $$5) {
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

   static class g extends gnx.e {
      g(glo $$0, double $$1, double $$2, double $$3, exz $$4, lx $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awy.bU, awz.e, $$0, 1.0F, false);
         }
      }
   }
}
