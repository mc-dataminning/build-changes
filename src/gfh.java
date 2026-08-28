public class gfh extends ghf {
   private final ern b;
   protected boolean a;

   gfh(gcy $$0, double $$1, double $$2, double $$3, ern $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ern g() {
      return this.b;
   }

   @Override
   public ggj b() {
      return ggj.b;
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
            if (this.b != erp.a) {
               jh $$0 = jh.a(this.g, this.h, this.i);
               ero $$1 = this.c.b_($$0);
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

   public static ghf a(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.b($$1, $$2, $$3, $$4, erp.c, ls.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static ghf b(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.e($$1, $$2, $$3, $$4, erp.c, ls.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static ghf c(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gfh.a($$1, $$2, $$3, $$4, erp.e, ls.j);
   }

   public static ghf d(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.e($$1, $$2, $$3, $$4, erp.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static ghf e(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.c($$1, $$2, $$3, $$4, erp.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static ghf f(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh.b $$8 = new gfh.b($$1, $$2, $$3, $$4, erp.a, ls.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static ghf g(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.g($$1, $$2, $$3, $$4, erp.a, ls.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static ghf h(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.c($$1, $$2, $$3, $$4, erp.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static ghf i(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.b($$1, $$2, $$3, $$4, erp.c, ls.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static ghf j(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.d($$1, $$2, $$3, $$4, erp.c, ls.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static ghf k(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gfh.a($$1, $$2, $$3, $$4, erp.e, ls.aM);
   }

   public static ghf l(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.d($$1, $$2, $$3, $$4, erp.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static ghf m(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.f($$1, $$2, $$3, $$4, erp.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static ghf n(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azn.b($$1.E_(), 0.1F, 0.9F));
      gfh $$9 = new gfh.f($$1, $$2, $$3, $$4, erp.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static ghf o(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh.b $$8 = new gfh.b($$1, $$2, $$3, $$4, erp.a, ls.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static ghf p(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.e($$1, $$2, $$3, $$4, erp.a, ls.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static ghf q(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfh $$8 = new gfh.c($$1, $$2, $$3, $$4, erp.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gfh.b {
      a(gcy $$0, double $$1, double $$2, double $$3, ern $$4, lq $$5) {
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

   static class b extends gfh {
      private final lq b;

      b(gcy $$0, double $$1, double $$2, double $$3, ern $$4, lq $$5) {
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

   static class c extends gfh {
      c(gcy $$0, double $$1, double $$2, double $$3, ern $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gfh.e {
      d(gcy $$0, double $$1, double $$2, double $$3, ern $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awn $$0 = this.g() == erp.e ? awo.hy : awo.hz;
            float $$1 = azn.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awp.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gfh.f {
      protected final lq b;

      e(gcy $$0, double $$1, double $$2, double $$3, ern $$4, lq $$5) {
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

   static class f extends gfh {
      f(gcy $$0, double $$1, double $$2, double $$3, ern $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gcy $$0, double $$1, double $$2, double $$3, ern $$4, int $$5) {
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

   static class g extends gfh.e {
      g(gcy $$0, double $$1, double $$2, double $$3, ern $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azn.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awo.bU, awp.e, $$0, 1.0F, false);
         }
      }
   }
}
