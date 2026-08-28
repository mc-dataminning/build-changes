public class fwt extends fxa<gsp> {
   public static final gak a = gak.scaling(0.5F);
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;

   public fwt(gab $$0) {
      this.b = $$0;
      this.c = $$0.b("body");
      this.d = this.c.b("tail");
      this.e = this.d.b("tail_fin");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = 18.0F;
      float $$3 = -8.0F;
      gal $$4 = $$1.a("body", gag.c().a(22, 0).a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), gad.a(0.0F, 22.0F, -5.0F));
      $$4.a("back_fin", gag.c().a(51, 0).a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), gad.b((float) (Math.PI / 3), 0.0F, 0.0F));
      $$4.a(
         "left_fin",
         gag.c().a(48, 20).a().a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gad.a(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      $$4.a(
         "right_fin",
         gag.c().a(48, 20).a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gad.a(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      gal $$5 = $$4.a("tail", gag.c().a(0, 19).a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), gad.a(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F));
      $$5.a("tail_fin", gag.c().a(19, 20).a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), gad.a(0.0F, 0.0F, 9.0F));
      gal $$6 = $$4.a("head", gag.c().a(0, 0).a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), gad.a(0.0F, -4.0F, -3.0F));
      $$6.a("nose", gag.c().a(0, 13).a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), gad.a);
      return gah.a($$0, 64, 64);
   }

   @Override
   public gab a() {
      return this.b;
   }

   public void a(gsp $$0) {
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.c.e = this.c.e + (-0.05F - 0.05F * azc.b($$0.p * 0.3F));
         this.d.e = -0.1F * azc.b($$0.p * 0.3F);
         this.e.e = -0.2F * azc.b($$0.p * 0.3F);
      }
   }
}
