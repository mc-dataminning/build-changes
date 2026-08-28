public class gby extends fzj<gxz> implements fzs, gbu {
   protected final gcl a;
   private final gcl b;
   private final gcl c;
   private final gcl d;
   private final gcl e;
   private final gcl f;

   public gby(gcl $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.a = this.b.b("nose");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
   }

   public static gcr a() {
      gct $$0 = gbv.a();
      gcv $$1 = $$0.a();
      gcv $$2 = $$1.a("head", gcq.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gcn.a);
      gcv $$3 = $$2.a("hat", gcq.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), gcn.a(-5.0F, -10.03125F, -5.0F));
      gcv $$4 = $$3.a("hat2", gcq.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), gcn.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      gcv $$5 = $$4.a("hat3", gcq.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), gcn.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", gcq.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new gcp(0.25F)), gcn.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      gcv $$6 = $$2.b("nose");
      $$6.a("mole", gcq.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new gcp(-0.25F)), gcn.a(0.0F, -2.0F, 0.0F));
      return gcr.a($$0, 64, 128);
   }

   public void a(gxz $$0) {
      super.a($$0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.e.e = azm.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.f.e = azm.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      float $$1 = 0.01F * (float)($$0.a % 10);
      this.a.e = azm.a($$0.p * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.g = azm.b($$0.p * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public gcl c() {
      return this.a;
   }

   @Override
   public gcl b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }
}
