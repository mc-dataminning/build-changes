public class gho extends gic<hfr> {
   private final glg a;

   public gho(glg $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gll.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gli.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gll.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gli.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gll.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gli.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gll.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gli.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gll.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gli.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gll.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gli.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gll.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gli.a(0.0F, 20.0F, 0.0F));
      return glm.a($$0, 32, 32);
   }

   public void a(hfr $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azq.a(0.6F * $$0.u);
   }
}
