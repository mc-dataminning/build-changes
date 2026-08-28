public class gad extends gcb {
   private final ent b;
   protected boolean a;

   gad(fxu $$0, double $$1, double $$2, double $$3, ent $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ent g() {
      return this.b;
   }

   @Override
   public gbf b() {
      return gbf.b;
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
            if (this.b != env.a) {
               iz $$0 = iz.a(this.g, this.h, this.i);
               enu $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((dbd)this.c, $$0))) {
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

   public static gcb a(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.b($$1, $$2, $$3, $$4, env.c, li.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gcb b(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.e($$1, $$2, $$3, $$4, env.c, li.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gcb c(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gad.a($$1, $$2, $$3, $$4, env.e, li.j);
   }

   public static gcb d(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.e($$1, $$2, $$3, $$4, env.e, li.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gcb e(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.c($$1, $$2, $$3, $$4, env.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gcb f(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad.b $$8 = new gad.b($$1, $$2, $$3, $$4, env.a, li.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gcb g(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.g($$1, $$2, $$3, $$4, env.a, li.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gcb h(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.c($$1, $$2, $$3, $$4, env.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gcb i(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.b($$1, $$2, $$3, $$4, env.c, li.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gcb j(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.d($$1, $$2, $$3, $$4, env.c, li.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gcb k(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gad.a($$1, $$2, $$3, $$4, env.e, li.aM);
   }

   public static gcb l(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.d($$1, $$2, $$3, $$4, env.e, li.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gcb m(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.f($$1, $$2, $$3, $$4, env.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gcb n(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayy.b($$1.E_(), 0.1F, 0.9F));
      gad $$9 = new gad.f($$1, $$2, $$3, $$4, env.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gcb o(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad.b $$8 = new gad.b($$1, $$2, $$3, $$4, env.a, li.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gcb p(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.e($$1, $$2, $$3, $$4, env.a, li.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gcb q(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gad $$8 = new gad.c($$1, $$2, $$3, $$4, env.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gad.b {
      a(fxu $$0, double $$1, double $$2, double $$3, ent $$4, lg $$5) {
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

   static class b extends gad {
      private final lg b;

      b(fxu $$0, double $$1, double $$2, double $$3, ent $$4, lg $$5) {
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

   static class c extends gad {
      c(fxu $$0, double $$1, double $$2, double $$3, ent $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gad.e {
      d(fxu $$0, double $$1, double $$2, double $$3, ent $$4, lg $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avy $$0 = this.g() == env.e ? avz.hx : avz.hy;
            float $$1 = ayy.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awa.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gad.f {
      protected final lg b;

      e(fxu $$0, double $$1, double $$2, double $$3, ent $$4, lg $$5) {
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

   static class f extends gad {
      f(fxu $$0, double $$1, double $$2, double $$3, ent $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fxu $$0, double $$1, double $$2, double $$3, ent $$4, int $$5) {
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

   static class g extends gad.e {
      g(fxu $$0, double $$1, double $$2, double $$3, ent $$4, lg $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ayy.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avz.bU, awa.e, $$0, 1.0F, false);
         }
      }
   }
}
