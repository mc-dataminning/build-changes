public class fzo extends fxa<gvf> implements fxj, fzk {
   protected final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;

   public fzo(gab $$0) {
      this.b = $$0;
      this.c = $$0.b("head");
      this.d = this.c.b("hat");
      this.e = this.d.b("hat_rim");
      this.a = this.c.b("nose");
      this.f = $$0.b("right_leg");
      this.g = $$0.b("left_leg");
   }

   public static gah b() {
      gaj $$0 = fzl.b();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("head", gag.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gad.a);
      gal $$3 = $$2.a("hat", gag.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), gad.a(-5.0F, -10.03125F, -5.0F));
      gal $$4 = $$3.a("hat2", gag.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), gad.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      gal $$5 = $$4.a("hat3", gag.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), gad.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", gag.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new gaf(0.25F)), gad.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      gal $$6 = $$2.b("nose");
      $$6.a("mole", gag.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new gaf(-0.25F)), gad.a(0.0F, -2.0F, 0.0F));
      return gah.a($$0, 64, 128);
   }

   public void a(gvf $$0) {
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.g = 0.0F;
      this.f.e = azc.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.g.e = azc.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      this.f.f = 0.0F;
      this.g.f = 0.0F;
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$1 = 0.01F * (float)($$0.a % 10);
      this.a.e = azc.a($$0.p * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = azc.b($$0.p * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public gab d() {
      return this.a;
   }

   @Override
   public gab a() {
      return this.b;
   }

   @Override
   public gab c() {
      return this.c;
   }

   @Override
   public void a(boolean $$0) {
      this.c.k = $$0;
      this.d.k = $$0;
      this.e.k = $$0;
   }
}
