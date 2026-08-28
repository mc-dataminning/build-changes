public class gmu extends gou {
   private final ewu b;
   protected boolean a;

   gmu(gkl $$0, double $$1, double $$2, double $$3, ewu $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ewu g() {
      return this.b;
   }

   @Override
   public gny b() {
      return gny.b;
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
            if (this.b != eww.a) {
               iv $$0 = iv.a(this.g, this.h, this.i);
               ewv $$1 = this.c.b_($$0);
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

   public static gou a(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.b($$1, $$2, $$3, $$4, eww.c, ly.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gou b(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.e($$1, $$2, $$3, $$4, eww.c, ly.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gou c(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gmu.a($$1, $$2, $$3, $$4, eww.e, ly.j);
   }

   public static gou d(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.e($$1, $$2, $$3, $$4, eww.e, ly.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gou e(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.c($$1, $$2, $$3, $$4, eww.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gou f(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu.b $$8 = new gmu.b($$1, $$2, $$3, $$4, eww.a, ly.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gou g(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.g($$1, $$2, $$3, $$4, eww.a, ly.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gou h(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.c($$1, $$2, $$3, $$4, eww.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gou i(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.b($$1, $$2, $$3, $$4, eww.c, ly.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gou j(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.d($$1, $$2, $$3, $$4, eww.c, ly.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gou k(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gmu.a($$1, $$2, $$3, $$4, eww.e, ly.aP);
   }

   public static gou l(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.d($$1, $$2, $$3, $$4, eww.e, ly.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gou m(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.f($$1, $$2, $$3, $$4, eww.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gou n(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azm.b($$1.C_(), 0.1F, 0.9F));
      gmu $$9 = new gmu.f($$1, $$2, $$3, $$4, eww.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gou o(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu.b $$8 = new gmu.b($$1, $$2, $$3, $$4, eww.a, ly.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gou p(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.e($$1, $$2, $$3, $$4, eww.a, ly.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gou q(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmu $$8 = new gmu.c($$1, $$2, $$3, $$4, eww.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gmu.b {
      a(gkl $$0, double $$1, double $$2, double $$3, ewu $$4, lw $$5) {
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

   static class b extends gmu {
      private final lw b;

      b(gkl $$0, double $$1, double $$2, double $$3, ewu $$4, lw $$5) {
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

   static class c extends gmu {
      c(gkl $$0, double $$1, double $$2, double $$3, ewu $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gmu.e {
      d(gkl $$0, double $$1, double $$2, double $$3, ewu $$4, lw $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awm $$0 = this.g() == eww.e ? awn.hV : awn.hW;
            float $$1 = azm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awo.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gmu.f {
      protected final lw b;

      e(gkl $$0, double $$1, double $$2, double $$3, ewu $$4, lw $$5) {
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

   static class f extends gmu {
      f(gkl $$0, double $$1, double $$2, double $$3, ewu $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gkl $$0, double $$1, double $$2, double $$3, ewu $$4, int $$5) {
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

   static class g extends gmu.e {
      g(gkl $$0, double $$1, double $$2, double $$3, ewu $$4, lw $$5) {
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
