public class glm extends gnl {
   private final evu b;
   protected boolean a;

   glm(gjd $$0, double $$1, double $$2, double $$3, evu $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected evu g() {
      return this.b;
   }

   @Override
   public gmp b() {
      return gmp.b;
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
            if (this.b != evw.a) {
               iu $$0 = iu.a(this.g, this.h, this.i);
               evv $$1 = this.c.b_($$0);
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

   public static gnl a(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.b($$1, $$2, $$3, $$4, evw.c, lx.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gnl b(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.e($$1, $$2, $$3, $$4, evw.c, lx.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gnl c(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new glm.a($$1, $$2, $$3, $$4, evw.e, lx.j);
   }

   public static gnl d(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.e($$1, $$2, $$3, $$4, evw.e, lx.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gnl e(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.c($$1, $$2, $$3, $$4, evw.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gnl f(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm.b $$8 = new glm.b($$1, $$2, $$3, $$4, evw.a, lx.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gnl g(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.g($$1, $$2, $$3, $$4, evw.a, lx.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gnl h(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.c($$1, $$2, $$3, $$4, evw.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gnl i(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.b($$1, $$2, $$3, $$4, evw.c, lx.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gnl j(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.d($$1, $$2, $$3, $$4, evw.c, lx.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gnl k(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new glm.a($$1, $$2, $$3, $$4, evw.e, lx.aP);
   }

   public static gnl l(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.d($$1, $$2, $$3, $$4, evw.e, lx.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gnl m(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.f($$1, $$2, $$3, $$4, evw.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gnl n(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azk.b($$1.C_(), 0.1F, 0.9F));
      glm $$9 = new glm.f($$1, $$2, $$3, $$4, evw.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gnl o(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm.b $$8 = new glm.b($$1, $$2, $$3, $$4, evw.a, lx.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gnl p(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.e($$1, $$2, $$3, $$4, evw.a, lx.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gnl q(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      glm $$8 = new glm.c($$1, $$2, $$3, $$4, evw.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends glm.b {
      a(gjd $$0, double $$1, double $$2, double $$3, evu $$4, lv $$5) {
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

   static class b extends glm {
      private final lv b;

      b(gjd $$0, double $$1, double $$2, double $$3, evu $$4, lv $$5) {
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

   static class c extends glm {
      c(gjd $$0, double $$1, double $$2, double $$3, evu $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends glm.e {
      d(gjd $$0, double $$1, double $$2, double $$3, evu $$4, lv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awk $$0 = this.g() == evw.e ? awl.hS : awl.hT;
            float $$1 = azk.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awm.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends glm.f {
      protected final lv b;

      e(gjd $$0, double $$1, double $$2, double $$3, evu $$4, lv $$5) {
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

   static class f extends glm {
      f(gjd $$0, double $$1, double $$2, double $$3, evu $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gjd $$0, double $$1, double $$2, double $$3, evu $$4, int $$5) {
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

   static class g extends glm.e {
      g(gjd $$0, double $$1, double $$2, double $$3, evu $$4, lv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azk.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awl.bU, awm.e, $$0, 1.0F, false);
         }
      }
   }
}
