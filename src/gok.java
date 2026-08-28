public class gok extends gqk {
   private final exn b;
   protected boolean a;

   gok(gmb $$0, double $$1, double $$2, double $$3, exn $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected exn g() {
      return this.b;
   }

   @Override
   public gpo b() {
      return gpo.b;
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
            if (this.b != exp.a) {
               iv $$0 = iv.a(this.g, this.h, this.i);
               exo $$1 = this.c.b_($$0);
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

   public static gqk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.b($$1, $$2, $$3, $$4, exp.c, ly.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqk b(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.e($$1, $$2, $$3, $$4, exp.c, ly.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqk c(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gok.a($$1, $$2, $$3, $$4, exp.e, ly.j);
   }

   public static gqk d(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.e($$1, $$2, $$3, $$4, exp.e, ly.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gqk e(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.c($$1, $$2, $$3, $$4, exp.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gqk f(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok.b $$8 = new gok.b($$1, $$2, $$3, $$4, exp.a, ly.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gqk g(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.g($$1, $$2, $$3, $$4, exp.a, ly.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gqk h(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.c($$1, $$2, $$3, $$4, exp.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gqk i(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.b($$1, $$2, $$3, $$4, exp.c, ly.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqk j(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.d($$1, $$2, $$3, $$4, exp.c, ly.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gqk k(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gok.a($$1, $$2, $$3, $$4, exp.e, ly.aP);
   }

   public static gqk l(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.d($$1, $$2, $$3, $$4, exp.e, ly.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gqk m(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.f($$1, $$2, $$3, $$4, exp.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gqk n(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azo.b($$1.G_(), 0.1F, 0.9F));
      gok $$9 = new gok.f($$1, $$2, $$3, $$4, exp.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gqk o(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok.b $$8 = new gok.b($$1, $$2, $$3, $$4, exp.a, ly.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gqk p(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.e($$1, $$2, $$3, $$4, exp.a, ly.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gqk q(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gok $$8 = new gok.c($$1, $$2, $$3, $$4, exp.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gok.b {
      a(gmb $$0, double $$1, double $$2, double $$3, exn $$4, lw $$5) {
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

   static class b extends gok {
      private final lw b;

      b(gmb $$0, double $$1, double $$2, double $$3, exn $$4, lw $$5) {
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

   static class c extends gok {
      c(gmb $$0, double $$1, double $$2, double $$3, exn $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gok.e {
      d(gmb $$0, double $$1, double $$2, double $$3, exn $$4, lw $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awo $$0 = this.g() == exp.e ? awp.hV : awp.hW;
            float $$1 = azo.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awq.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gok.f {
      protected final lw b;

      e(gmb $$0, double $$1, double $$2, double $$3, exn $$4, lw $$5) {
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

   static class f extends gok {
      f(gmb $$0, double $$1, double $$2, double $$3, exn $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gmb $$0, double $$1, double $$2, double $$3, exn $$4, int $$5) {
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

   static class g extends gok.e {
      g(gmb $$0, double $$1, double $$2, double $$3, exn $$4, lw $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azo.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awp.bU, awq.e, $$0, 1.0F, false);
         }
      }
   }
}
