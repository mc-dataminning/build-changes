public class gho extends gjn {
   private final etp b;
   protected boolean a;

   gho(gff $$0, double $$1, double $$2, double $$3, etp $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected etp g() {
      return this.b;
   }

   @Override
   public gir b() {
      return gir.b;
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
            if (this.b != etr.a) {
               jh $$0 = jh.a(this.g, this.h, this.i);
               etq $$1 = this.c.b_($$0);
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

   public static gjn a(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.b($$1, $$2, $$3, $$4, etr.c, ls.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjn b(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.e($$1, $$2, $$3, $$4, etr.c, ls.ao);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjn c(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gho.a($$1, $$2, $$3, $$4, etr.e, ls.j);
   }

   public static gjn d(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.e($$1, $$2, $$3, $$4, etr.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gjn e(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.c($$1, $$2, $$3, $$4, etr.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gjn f(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho.b $$8 = new gho.b($$1, $$2, $$3, $$4, etr.a, ls.ay);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gjn g(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.g($$1, $$2, $$3, $$4, etr.a, ls.az);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gjn h(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.c($$1, $$2, $$3, $$4, etr.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gjn i(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.b($$1, $$2, $$3, $$4, etr.c, ls.aQ);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjn j(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.d($$1, $$2, $$3, $$4, etr.c, ls.ao);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gjn k(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gho.a($$1, $$2, $$3, $$4, etr.e, ls.aO);
   }

   public static gjn l(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.d($$1, $$2, $$3, $$4, etr.e, ls.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gjn m(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.f($$1, $$2, $$3, $$4, etr.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gjn n(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azu.b($$1.H_(), 0.1F, 0.9F));
      gho $$9 = new gho.f($$1, $$2, $$3, $$4, etr.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gjn o(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho.b $$8 = new gho.b($$1, $$2, $$3, $$4, etr.a, ls.aH);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gjn p(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.e($$1, $$2, $$3, $$4, etr.a, ls.aI);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gjn q(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gho $$8 = new gho.c($$1, $$2, $$3, $$4, etr.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gho.b {
      a(gff $$0, double $$1, double $$2, double $$3, etp $$4, lq $$5) {
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

   static class b extends gho {
      private final lq b;

      b(gff $$0, double $$1, double $$2, double $$3, etp $$4, lq $$5) {
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

   static class c extends gho {
      c(gff $$0, double $$1, double $$2, double $$3, etp $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gho.e {
      d(gff $$0, double $$1, double $$2, double $$3, etp $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awu $$0 = this.g() == etr.e ? awv.hS : awv.hT;
            float $$1 = azu.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aww.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gho.f {
      protected final lq b;

      e(gff $$0, double $$1, double $$2, double $$3, etp $$4, lq $$5) {
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

   static class f extends gho {
      f(gff $$0, double $$1, double $$2, double $$3, etp $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gff $$0, double $$1, double $$2, double $$3, etp $$4, int $$5) {
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

   static class g extends gho.e {
      g(gff $$0, double $$1, double $$2, double $$3, etp $$4, lq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azu.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awv.bU, aww.e, $$0, 1.0F, false);
         }
      }
   }
}
