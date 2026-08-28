public class fxo<S extends gtl> extends fxa<S> implements fvx, fxj {
   private final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;

   public fxo(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.c.k = false;
      this.d = $$0.b("arms");
      this.e = $$0.b("left_leg");
      this.f = $$0.b("right_leg");
      this.i = $$0.b("left_arm");
      this.g = $$0.b("right_arm");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("head", gag.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gad.a(0.0F, 0.0F, 0.0F));
      $$2.a("hat", gag.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new gaf(0.45F)), gad.a);
      $$2.a("nose", gag.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gad.a(0.0F, -2.0F, 0.0F));
      $$1.a(
         "body",
         gag.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gaf(0.5F)),
         gad.a(0.0F, 0.0F, 0.0F)
      );
      gal $$3 = $$1.a(
         "arms",
         gag.c().a(44, 22).a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F).a(40, 38).a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gad.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$3.a("left_shoulder", gag.c().a(44, 22).a().a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), gad.a);
      $$1.a("right_leg", gag.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gad.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gag.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gad.a(2.0F, 12.0F, 0.0F));
      $$1.a("right_arm", gag.c().a(40, 46).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gad.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gag.c().a(40, 46).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gad.a(5.0F, 2.0F, 0.0F));
      return gah.a($$0, 64, 64);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(S $$0) {
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.g.e = (float) (-Math.PI / 5);
         this.g.f = 0.0F;
         this.g.g = 0.0F;
         this.i.e = (float) (-Math.PI / 5);
         this.i.f = 0.0F;
         this.i.g = 0.0F;
         this.f.e = -1.4137167F;
         this.f.f = (float) (Math.PI / 10);
         this.f.g = 0.07853982F;
         this.e.e = -1.4137167F;
         this.e.f = (float) (-Math.PI / 10);
         this.e.g = -0.07853982F;
      } else {
         float $$1 = $$0.Y;
         float $$2 = $$0.X;
         this.g.e = azc.b($$2 * 0.6662F + (float) Math.PI) * 2.0F * $$1 * 0.5F;
         this.g.f = 0.0F;
         this.g.g = 0.0F;
         this.i.e = azc.b($$2 * 0.6662F) * 2.0F * $$1 * 0.5F;
         this.i.f = 0.0F;
         this.i.g = 0.0F;
         this.f.e = azc.b($$2 * 0.6662F) * 1.4F * $$1 * 0.5F;
         this.f.f = 0.0F;
         this.f.g = 0.0F;
         this.e.e = azc.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1 * 0.5F;
         this.e.f = 0.0F;
         this.e.g = 0.0F;
      }

      ckc.a $$3 = $$0.e;
      if ($$3 == ckc.a.b) {
         if ($$0.aY_().f()) {
            fvv.a(this.i, this.g, true, $$0.h, $$0.p);
         } else {
            fvv.a(this.g, this.i, $$0.d, $$0.h, $$0.p);
         }
      } else if ($$3 == ckc.a.c) {
         this.g.d = 0.0F;
         this.g.b = -5.0F;
         this.i.d = 0.0F;
         this.i.b = 5.0F;
         this.g.e = azc.b($$0.p * 0.6662F) * 0.25F;
         this.i.e = azc.b($$0.p * 0.6662F) * 0.25F;
         this.g.g = (float) (Math.PI * 3.0 / 4.0);
         this.i.g = (float) (-Math.PI * 3.0 / 4.0);
         this.g.f = 0.0F;
         this.i.f = 0.0F;
      } else if ($$3 == ckc.a.d) {
         this.g.f = -0.1F + this.b.f;
         this.g.e = (float) (-Math.PI / 2) + this.b.e;
         this.i.e = -0.9424779F + this.b.e;
         this.i.f = this.b.f - 0.4F;
         this.i.g = (float) (Math.PI / 2);
      } else if ($$3 == ckc.a.e) {
         fvv.a(this.g, this.i, this.b, true);
      } else if ($$3 == ckc.a.f) {
         fvv.a(this.g, this.i, (float)$$0.f, $$0.g, true);
      } else if ($$3 == ckc.a.g) {
         this.g.d = 0.0F;
         this.g.b = -5.0F;
         this.g.e = azc.b($$0.p * 0.6662F) * 0.05F;
         this.g.g = 2.670354F;
         this.g.f = 0.0F;
         this.i.d = 0.0F;
         this.i.b = 5.0F;
         this.i.e = azc.b($$0.p * 0.6662F) * 0.05F;
         this.i.g = (float) (-Math.PI * 3.0 / 4.0);
         this.i.f = 0.0F;
      }

      boolean $$4 = $$3 == ckc.a.a;
      this.d.k = $$4;
      this.i.k = !$$4;
      this.g.k = !$$4;
   }

   private gab a(btz $$0) {
      return $$0 == btz.a ? this.i : this.g;
   }

   public gab d() {
      return this.c;
   }

   @Override
   public gab c() {
      return this.b;
   }

   @Override
   public void a(btz $$0, fcu $$1) {
      this.a.a($$1);
      this.a($$0).a($$1);
   }
}
