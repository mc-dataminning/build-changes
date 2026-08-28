public class gif extends gke {
   private final esw b;
   protected boolean a;

   gif(gfw $$0, double $$1, double $$2, double $$3, esw $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected esw g() {
      return this.b;
   }

   @Override
   public gji b() {
      return gji.b;
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
            if (this.b != esy.a) {
               ji $$0 = ji.a(this.g, this.h, this.i);
               esx $$1 = this.c.b_($$0);
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

   public static gke a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.b($$1, $$2, $$3, $$4, esy.c, lt.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gke b(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.e($$1, $$2, $$3, $$4, esy.c, lt.ao);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gke c(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gif.a($$1, $$2, $$3, $$4, esy.e, lt.j);
   }

   public static gke d(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.e($$1, $$2, $$3, $$4, esy.e, lt.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gke e(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.c($$1, $$2, $$3, $$4, esy.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gke f(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif.b $$8 = new gif.b($$1, $$2, $$3, $$4, esy.a, lt.ay);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gke g(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.g($$1, $$2, $$3, $$4, esy.a, lt.az);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gke h(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.c($$1, $$2, $$3, $$4, esy.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gke i(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.b($$1, $$2, $$3, $$4, esy.c, lt.aQ);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gke j(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.d($$1, $$2, $$3, $$4, esy.c, lt.ao);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gke k(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gif.a($$1, $$2, $$3, $$4, esy.e, lt.aO);
   }

   public static gke l(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.d($$1, $$2, $$3, $$4, esy.e, lt.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gke m(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.f($$1, $$2, $$3, $$4, esy.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gke n(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ayy.b($$1.H_(), 0.1F, 0.9F));
      gif $$9 = new gif.f($$1, $$2, $$3, $$4, esy.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gke o(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif.b $$8 = new gif.b($$1, $$2, $$3, $$4, esy.a, lt.aH);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gke p(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.e($$1, $$2, $$3, $$4, esy.a, lt.aI);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gke q(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gif $$8 = new gif.c($$1, $$2, $$3, $$4, esy.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gif.b {
      a(gfw $$0, double $$1, double $$2, double $$3, esw $$4, lr $$5) {
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

   static class b extends gif {
      private final lr b;

      b(gfw $$0, double $$1, double $$2, double $$3, esw $$4, lr $$5) {
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

   static class c extends gif {
      c(gfw $$0, double $$1, double $$2, double $$3, esw $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gif.e {
      d(gfw $$0, double $$1, double $$2, double $$3, esw $$4, lr $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avy $$0 = this.g() == esy.e ? avz.hS : avz.hT;
            float $$1 = ayy.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awa.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gif.f {
      protected final lr b;

      e(gfw $$0, double $$1, double $$2, double $$3, esw $$4, lr $$5) {
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

   static class f extends gif {
      f(gfw $$0, double $$1, double $$2, double $$3, esw $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gfw $$0, double $$1, double $$2, double $$3, esw $$4, int $$5) {
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

   static class g extends gif.e {
      g(gfw $$0, double $$1, double $$2, double $$3, esw $$4, lr $$5) {
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
