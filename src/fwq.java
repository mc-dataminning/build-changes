public class fwq extends fxa<gts> {
   private final gab a;
   private final gab b;

   public fwq(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gag.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gad.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gag.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gad.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gag.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gad.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gag.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gad.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gag.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gad.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gag.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gad.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gag.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gad.a(0.0F, 20.0F, 0.0F));
      return gah.a($$0, 32, 32);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(gts $$0) {
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.b.f = -$$1 * 0.45F * azc.a(0.6F * $$0.p);
   }
}
