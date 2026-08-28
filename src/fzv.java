public class fzv extends fxk<gvu> implements fxt, fzu {
   private final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;

   public fzv(gal $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
   }

   public static gat b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      float $$2 = 0.5F;
      gav $$3 = $$1.a("head", gaq.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gan.a);
      gav $$4 = $$3.a("hat", gaq.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gap(0.51F)), gan.a);
      $$4.a("hat_rim", gaq.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gan.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", gaq.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gan.a(0.0F, -2.0F, 0.0F));
      gav $$5 = $$1.a("body", gaq.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gan.a);
      $$5.a("jacket", gaq.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gap(0.5F)), gan.a);
      $$1.a(
         "arms",
         gaq.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gan.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", gaq.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gan.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gaq.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gan.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(gvu $$0) {
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.g = 0.3F * azd.a(0.45F * $$0.p);
         this.b.e = 0.4F;
      } else {
         this.b.g = 0.0F;
      }

      this.e.e = azd.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.f.e = azd.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   @Override
   public gal c() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }
}
