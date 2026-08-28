public class gfq extends gho {
   private final eru b;
   protected boolean a;

   gfq(gdh $$0, double $$1, double $$2, double $$3, eru $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eru g() {
      return this.b;
   }

   @Override
   public ggs b() {
      return ggs.b;
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
            if (this.b != erw.a) {
               jh $$0 = jh.a(this.g, this.h, this.i);
               erv $$1 = this.c.b_($$0);
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

   public static gho a(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.b($$1, $$2, $$3, $$4, erw.c, ls.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gho b(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.e($$1, $$2, $$3, $$4, erw.c, ls.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gho c(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gfq.a($$1, $$2, $$3, $$4, erw.e, ls.j);
   }

   public static gho d(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.e($$1, $$2, $$3, $$4, erw.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gho e(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.c($$1, $$2, $$3, $$4, erw.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gho f(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq.b $$8 = new gfq.b($$1, $$2, $$3, $$4, erw.a, ls.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gho g(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.g($$1, $$2, $$3, $$4, erw.a, ls.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gho h(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.c($$1, $$2, $$3, $$4, erw.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gho i(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.b($$1, $$2, $$3, $$4, erw.c, ls.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gho j(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.d($$1, $$2, $$3, $$4, erw.c, ls.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gho k(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gfq.a($$1, $$2, $$3, $$4, erw.e, ls.aM);
   }

   public static gho l(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.d($$1, $$2, $$3, $$4, erw.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gho m(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.f($$1, $$2, $$3, $$4, erw.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gho n(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azm.b($$1.G_(), 0.1F, 0.9F));
      gfq $$9 = new gfq.f($$1, $$2, $$3, $$4, erw.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gho o(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq.b $$8 = new gfq.b($$1, $$2, $$3, $$4, erw.a, ls.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gho p(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.e($$1, $$2, $$3, $$4, erw.a, ls.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gho q(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gfq $$8 = new gfq.c($$1, $$2, $$3, $$4, erw.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gfq.b {
      a(gdh $$0, double $$1, double $$2, double $$3, eru $$4, lq $$5) {
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

   static class b extends gfq {
      private final lq b;

      b(gdh $$0, double $$1, double $$2, double $$3, eru $$4, lq $$5) {
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

   static class c extends gfq {
      c(gdh $$0, double $$1, double $$2, double $$3, eru $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gfq.e {
      d(gdh $$0, double $$1, double $$2, double $$3, eru $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awm $$0 = this.g() == erw.e ? awn.hy : awn.hz;
            float $$1 = azm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awo.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gfq.f {
      protected final lq b;

      e(gdh $$0, double $$1, double $$2, double $$3, eru $$4, lq $$5) {
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

   static class f extends gfq {
      f(gdh $$0, double $$1, double $$2, double $$3, eru $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gdh $$0, double $$1, double $$2, double $$3, eru $$4, int $$5) {
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

   static class g extends gfq.e {
      g(gdh $$0, double $$1, double $$2, double $$3, eru $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awn.bU, awo.e, $$0, 1.0F, false);
         }
      }
   }
}
