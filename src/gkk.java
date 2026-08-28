public class gkk extends gic<hgx> {
   private final glg a;

   public gkk(glg $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static glm a(glk $$0) {
      glo $$1 = new glo();
      glq $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", gll.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gli.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", gll.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gli.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", gll.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gli.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", gll.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gli.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", gll.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gli.a(0.0F, 20.5F, -3.0F));
      return glm.a($$1, 32, 32);
   }

   public void a(hgx $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azq.a(0.6F * $$0.u);
   }
}
