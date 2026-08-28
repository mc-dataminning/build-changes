public class fze extends fxa<gts> {
   private final gab a;
   private final gab b;

   public fze(gab $$0) {
      super(ghe::f);
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gag.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gad.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gag.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gad.a(0.0F, 22.0F, 0.0F));
      return gah.a($$0, 16, 16);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(gts $$0) {
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.b.f = -$$1 * 0.25F * azc.a(0.3F * $$0.p);
   }
}
