public class gac extends gca {
   private final ens b;
   protected boolean a;

   gac(fxt $$0, double $$1, double $$2, double $$3, ens $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ens g() {
      return this.b;
   }

   @Override
   public gbe b() {
      return gbe.b;
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
            if (this.b != enu.a) {
               iz $$0 = iz.a(this.g, this.h, this.i);
               ent $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((dbc)this.c, $$0))) {
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

   public static gca a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.b($$1, $$2, $$3, $$4, enu.c, li.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gca b(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.e($$1, $$2, $$3, $$4, enu.c, li.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gca c(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gac.a($$1, $$2, $$3, $$4, enu.e, li.j);
   }

   public static gca d(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.e($$1, $$2, $$3, $$4, enu.e, li.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gca e(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.c($$1, $$2, $$3, $$4, enu.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gca f(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac.b $$8 = new gac.b($$1, $$2, $$3, $$4, enu.a, li.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gca g(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.g($$1, $$2, $$3, $$4, enu.a, li.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gca h(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.c($$1, $$2, $$3, $$4, enu.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gca i(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.b($$1, $$2, $$3, $$4, enu.c, li.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gca j(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.d($$1, $$2, $$3, $$4, enu.c, li.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gca k(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gac.a($$1, $$2, $$3, $$4, enu.e, li.aM);
   }

   public static gca l(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.d($$1, $$2, $$3, $$4, enu.e, li.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gca m(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.f($$1, $$2, $$3, $$4, enu.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gca n(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayx.b($$1.E_(), 0.1F, 0.9F));
      gac $$9 = new gac.f($$1, $$2, $$3, $$4, enu.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gca o(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac.b $$8 = new gac.b($$1, $$2, $$3, $$4, enu.a, li.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gca p(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.e($$1, $$2, $$3, $$4, enu.a, li.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gca q(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gac $$8 = new gac.c($$1, $$2, $$3, $$4, enu.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gac.b {
      a(fxt $$0, double $$1, double $$2, double $$3, ens $$4, lg $$5) {
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

   static class b extends gac {
      private final lg b;

      b(fxt $$0, double $$1, double $$2, double $$3, ens $$4, lg $$5) {
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

   static class c extends gac {
      c(fxt $$0, double $$1, double $$2, double $$3, ens $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gac.e {
      d(fxt $$0, double $$1, double $$2, double $$3, ens $$4, lg $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avy $$0 = this.g() == enu.e ? avz.hx : avz.hy;
            float $$1 = ayx.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awa.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gac.f {
      protected final lg b;

      e(fxt $$0, double $$1, double $$2, double $$3, ens $$4, lg $$5) {
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

   static class f extends gac {
      f(fxt $$0, double $$1, double $$2, double $$3, ens $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fxt $$0, double $$1, double $$2, double $$3, ens $$4, int $$5) {
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

   static class g extends gac.e {
      g(fxt $$0, double $$1, double $$2, double $$3, ens $$4, lg $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ayx.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avz.bU, awa.e, $$0, 1.0F, false);
         }
      }
   }
}
