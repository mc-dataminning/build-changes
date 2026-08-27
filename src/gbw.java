public class gbw extends gdu {
   private final epd b;
   protected boolean a;

   gbw(fzn $$0, double $$1, double $$2, double $$3, epd $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected epd g() {
      return this.b;
   }

   @Override
   public gcy b() {
      return gcy.b;
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
            if (this.b != epf.a) {
               ir $$0 = ir.a(this.g, this.h, this.i);
               epe $$1 = this.c.b_($$0);
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

   public static gdu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.b($$1, $$2, $$3, $$4, epf.c, lb.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdu b(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.e($$1, $$2, $$3, $$4, epf.c, lb.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdu c(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gbw.a($$1, $$2, $$3, $$4, epf.e, lb.j);
   }

   public static gdu d(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.e($$1, $$2, $$3, $$4, epf.e, lb.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdu e(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.c($$1, $$2, $$3, $$4, epf.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdu f(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw.b $$8 = new gbw.b($$1, $$2, $$3, $$4, epf.a, lb.au);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gdu g(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.g($$1, $$2, $$3, $$4, epf.a, lb.av);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gdu h(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.c($$1, $$2, $$3, $$4, epf.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gdu i(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.b($$1, $$2, $$3, $$4, epf.c, lb.aP);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdu j(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.d($$1, $$2, $$3, $$4, epf.c, lb.ak);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdu k(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gbw.a($$1, $$2, $$3, $$4, epf.e, lb.aN);
   }

   public static gdu l(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.d($$1, $$2, $$3, $$4, epf.e, lb.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdu m(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.f($$1, $$2, $$3, $$4, epf.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gdu n(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.f($$1, $$2, $$3, $$4, epf.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.69F, 0.78F, 0.22F);
      return $$8;
   }

   public static gdu o(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / aym.b($$1.F_(), 0.1F, 0.9F));
      gbw $$9 = new gbw.f($$1, $$2, $$3, $$4, epf.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gdu p(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw.b $$8 = new gbw.b($$1, $$2, $$3, $$4, epf.a, lb.aE);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gdu q(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.e($$1, $$2, $$3, $$4, epf.a, lb.aF);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gdu r(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbw $$8 = new gbw.c($$1, $$2, $$3, $$4, epf.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gbw.b {
      a(fzn $$0, double $$1, double $$2, double $$3, epd $$4, kz $$5) {
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

   static class b extends gbw {
      private final kz b;

      b(fzn $$0, double $$1, double $$2, double $$3, epd $$4, kz $$5) {
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

   static class c extends gbw {
      c(fzn $$0, double $$1, double $$2, double $$3, epd $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gbw.e {
      d(fzn $$0, double $$1, double $$2, double $$3, epd $$4, kz $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avn $$0 = this.g() == epf.e ? avo.hx : avo.hy;
            float $$1 = aym.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, avq.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gbw.f {
      protected final kz b;

      e(fzn $$0, double $$1, double $$2, double $$3, epd $$4, kz $$5) {
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

   static class f extends gbw {
      f(fzn $$0, double $$1, double $$2, double $$3, epd $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fzn $$0, double $$1, double $$2, double $$3, epd $$4, int $$5) {
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

   static class g extends gbw.e {
      g(fzn $$0, double $$1, double $$2, double $$3, epd $$4, kz $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = aym.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avo.bZ, avq.e, $$0, 1.0F, false);
         }
      }
   }
}
