public class fyf extends gac {
   private final elz b;
   protected boolean a;

   fyf(fvw $$0, double $$1, double $$2, double $$3, elz $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected elz g() {
      return this.b;
   }

   @Override
   public fzg b() {
      return fzg.b;
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
            if (this.b != emb.a) {
               in $$0 = in.a(this.g, this.h, this.i);
               ema $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((czj)this.c, $$0))) {
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

   public static gac a(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.b($$1, $$2, $$3, $$4, emb.c, kx.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gac b(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.e($$1, $$2, $$3, $$4, emb.c, kx.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gac c(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fyf.a($$1, $$2, $$3, $$4, emb.e, kx.j);
   }

   public static gac d(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.e($$1, $$2, $$3, $$4, emb.e, kx.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gac e(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.c($$1, $$2, $$3, $$4, emb.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gac f(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf.b $$8 = new fyf.b($$1, $$2, $$3, $$4, emb.a, kx.at);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static gac g(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.g($$1, $$2, $$3, $$4, emb.a, kx.au);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static gac h(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.c($$1, $$2, $$3, $$4, emb.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static gac i(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.b($$1, $$2, $$3, $$4, emb.c, kx.aL);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gac j(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.d($$1, $$2, $$3, $$4, emb.c, kx.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static gac k(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fyf.a($$1, $$2, $$3, $$4, emb.e, kx.aJ);
   }

   public static gac l(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.d($$1, $$2, $$3, $$4, emb.e, kx.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static gac m(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.f($$1, $$2, $$3, $$4, emb.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static gac n(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / axz.b($$1.E_(), 0.1F, 0.9F));
      fyf $$9 = new fyf.f($$1, $$2, $$3, $$4, emb.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static gac o(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf.b $$8 = new fyf.b($$1, $$2, $$3, $$4, emb.a, kx.aC);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gac p(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.e($$1, $$2, $$3, $$4, emb.a, kx.aD);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static gac q(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fyf $$8 = new fyf.c($$1, $$2, $$3, $$4, emb.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fyf.b {
      a(fvw $$0, double $$1, double $$2, double $$3, elz $$4, kv $$5) {
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

   static class b extends fyf {
      private final kv b;

      b(fvw $$0, double $$1, double $$2, double $$3, elz $$4, kv $$5) {
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

   static class c extends fyf {
      c(fvw $$0, double $$1, double $$2, double $$3, elz $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fyf.e {
      d(fvw $$0, double $$1, double $$2, double $$3, elz $$4, kv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            avb $$0 = this.g() == emb.e ? avc.hs : avc.ht;
            float $$1 = axz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, avd.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fyf.f {
      protected final kv b;

      e(fvw $$0, double $$1, double $$2, double $$3, elz $$4, kv $$5) {
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

   static class f extends fyf {
      f(fvw $$0, double $$1, double $$2, double $$3, elz $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fvw $$0, double $$1, double $$2, double $$3, elz $$4, int $$5) {
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

   static class g extends fyf.e {
      g(fvw $$0, double $$1, double $$2, double $$3, elz $$4, kv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = axz.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, avc.bU, avd.e, $$0, 1.0F, false);
         }
      }
   }
}
