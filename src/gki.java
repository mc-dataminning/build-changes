public class gki extends gmh {
   private final eus b;
   protected boolean a;

   gki(ghz $$0, double $$1, double $$2, double $$3, eus $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eus g() {
      return this.b;
   }

   @Override
   public gll b() {
      return gll.b;
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
            if (this.b != euu.a) {
               jj $$0 = jj.a(this.g, this.h, this.i);
               eut $$1 = this.c.b_($$0);
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

   public static gmh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.b($$1, $$2, $$3, $$4, euu.c, lv.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gmh b(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.e($$1, $$2, $$3, $$4, euu.c, lv.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gmh c(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gki.a($$1, $$2, $$3, $$4, euu.e, lv.j);
   }

   public static gmh d(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.e($$1, $$2, $$3, $$4, euu.e, lv.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gmh e(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.c($$1, $$2, $$3, $$4, euu.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gmh f(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki.b $$8 = new gki.b($$1, $$2, $$3, $$4, euu.a, lv.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gmh g(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.g($$1, $$2, $$3, $$4, euu.a, lv.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gmh h(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.c($$1, $$2, $$3, $$4, euu.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gmh i(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.b($$1, $$2, $$3, $$4, euu.c, lv.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gmh j(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.d($$1, $$2, $$3, $$4, euu.c, lv.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gmh k(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gki.a($$1, $$2, $$3, $$4, euu.e, lv.aP);
   }

   public static gmh l(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.d($$1, $$2, $$3, $$4, euu.e, lv.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gmh m(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.f($$1, $$2, $$3, $$4, euu.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gmh n(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azk.b($$1.C_(), 0.1F, 0.9F));
      gki $$9 = new gki.f($$1, $$2, $$3, $$4, euu.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gmh o(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki.b $$8 = new gki.b($$1, $$2, $$3, $$4, euu.a, lv.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gmh p(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.e($$1, $$2, $$3, $$4, euu.a, lv.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gmh q(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gki $$8 = new gki.c($$1, $$2, $$3, $$4, euu.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gki.b {
      a(ghz $$0, double $$1, double $$2, double $$3, eus $$4, lt $$5) {
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

   static class b extends gki {
      private final lt b;

      b(ghz $$0, double $$1, double $$2, double $$3, eus $$4, lt $$5) {
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

   static class c extends gki {
      c(ghz $$0, double $$1, double $$2, double $$3, eus $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gki.e {
      d(ghz $$0, double $$1, double $$2, double $$3, eus $$4, lt $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awj $$0 = this.g() == euu.e ? awk.hS : awk.hT;
            float $$1 = azk.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awl.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gki.f {
      protected final lt b;

      e(ghz $$0, double $$1, double $$2, double $$3, eus $$4, lt $$5) {
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

   static class f extends gki {
      f(ghz $$0, double $$1, double $$2, double $$3, eus $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(ghz $$0, double $$1, double $$2, double $$3, eus $$4, int $$5) {
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

   static class g extends gki.e {
      g(ghz $$0, double $$1, double $$2, double $$3, eus $$4, lt $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = azk.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, awk.bU, awl.e, $$0, 1.0F, false);
         }
      }
   }
}
