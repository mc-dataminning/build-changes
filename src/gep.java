public class gep extends gca<haw> implements gcj, gel {
   protected final gfc a;
   private final gfc b;
   private final gfc c;
   private final gfc d;
   private final gfc e;
   private final gfc f;
   private final gfc g;

   public gep(gfc $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.a = this.b.b("nose");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gfi a() {
      gfk $$0 = gem.a();
      gfm $$1 = $$0.a();
      gfm $$2 = $$1.a("head", gfh.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gfe.a);
      gfm $$3 = $$2.a("hat", gfh.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), gfe.a(-5.0F, -10.03125F, -5.0F));
      gfm $$4 = $$3.a("hat2", gfh.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), gfe.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      gfm $$5 = $$4.a("hat3", gfh.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), gfe.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", gfh.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new gfg(0.25F)), gfe.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      gfm $$6 = $$2.b("nose");
      $$6.a("mole", gfh.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new gfg(-0.25F)), gfe.a(0.0F, -2.0F, 0.0F));
      return gfi.a($$0, 64, 128);
   }

   public void a(haw $$0) {
      super.a($$0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.e.e = ayz.b($$0.ad * 0.6662F) * 1.4F * $$0.ae * 0.5F;
      this.f.e = ayz.b($$0.ad * 0.6662F + (float) Math.PI) * 1.4F * $$0.ae * 0.5F;
      float $$1 = 0.01F * (float)($$0.a % 10);
      this.a.e = ayz.a($$0.u * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.g = ayz.b($$0.u * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public gfc c() {
      return this.a;
   }

   @Override
   public gfc b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(fft $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
