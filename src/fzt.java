public class fzt extends fxk<gvs> implements fwh {
   private final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;

   public fzt(gal $$0) {
      super(ghq::i);
      this.a = $$0.b("root");
      this.b = this.a.b("body");
      this.c = this.b.b("right_arm");
      this.d = this.b.b("left_arm");
      this.e = this.b.b("right_wing");
      this.f = this.b.b("left_wing");
      this.g = this.a.b("head");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("root", gaq.c(), gan.a(0.0F, -2.5F, 0.0F));
      $$2.a("head", gaq.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new gap(0.0F)), gan.a(0.0F, 20.0F, 0.0F));
      gav $$3 = $$2.a(
         "body",
         gaq.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new gap(0.0F)).a(0, 16).a(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gap(-0.2F)),
         gan.a(0.0F, 20.0F, 0.0F)
      );
      $$3.a("right_arm", gaq.c().a(23, 0).a(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new gap(-0.1F)), gan.a(-1.75F, 0.25F, 0.0F));
      $$3.a("left_arm", gaq.c().a(23, 6).a(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new gap(-0.1F)), gan.a(1.75F, 0.25F, 0.0F));
      $$3.a("left_wing", gaq.c().a(16, 14).a().a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gap(0.0F)).a(false), gan.a(0.5F, 1.0F, 1.0F));
      $$3.a("right_wing", gaq.c().a(16, 14).a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gap(0.0F)), gan.a(-0.5F, 1.0F, 1.0F));
      return gar.a($$0, 32, 32);
   }

   public void a(gvs $$0) {
      this.a().e().forEach(gal::c);
      this.g.f = $$0.U * (float) (Math.PI / 180.0);
      this.g.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = azd.b($$0.p * 5.5F * (float) (Math.PI / 180.0)) * 0.1F;
      this.c.g = (float) (Math.PI / 5) + $$1;
      this.d.g = -((float) (Math.PI / 5) + $$1);
      if ($$0.a) {
         this.b.e = 0.0F;
         this.a(!$$0.ar.f(), !$$0.at.f(), $$1);
      } else {
         this.b.e = (float) (Math.PI / 20);
      }

      this.f.f = 1.0995574F + azd.b($$0.p * 45.836624F * (float) (Math.PI / 180.0)) * (float) (Math.PI / 180.0) * 16.2F;
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
   public gal a() {
      return this.a;
   }

   @Override
   public void a(bue $$0, fde $$1) {
      boolean $$2 = $$0 == bue.b;
      gal $$3 = $$2 ? this.c : this.d;
      this.a.a($$1);
      this.b.a($$1);
      $$3.a($$1);
      $$1.b(0.55F, 0.55F, 0.55F);
      this.a($$1, $$2);
   }

   private void a(fde $$0, boolean $$1) {
      if ($$1) {
         $$0.a(0.046875, -0.15625, 0.078125);
      } else {
         $$0.a(-0.046875, -0.15625, 0.078125);
      }
   }
}
