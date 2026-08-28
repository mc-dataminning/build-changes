public class gbj extends gdh {
   private final eox b;
   protected boolean a;

   gbj(fyz $$0, double $$1, double $$2, double $$3, eox $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eox g() {
      return this.b;
   }

   @Override
   public gcl b() {
      return gcl.b;
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
            if (this.b != eoz.a) {
               jd $$0 = jd.a(this.g, this.h, this.i);
               eoy $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((dca)this.c, $$0))) {
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

   public static gdh a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.b($$1, $$2, $$3, $$4, eoz.c, lm.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdh b(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.e($$1, $$2, $$3, $$4, eoz.c, lm.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdh c(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gbj.a($$1, $$2, $$3, $$4, eoz.e, lm.j);
   }

   public static gdh d(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.e($$1, $$2, $$3, $$4, eoz.e, lm.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdh e(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.c($$1, $$2, $$3, $$4, eoz.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdh f(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj.b $$8 = new gbj.b($$1, $$2, $$3, $$4, eoz.a, lm.aw);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gdh g(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.g($$1, $$2, $$3, $$4, eoz.a, lm.ax);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gdh h(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.c($$1, $$2, $$3, $$4, eoz.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gdh i(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.b($$1, $$2, $$3, $$4, eoz.c, lm.aO);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdh j(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.d($$1, $$2, $$3, $$4, eoz.c, lm.am);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gdh k(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gbj.a($$1, $$2, $$3, $$4, eoz.e, lm.aM);
   }

   public static gdh l(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.d($$1, $$2, $$3, $$4, eoz.e, lm.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gdh m(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.f($$1, $$2, $$3, $$4, eoz.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gdh n(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayn.b($$1.E_(), 0.1F, 0.9F));
      gbj $$9 = new gbj.f($$1, $$2, $$3, $$4, eoz.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gdh o(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj.b $$8 = new gbj.b($$1, $$2, $$3, $$4, eoz.a, lm.aF);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gdh p(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.e($$1, $$2, $$3, $$4, eoz.a, lm.aG);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gdh q(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gbj $$8 = new gbj.c($$1, $$2, $$3, $$4, eoz.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gbj.b {
      a(fyz $$0, double $$1, double $$2, double $$3, eox $$4, lk $$5) {
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

   static class b extends gbj {
      private final lk b;

      b(fyz $$0, double $$1, double $$2, double $$3, eox $$4, lk $$5) {
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

   static class c extends gbj {
      c(fyz $$0, double $$1, double $$2, double $$3, eox $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gbj.e {
      d(fyz $$0, double $$1, double $$2, double $$3, eox $$4, lk $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avn $$0 = this.g() == eoz.e ? avo.hx : avo.hy;
            float $$1 = ayn.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, avp.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gbj.f {
      protected final lk b;

      e(fyz $$0, double $$1, double $$2, double $$3, eox $$4, lk $$5) {
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

   static class f extends gbj {
      f(fyz $$0, double $$1, double $$2, double $$3, eox $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fyz $$0, double $$1, double $$2, double $$3, eox $$4, int $$5) {
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

   static class g extends gbj.e {
      g(fyz $$0, double $$1, double $$2, double $$3, eox $$4, lk $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ayn.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avo.bU, avp.e, $$0, 1.0F, false);
         }
      }
   }
}
