public class fzj extends fxa<gvb> implements fvx {
   private final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;

   public fzj(gab $$0) {
      super(ghe::j);
      this.a = $$0.b("root");
      this.b = this.a.b("body");
      this.c = this.b.b("right_arm");
      this.d = this.b.b("left_arm");
      this.e = this.b.b("right_wing");
      this.f = this.b.b("left_wing");
      this.g = this.a.b("head");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("root", gag.c(), gad.a(0.0F, -2.5F, 0.0F));
      $$2.a("head", gag.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new gaf(0.0F)), gad.a(0.0F, 20.0F, 0.0F));
      gal $$3 = $$2.a(
         "body",
         gag.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new gaf(0.0F)).a(0, 16).a(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gaf(-0.2F)),
         gad.a(0.0F, 20.0F, 0.0F)
      );
      $$3.a("right_arm", gag.c().a(23, 0).a(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new gaf(-0.1F)), gad.a(-1.75F, 0.25F, 0.0F));
      $$3.a("left_arm", gag.c().a(23, 6).a(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new gaf(-0.1F)), gad.a(1.75F, 0.25F, 0.0F));
      $$3.a("left_wing", gag.c().a(16, 14).a().a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gaf(0.0F)).a(false), gad.a(0.5F, 1.0F, 1.0F));
      $$3.a("right_wing", gag.c().a(16, 14).a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gaf(0.0F)), gad.a(-0.5F, 1.0F, 1.0F));
      return gah.a($$0, 32, 32);
   }

   public void a(gvb $$0) {
      this.a().e().forEach(gab::c);
      this.g.f = $$0.U * (float) (Math.PI / 180.0);
      this.g.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = azc.b($$0.p * 5.5F * (float) (Math.PI / 180.0)) * 0.1F;
      this.c.g = (float) (Math.PI / 5) + $$1;
      this.d.g = -((float) (Math.PI / 5) + $$1);
      if ($$0.a) {
         this.b.e = 0.0F;
         this.a(!$$0.ar.f(), !$$0.at.f(), $$1);
      } else {
         this.b.e = (float) (Math.PI / 20);
      }

      this.f.f = 1.0995574F + azc.b($$0.p * 45.836624F * (float) (Math.PI / 180.0)) * (float) (Math.PI / 180.0) * 16.2F;
      this.e.f = -this.f.f;
      this.f.e = 0.47123888F;
      this.f.g = -0.47123888F;
      this.e.e = 0.47123888F;
      this.e.g = 0.47123888F;
   }

   private void a(boolean $$0, boolean $$1, float $$2) {
      if (!$$0 && !$$1) {
         this.c.e = -1.2217305F;
         this.c.f = (float) (Math.PI / 12);
         this.c.g = -0.47123888F - $$2;
         this.d.e = -1.2217305F;
         this.d.f = (float) (-Math.PI / 12);
         this.d.g = 0.47123888F + $$2;
      } else {
         if ($$0) {
            this.c.e = (float) (Math.PI * 7.0 / 6.0);
            this.c.f = (float) (Math.PI / 12);
            this.c.g = -0.47123888F - $$2;
         }

         if ($$1) {
            this.d.e = (float) (Math.PI * 7.0 / 6.0);
            this.d.f = (float) (-Math.PI / 12);
            this.d.g = 0.47123888F + $$2;
         }
      }
   }

   @Override
   public gab a() {
      return this.a;
   }

   @Override
   public void a(btz $$0, fcu $$1) {
      boolean $$2 = $$0 == btz.b;
      gab $$3 = $$2 ? this.c : this.d;
      this.a.a($$1);
      this.b.a($$1);
      $$3.a($$1);
      $$1.b(0.55F, 0.55F, 0.55F);
      this.a($$1, $$2);
   }

   private void a(fcu $$0, boolean $$1) {
      if ($$1) {
         $$0.a(0.046875, -0.15625, 0.078125);
      } else {
         $$0.a(-0.046875, -0.15625, 0.078125);
      }
   }
}
