public class fvi extends fur<cfe> {
   private static final String a = "feather";
   private final fxi b;
   private final fxi f;
   private final fxi g;
   private final fxi h;
   private final fxi i;
   private final fxi j;
   private final fxi k;
   private final fxi l;
   private final fxi m;

   public fvi(fxi $$0) {
      this.b = $$0;
      this.f = $$0.b("body");
      this.g = $$0.b("tail");
      this.h = $$0.b("left_wing");
      this.i = $$0.b("right_wing");
      this.j = $$0.b("head");
      this.k = this.j.b("feather");
      this.l = $$0.b("left_leg");
      this.m = $$0.b("right_leg");
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("body", fxn.c().a(2, 8).a(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), fxk.a(0.0F, 16.5F, -3.0F));
      $$1.a("tail", fxn.c().a(22, 1).a(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F), fxk.a(0.0F, 21.07F, 1.16F));
      $$1.a("left_wing", fxn.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), fxk.a(1.5F, 16.94F, -2.76F));
      $$1.a("right_wing", fxn.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), fxk.a(-1.5F, 16.94F, -2.76F));
      fxr $$2 = $$1.a("head", fxn.c().a(2, 2).a(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), fxk.a(0.0F, 15.69F, -2.76F));
      $$2.a("head2", fxn.c().a(10, 0).a(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F), fxk.a(0.0F, -2.0F, -1.0F));
      $$2.a("beak1", fxn.c().a(11, 7).a(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), fxk.a(0.0F, -0.5F, -1.5F));
      $$2.a("beak2", fxn.c().a(16, 7).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), fxk.a(0.0F, -1.75F, -2.45F));
      $$2.a("feather", fxn.c().a(2, 18).a(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F), fxk.a(0.0F, -2.15F, 0.15F));
      fxn $$3 = fxn.c().a(14, 18).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      $$1.a("left_leg", $$3, fxk.a(1.0F, 22.0F, -1.05F));
      $$1.a("right_leg", $$3, fxk.a(-1.0F, 22.0F, -1.05F));
      return fxo.a($$0, 32, 32);
   }

   @Override
   public fxi a() {
      return this.b;
   }

   public void a(cfe $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a(a($$0), $$0.ai, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cfe $$0, float $$1, float $$2, float $$3) {
      this.a(a($$0));
   }

   public void a(fag $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7, int $$8) {
      this.a(fvi.a.e);
      this.a(fvi.a.e, $$8, $$4, $$5, 0.0F, $$6, $$7);
      this.b.a($$0, $$1, $$2, $$3);
   }

   private void a(fvi.a $$0, int $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      this.j.e = $$6 * (float) (Math.PI / 180.0);
      this.j.f = $$5 * (float) (Math.PI / 180.0);
      this.j.g = 0.0F;
      this.j.b = 0.0F;
      this.f.b = 0.0F;
      this.g.b = 0.0F;
      this.i.b = -1.5F;
      this.h.b = 1.5F;
      switch ($$0) {
         case b:
            this.l.e = this.l.e + aye.b($$2 * 0.6662F) * 1.4F * $$3;
            this.m.e = this.m.e + aye.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$3;
         case a:
         case e:
         default:
            float $$9 = $$4 * 0.3F;
            this.j.c = 15.69F + $$9;
            this.g.e = 1.015F + aye.b($$2 * 0.6662F) * 0.3F * $$3;
            this.g.c = 21.07F + $$9;
            this.f.c = 16.5F + $$9;
            this.h.g = -0.0873F - $$4;
            this.h.c = 16.94F + $$9;
            this.i.g = 0.0873F + $$4;
            this.i.c = 16.94F + $$9;
            this.l.c = 22.0F + $$9;
            this.m.c = 22.0F + $$9;
         case c:
            break;
         case d:
            float $$7 = aye.b((float)$$1);
            float $$8 = aye.a((float)$$1);
            this.j.b = $$7;
            this.j.c = 15.69F + $$8;
            this.j.e = 0.0F;
            this.j.f = 0.0F;
            this.j.g = aye.a((float)$$1) * 0.4F;
            this.f.b = $$7;
            this.f.c = 16.5F + $$8;
            this.h.g = -0.0873F - $$4;
            this.h.b = 1.5F + $$7;
            this.h.c = 16.94F + $$8;
            this.i.g = 0.0873F + $$4;
            this.i.b = -1.5F + $$7;
            this.i.c = 16.94F + $$8;
            this.g.b = $$7;
            this.g.c = 21.07F + $$8;
      }
   }

   private void a(fvi.a $$0) {
      this.k.e = -0.2214F;
      this.f.e = 0.4937F;
      this.h.e = -0.6981F;
      this.h.f = (float) -Math.PI;
      this.i.e = -0.6981F;
      this.i.f = (float) -Math.PI;
      this.l.e = -0.0299F;
      this.m.e = -0.0299F;
      this.l.c = 22.0F;
      this.m.c = 22.0F;
      this.l.g = 0.0F;
      this.m.g = 0.0F;
      switch ($$0) {
         case a:
            this.l.e += (float) (Math.PI * 2.0 / 9.0);
            this.m.e += (float) (Math.PI * 2.0 / 9.0);
         case b:
         case e:
         default:
            break;
         case c:
            float $$1 = 1.9F;
            this.j.c = 17.59F;
            this.g.e = 1.5388988F;
            this.g.c = 22.97F;
            this.f.c = 18.4F;
            this.h.g = -0.0873F;
            this.h.c = 18.84F;
            this.i.g = 0.0873F;
            this.i.c = 18.84F;
            this.l.c++;
            this.m.c++;
            this.l.e++;
            this.m.e++;
            break;
         case d:
            this.l.g = (float) (-Math.PI / 9);
            this.m.g = (float) (Math.PI / 9);
      }
   }

   private static fvi.a a(cfe $$0) {
      if ($$0.gu()) {
         return fvi.a.d;
      } else if ($$0.y()) {
         return fvi.a.c;
      } else {
         return $$0.gA() ? fvi.a.a : fvi.a.b;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
