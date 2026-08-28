public class fzl extends fxa<gvd> implements fxj, fzk {
   private final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;

   public fzl(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
   }

   public static gaj b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = 0.5F;
      gal $$3 = $$1.a("head", gag.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gad.a);
      gal $$4 = $$3.a("hat", gag.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gaf(0.51F)), gad.a);
      $$4.a("hat_rim", gag.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gad.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", gag.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gad.a(0.0F, -2.0F, 0.0F));
      gal $$5 = $$1.a("body", gag.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gad.a);
      $$5.a("jacket", gag.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gaf(0.5F)), gad.a);
      $$1.a(
         "arms",
         gag.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gad.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", gag.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gad.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gag.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gad.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(gvd $$0) {
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.g = 0.3F * azc.a(0.45F * $$0.p);
         this.b.e = 0.4F;
      } else {
         this.b.g = 0.0F;
      }

      this.e.e = azc.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.f.e = azc.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   @Override
   public gab c() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }
}
