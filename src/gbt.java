public class gbt extends fzj<gxv> implements fyg {
   private final gcl a = this.v.b("body");
   private final gcl b = this.a.b("right_arm");
   private final gcl c = this.a.b("left_arm");
   private final gcl d = this.a.b("right_wing");
   private final gcl e = this.a.b("left_wing");
   private final gcl f = this.v.b("head");

   public gbt(gcl $$0) {
      super($$0.b("root"), gjq::i);
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      gcv $$2 = $$1.a("root", gcq.c(), gcn.a(0.0F, -2.5F, 0.0F));
      $$2.a("head", gcq.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new gcp(0.0F)), gcn.a(0.0F, 20.0F, 0.0F));
      gcv $$3 = $$2.a(
         "body",
         gcq.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new gcp(0.0F)).a(0, 16).a(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gcp(-0.2F)),
         gcn.a(0.0F, 20.0F, 0.0F)
      );
      $$3.a("right_arm", gcq.c().a(23, 0).a(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new gcp(-0.1F)), gcn.a(-1.75F, 0.25F, 0.0F));
      $$3.a("left_arm", gcq.c().a(23, 6).a(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new gcp(-0.1F)), gcn.a(1.75F, 0.25F, 0.0F));
      $$3.a("left_wing", gcq.c().a(16, 14).a().a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gcp(0.0F)).a(false), gcn.a(0.5F, 1.0F, 1.0F));
      $$3.a("right_wing", gcq.c().a(16, 14).a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gcp(0.0F)), gcn.a(-0.5F, 1.0F, 1.0F));
      return gcr.a($$0, 32, 32);
   }

   public void a(gxv $$0) {
      super.a($$0);
      this.f.f = $$0.U * (float) (Math.PI / 180.0);
      this.f.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = azm.b($$0.p * 5.5F * (float) (Math.PI / 180.0)) * 0.1F;
      this.b.g = (float) (Math.PI / 5) + $$1;
      this.c.g = -((float) (Math.PI / 5) + $$1);
      if ($$0.a) {
         this.a.e = 0.0F;
         this.a(!$$0.ar.f(), !$$0.at.f(), $$1);
      } else {
         this.a.e = (float) (Math.PI / 20);
      }

      this.e.f = 1.0995574F + azm.b($$0.p * 45.836624F * (float) (Math.PI / 180.0)) * (float) (Math.PI / 180.0) * 16.2F;
      this.d.f = -this.e.f;
      this.e.e = 0.47123888F;
      this.e.g = -0.47123888F;
      this.d.e = 0.47123888F;
      this.d.g = 0.47123888F;
   }

   private void a(boolean $$0, boolean $$1, float $$2) {
      if (!$$0 && !$$1) {
         this.b.e = -1.2217305F;
         this.b.f = (float) (Math.PI / 12);
         this.b.g = -0.47123888F - $$2;
         this.c.e = -1.2217305F;
         this.c.f = (float) (-Math.PI / 12);
         this.c.g = 0.47123888F + $$2;
      } else {
         if ($$0) {
            this.b.e = (float) (Math.PI * 7.0 / 6.0);
            this.b.f = (float) (Math.PI / 12);
            this.b.g = -0.47123888F - $$2;
         }

         if ($$1) {
            this.c.e = (float) (Math.PI * 7.0 / 6.0);
            this.c.f = (float) (-Math.PI / 12);
            this.c.g = 0.47123888F + $$2;
         }
      }
   }

   @Override
   public void a(bvb $$0, fer $$1) {
      boolean $$2 = $$0 == bvb.b;
      gcl $$3 = $$2 ? this.b : this.c;
      this.v.a($$1);
      this.a.a($$1);
      $$3.a($$1);
      $$1.b(0.55F, 0.55F, 0.55F);
      this.a($$1, $$2);
   }

   private void a(fer $$0, boolean $$1) {
      if ($$1) {
         $$0.a(0.046875, -0.15625, 0.078125);
      } else {
         $$0.a(-0.046875, -0.15625, 0.078125);
      }
   }
}
