public class fwi extends fvr<cfu> {
   private static final String a = "feather";
   private final fyi b;
   private final fyi f;
   private final fyi g;
   private final fyi h;
   private final fyi i;
   private final fyi j;
   private final fyi k;
   private final fyi l;
   private final fyi m;

   public fwi(fyi $$0) {
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

   public static fyo b() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("body", fyn.c().a(2, 8).a(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), fyk.a(0.0F, 16.5F, -3.0F));
      $$1.a("tail", fyn.c().a(22, 1).a(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F), fyk.a(0.0F, 21.07F, 1.16F));
      $$1.a("left_wing", fyn.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), fyk.a(1.5F, 16.94F, -2.76F));
      $$1.a("right_wing", fyn.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), fyk.a(-1.5F, 16.94F, -2.76F));
      fyr $$2 = $$1.a("head", fyn.c().a(2, 2).a(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), fyk.a(0.0F, 15.69F, -2.76F));
      $$2.a("head2", fyn.c().a(10, 0).a(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F), fyk.a(0.0F, -2.0F, -1.0F));
      $$2.a("beak1", fyn.c().a(11, 7).a(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), fyk.a(0.0F, -0.5F, -1.5F));
      $$2.a("beak2", fyn.c().a(16, 7).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), fyk.a(0.0F, -1.75F, -2.45F));
      $$2.a("feather", fyn.c().a(2, 18).a(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F), fyk.a(0.0F, -2.15F, 0.15F));
      fyn $$3 = fyn.c().a(14, 18).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      $$1.a("left_leg", $$3, fyk.a(1.0F, 22.0F, -1.05F));
      $$1.a("right_leg", $$3, fyk.a(-1.0F, 22.0F, -1.05F));
      return fyo.a($$0, 32, 32);
   }

   @Override
   public fyi a() {
      return this.b;
   }

   public void a(cfu $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a(a($$0), $$0.ai, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cfu $$0, float $$1, float $$2, float $$3) {
      this.a(a($$0));
   }

   public void a(fbg $$0, fbk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7, int $$8) {
      this.a(fwi.a.e);
      this.a(fwi.a.e, $$8, $$4, $$5, 0.0F, $$6, $$7);
      this.b.a($$0, $$1, $$2, $$3);
   }

   private void a(fwi.a $$0, int $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
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
            this.l.e = this.l.e + ayo.b($$2 * 0.6662F) * 1.4F * $$3;
            this.m.e = this.m.e + ayo.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$3;
         case a:
         case e:
         default:
            float $$9 = $$4 * 0.3F;
            this.j.c = 15.69F + $$9;
            this.g.e = 1.015F + ayo.b($$2 * 0.6662F) * 0.3F * $$3;
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
            float $$7 = ayo.b((float)$$1);
            float $$8 = ayo.a((float)$$1);
            this.j.b = $$7;
            this.j.c = 15.69F + $$8;
            this.j.e = 0.0F;
            this.j.f = 0.0F;
            this.j.g = ayo.a((float)$$1) * 0.4F;
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

   private void a(fwi.a $$0) {
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

   private static fwi.a a(cfu $$0) {
      if ($$0.gw()) {
         return fwi.a.d;
      } else if ($$0.x()) {
         return fwi.a.c;
      } else {
         return $$0.gy() ? fwi.a.a : fwi.a.b;
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
