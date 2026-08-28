public class gmi extends goi {
   private final ewn b;
   protected boolean a;

   gmi(gjz $$0, double $$1, double $$2, double $$3, ewn $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ewn g() {
      return this.b;
   }

   @Override
   public gnm b() {
      return gnm.b;
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
            if (this.b != ewp.a) {
               iu $$0 = iu.a(this.g, this.h, this.i);
               ewo $$1 = this.c.b_($$0);
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

   public static goi a(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.b($$1, $$2, $$3, $$4, ewp.c, lx.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goi b(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.e($$1, $$2, $$3, $$4, ewp.c, lx.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goi c(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gmi.a($$1, $$2, $$3, $$4, ewp.e, lx.j);
   }

   public static goi d(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.e($$1, $$2, $$3, $$4, ewp.e, lx.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static goi e(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.c($$1, $$2, $$3, $$4, ewp.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static goi f(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi.b $$8 = new gmi.b($$1, $$2, $$3, $$4, ewp.a, lx.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static goi g(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.g($$1, $$2, $$3, $$4, ewp.a, lx.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static goi h(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.c($$1, $$2, $$3, $$4, ewp.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static goi i(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.b($$1, $$2, $$3, $$4, ewp.c, lx.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goi j(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.d($$1, $$2, $$3, $$4, ewp.c, lx.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goi k(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gmi.a($$1, $$2, $$3, $$4, ewp.e, lx.aP);
   }

   public static goi l(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.d($$1, $$2, $$3, $$4, ewp.e, lx.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static goi m(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.f($$1, $$2, $$3, $$4, ewp.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static goi n(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azm.b($$1.C_(), 0.1F, 0.9F));
      gmi $$9 = new gmi.f($$1, $$2, $$3, $$4, ewp.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static goi o(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi.b $$8 = new gmi.b($$1, $$2, $$3, $$4, ewp.a, lx.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static goi p(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.e($$1, $$2, $$3, $$4, ewp.a, lx.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static goi q(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmi $$8 = new gmi.c($$1, $$2, $$3, $$4, ewp.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gmi.b {
      a(gjz $$0, double $$1, double $$2, double $$3, ewn $$4, lv $$5) {
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

   static class b extends gmi {
      private final lv b;

      b(gjz $$0, double $$1, double $$2, double $$3, ewn $$4, lv $$5) {
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

   static class c extends gmi {
      c(gjz $$0, double $$1, double $$2, double $$3, ewn $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gmi.e {
      d(gjz $$0, double $$1, double $$2, double $$3, ewn $$4, lv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awm $$0 = this.g() == ewp.e ? awn.hV : awn.hW;
            float $$1 = azm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awo.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gmi.f {
      protected final lv b;

      e(gjz $$0, double $$1, double $$2, double $$3, ewn $$4, lv $$5) {
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

   static class f extends gmi {
      f(gjz $$0, double $$1, double $$2, double $$3, ewn $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gjz $$0, double $$1, double $$2, double $$3, ewn $$4, int $$5) {
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

   static class g extends gmi.e {
      g(gjz $$0, double $$1, double $$2, double $$3, ewn $$4, lv $$5) {
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
