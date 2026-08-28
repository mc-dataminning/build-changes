public class fzy extends fxk<gvw> implements fxt, fzu {
   protected final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;

   public fzy(gal $$0) {
      this.b = $$0;
      this.c = $$0.b("head");
      this.d = this.c.b("hat");
      this.e = this.d.b("hat_rim");
      this.a = this.c.b("nose");
      this.f = $$0.b("right_leg");
      this.g = $$0.b("left_leg");
   }

   public static gar b() {
      gat $$0 = fzv.b();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("head", gaq.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gan.a);
      gav $$3 = $$2.a("hat", gaq.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), gan.a(-5.0F, -10.03125F, -5.0F));
      gav $$4 = $$3.a("hat2", gaq.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), gan.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      gav $$5 = $$4.a("hat3", gaq.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), gan.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", gaq.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new gap(0.25F)), gan.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      gav $$6 = $$2.b("nose");
      $$6.a("mole", gaq.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new gap(-0.25F)), gan.a(0.0F, -2.0F, 0.0F));
      return gar.a($$0, 64, 128);
   }

   public void a(gvw $$0) {
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.g = 0.0F;
      this.f.e = azd.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.g.e = azd.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      this.f.f = 0.0F;
      this.g.f = 0.0F;
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$1 = 0.01F * (float)($$0.a % 10);
      this.a.e = azd.a($$0.p * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = azd.b($$0.p * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public gal d() {
      return this.a;
   }

   @Override
   public gal a() {
      return this.b;
   }

   @Override
   public gal c() {
      return this.c;
   }

   @Override
   public void a(boolean $$0) {
      this.c.k = $$0;
      this.d.k = $$0;
      this.e.k = $$0;
   }
}
