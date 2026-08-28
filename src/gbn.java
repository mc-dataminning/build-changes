public class gbn extends gdl {
   private final epb b;
   protected boolean a;

   gbn(fzd $$0, double $$1, double $$2, double $$3, epb $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected epb g() {
      return this.b;
   }

   @Override
   public gcp b() {
      return gcp.b;
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
            if (this.b != epd.a) {
               jd $$0 = jd.a(this.g, this.h, this.i);
               epc $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((dcc)this.c, $$0))) {
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

   public static gdl a(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.b($$1, $$2, $$3, $$4, epd.c, lm.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdl b(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.e($$1, $$2, $$3, $$4, epd.c, lm.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdl c(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gbn.a($$1, $$2, $$3, $$4, epd.e, lm.j);
   }

   public static gdl d(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.e($$1, $$2, $$3, $$4, epd.e, lm.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdl e(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.c($$1, $$2, $$3, $$4, epd.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdl f(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn.b $$8 = new gbn.b($$1, $$2, $$3, $$4, epd.a, lm.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gdl g(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.g($$1, $$2, $$3, $$4, epd.a, lm.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gdl h(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.c($$1, $$2, $$3, $$4, epd.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gdl i(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.b($$1, $$2, $$3, $$4, epd.c, lm.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdl j(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.d($$1, $$2, $$3, $$4, epd.c, lm.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdl k(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gbn.a($$1, $$2, $$3, $$4, epd.e, lm.aM);
   }

   public static gdl l(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.d($$1, $$2, $$3, $$4, epd.e, lm.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdl m(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.f($$1, $$2, $$3, $$4, epd.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gdl n(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayo.b($$1.E_(), 0.1F, 0.9F));
      gbn $$9 = new gbn.f($$1, $$2, $$3, $$4, epd.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gdl o(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn.b $$8 = new gbn.b($$1, $$2, $$3, $$4, epd.a, lm.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gdl p(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.e($$1, $$2, $$3, $$4, epd.a, lm.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gdl q(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbn $$8 = new gbn.c($$1, $$2, $$3, $$4, epd.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gbn.b {
      a(fzd $$0, double $$1, double $$2, double $$3, epb $$4, lk $$5) {
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

   static class b extends gbn {
      private final lk b;

      b(fzd $$0, double $$1, double $$2, double $$3, epb $$4, lk $$5) {
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

   static class c extends gbn {
      c(fzd $$0, double $$1, double $$2, double $$3, epb $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gbn.e {
      d(fzd $$0, double $$1, double $$2, double $$3, epb $$4, lk $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avo $$0 = this.g() == epd.e ? avp.hx : avp.hy;
            float $$1 = ayo.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, avq.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gbn.f {
      protected final lk b;

      e(fzd $$0, double $$1, double $$2, double $$3, epb $$4, lk $$5) {
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

   static class f extends gbn {
      f(fzd $$0, double $$1, double $$2, double $$3, epb $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fzd $$0, double $$1, double $$2, double $$3, epb $$4, int $$5) {
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

   static class g extends gbn.e {
      g(fzd $$0, double $$1, double $$2, double $$3, epb $$4, lk $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ayo.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avp.bU, avq.e, $$0, 1.0F, false);
         }
      }
   }
}
