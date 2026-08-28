public class fzg extends fxa<guz> {
   private final gab a;
   private final gab b;

   public fzg(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static gah a(gaf $$0) {
      gaj $$1 = new gaj();
      gal $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", gag.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gad.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", gag.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gad.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", gag.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gad.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", gag.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gad.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", gag.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gad.a(0.0F, 20.5F, -3.0F));
      return gah.a($$1, 32, 32);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(guz $$0) {
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.b.f = -$$1 * 0.45F * azc.a(0.6F * $$0.p);
   }
}
