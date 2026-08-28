public class gmz extends goz {
   private final ewz b;
   protected boolean a;

   gmz(gkq $$0, double $$1, double $$2, double $$3, ewz $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ewz g() {
      return this.b;
   }

   @Override
   public god b() {
      return god.b;
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
            if (this.b != exb.a) {
               iv $$0 = iv.a(this.g, this.h, this.i);
               exa $$1 = this.c.b_($$0);
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

   public static goz a(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.b($$1, $$2, $$3, $$4, exb.c, ly.m);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goz b(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.e($$1, $$2, $$3, $$4, exb.c, ly.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goz c(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gmz.a($$1, $$2, $$3, $$4, exb.e, ly.j);
   }

   public static goz d(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.e($$1, $$2, $$3, $$4, exb.e, ly.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static goz e(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.c($$1, $$2, $$3, $$4, exb.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static goz f(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz.b $$8 = new gmz.b($$1, $$2, $$3, $$4, exb.a, ly.az);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static goz g(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.g($$1, $$2, $$3, $$4, exb.a, ly.aA);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static goz h(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.c($$1, $$2, $$3, $$4, exb.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static goz i(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.b($$1, $$2, $$3, $$4, exb.c, ly.aR);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goz j(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.d($$1, $$2, $$3, $$4, exb.c, ly.ap);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static goz k(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new gmz.a($$1, $$2, $$3, $$4, exb.e, ly.aP);
   }

   public static goz l(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.d($$1, $$2, $$3, $$4, exb.e, ly.k);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static goz m(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.f($$1, $$2, $$3, $$4, exb.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static goz n(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / azm.b($$1.C_(), 0.1F, 0.9F));
      gmz $$9 = new gmz.f($$1, $$2, $$3, $$4, exb.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static goz o(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz.b $$8 = new gmz.b($$1, $$2, $$3, $$4, exb.a, ly.aI);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static goz p(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.e($$1, $$2, $$3, $$4, exb.a, ly.aJ);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static goz q(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      gmz $$8 = new gmz.c($$1, $$2, $$3, $$4, exb.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends gmz.b {
      a(gkq $$0, double $$1, double $$2, double $$3, ewz $$4, lw $$5) {
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

   static class b extends gmz {
      private final lw b;

      b(gkq $$0, double $$1, double $$2, double $$3, ewz $$4, lw $$5) {
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

   static class c extends gmz {
      c(gkq $$0, double $$1, double $$2, double $$3, ewz $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends gmz.e {
      d(gkq $$0, double $$1, double $$2, double $$3, ewz $$4, lw $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            awm $$0 = this.g() == exb.e ? awn.hV : awn.hW;
            float $$1 = azm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, awo.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends gmz.f {
      protected final lw b;

      e(gkq $$0, double $$1, double $$2, double $$3, ewz $$4, lw $$5) {
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

   static class f extends gmz {
      f(gkq $$0, double $$1, double $$2, double $$3, ewz $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(gkq $$0, double $$1, double $$2, double $$3, ewz $$4, int $$5) {
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

   static class g extends gmz.e {
      g(gkq $$0, double $$1, double $$2, double $$3, ewz $$4, lw $$5) {
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
