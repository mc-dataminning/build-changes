public class fxy extends fxa<gub> {
   private static final String a = "feather";
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;

   public fxy(gab $$0) {
      this.b = $$0;
      this.c = $$0.b("body");
      this.d = $$0.b("tail");
      this.e = $$0.b("left_wing");
      this.f = $$0.b("right_wing");
      this.g = $$0.b("head");
      this.i = $$0.b("left_leg");
      this.j = $$0.b("right_leg");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("body", gag.c().a(2, 8).a(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), gad.a(0.0F, 16.5F, -3.0F, 0.4937F, 0.0F, 0.0F));
      $$1.a("tail", gag.c().a(22, 1).a(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F), gad.a(0.0F, 21.07F, 1.16F, 1.015F, 0.0F, 0.0F));
      $$1.a("left_wing", gag.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), gad.a(1.5F, 16.94F, -2.76F, -0.6981F, (float) -Math.PI, 0.0F));
      $$1.a("right_wing", gag.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), gad.a(-1.5F, 16.94F, -2.76F, -0.6981F, (float) -Math.PI, 0.0F));
      gal $$2 = $$1.a("head", gag.c().a(2, 2).a(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), gad.a(0.0F, 15.69F, -2.76F));
      $$2.a("head2", gag.c().a(10, 0).a(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F), gad.a(0.0F, -2.0F, -1.0F));
      $$2.a("beak1", gag.c().a(11, 7).a(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), gad.a(0.0F, -0.5F, -1.5F));
      $$2.a("beak2", gag.c().a(16, 7).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), gad.a(0.0F, -1.75F, -2.45F));
      $$2.a("feather", gag.c().a(2, 18).a(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F), gad.a(0.0F, -2.15F, 0.15F, -0.2214F, 0.0F, 0.0F));
      gag $$3 = gag.c().a(14, 18).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      $$1.a("left_leg", $$3, gad.a(1.0F, 22.0F, -1.05F, -0.0299F, 0.0F, 0.0F));
      $$1.a("right_leg", $$3, gad.a(-1.0F, 22.0F, -1.05F, -0.0299F, 0.0F, 0.0F));
      return gah.a($$0, 32, 32);
   }

   @Override
   public gab a() {
      return this.b;
   }

   public void a(gub $$0) {
      this.a($$0.c);
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      this.a($$0.c, $$0.p, $$1, $$2, $$0.b, $$0.U, $$0.V);
   }

   public void a(fcu $$0, fcy $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
      this.a(fxy.a.e);
      this.a(fxy.a.e, $$8, $$4, $$5, 0.0F, $$6, $$7);
      this.b.a($$0, $$1, $$2, $$3);
   }

   private void a(fxy.a $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      this.g.e = $$6 * (float) (Math.PI / 180.0);
      this.g.f = $$5 * (float) (Math.PI / 180.0);
      switch ($$0) {
         case b:
            this.i.e = this.i.e + azc.b($$2 * 0.6662F) * 1.4F * $$3;
            this.j.e = this.j.e + azc.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$3;
         case a:
         case e:
         default:
            float $$9 = $$4 * 0.3F;
            this.g.c += $$9;
            this.d.e = this.d.e + azc.b($$2 * 0.6662F) * 0.3F * $$3;
            this.d.c += $$9;
            this.c.c += $$9;
            this.e.g = -0.0873F - $$4;
            this.e.c += $$9;
            this.f.g = 0.0873F + $$4;
            this.f.c += $$9;
            this.i.c += $$9;
            this.j.c += $$9;
         case c:
            break;
         case d:
            float $$7 = azc.b($$1);
            float $$8 = azc.a($$1);
            this.g.b += $$7;
            this.g.c += $$8;
            this.g.e = 0.0F;
            this.g.f = 0.0F;
            this.g.g = azc.a($$1) * 0.4F;
            this.c.b += $$7;
            this.c.c += $$8;
            this.e.g = -0.0873F - $$4;
            this.e.b += $$7;
            this.e.c += $$8;
            this.f.g = 0.0873F + $$4;
            this.f.b += $$7;
            this.f.c += $$8;
            this.d.b += $$7;
            this.d.c += $$8;
      }
   }

   private void a(fxy.a $$0) {
      this.c.c();
      this.g.c();
      this.d.c();
      this.f.c();
      this.e.c();
      this.i.c();
      this.j.c();
      switch ($$0) {
         case a:
            this.i.e += (float) (Math.PI * 2.0 / 9.0);
            this.j.e += (float) (Math.PI * 2.0 / 9.0);
         case b:
         case e:
         default:
            break;
         case c:
            float $$1 = 1.9F;
            this.g.c++;
            this.d.e += (float) (Math.PI / 6);
            this.d.c++;
            this.c.c++;
            this.e.g = -0.0873F;
            this.e.c++;
            this.f.g = 0.0873F;
            this.f.c++;
            this.i.c++;
            this.j.c++;
            this.i.e++;
            this.j.e++;
            break;
         case d:
            this.i.g = (float) (-Math.PI / 9);
            this.j.g = (float) (Math.PI / 9);
      }
   }

   public static fxy.a a(cgl $$0) {
      if ($$0.gB()) {
         return fxy.a.d;
      } else if ($$0.y()) {
         return fxy.a.c;
      } else {
         return $$0.gD() ? fxy.a.a : fxy.a.b;
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
