public class gag extends gce {
   private final enw b;
   protected boolean a;

   gag(fxx $$0, double $$1, double $$2, double $$3, enw $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected enw g() {
      return this.b;
   }

   @Override
   public gbi b() {
      return gbi.b;
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
            if (this.b != eny.a) {
               iz $$0 = iz.a(this.g, this.h, this.i);
               enx $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((dbg)this.c, $$0))) {
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

   public static gce a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.b($$1, $$2, $$3, $$4, eny.c, li.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gce b(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.e($$1, $$2, $$3, $$4, eny.c, li.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gce c(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gag.a($$1, $$2, $$3, $$4, eny.e, li.j);
   }

   public static gce d(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.e($$1, $$2, $$3, $$4, eny.e, li.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gce e(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.c($$1, $$2, $$3, $$4, eny.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gce f(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag.b $$8 = new gag.b($$1, $$2, $$3, $$4, eny.a, li.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gce g(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.g($$1, $$2, $$3, $$4, eny.a, li.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gce h(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.c($$1, $$2, $$3, $$4, eny.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gce i(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.b($$1, $$2, $$3, $$4, eny.c, li.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gce j(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.d($$1, $$2, $$3, $$4, eny.c, li.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gce k(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gag.a($$1, $$2, $$3, $$4, eny.e, li.aM);
   }

   public static gce l(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.d($$1, $$2, $$3, $$4, eny.e, li.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gce m(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.f($$1, $$2, $$3, $$4, eny.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gce n(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayz.b($$1.E_(), 0.1F, 0.9F));
      gag $$9 = new gag.f($$1, $$2, $$3, $$4, eny.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gce o(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag.b $$8 = new gag.b($$1, $$2, $$3, $$4, eny.a, li.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gce p(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.e($$1, $$2, $$3, $$4, eny.a, li.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gce q(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gag $$8 = new gag.c($$1, $$2, $$3, $$4, eny.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gag.b {
      a(fxx $$0, double $$1, double $$2, double $$3, enw $$4, lg $$5) {
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

   static class b extends gag {
      private final lg b;

      b(fxx $$0, double $$1, double $$2, double $$3, enw $$4, lg $$5) {
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

   static class c extends gag {
      c(fxx $$0, double $$1, double $$2, double $$3, enw $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gag.e {
      d(fxx $$0, double $$1, double $$2, double $$3, enw $$4, lg $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avz $$0 = this.g() == eny.e ? awa.hx : awa.hy;
            float $$1 = ayz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awb.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gag.f {
      protected final lg b;

      e(fxx $$0, double $$1, double $$2, double $$3, enw $$4, lg $$5) {
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

   static class f extends gag {
      f(fxx $$0, double $$1, double $$2, double $$3, enw $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fxx $$0, double $$1, double $$2, double $$3, enw $$4, int $$5) {
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

   static class g extends gag.e {
      g(fxx $$0, double $$1, double $$2, double $$3, enw $$4, lg $$5) {
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
