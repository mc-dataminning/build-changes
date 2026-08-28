public class gki extends gic<hfr> {
   private final glg a;

   public gki(glg $$0) {
      super($$0, gsn::g);
      this.a = $$0.b("tail");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gll.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gli.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gll.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gli.a(0.0F, 22.0F, 0.0F));
      return glm.a($$0, 16, 16);
   }

   public void a(hfr $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azq.a(0.3F * $$0.u);
   }
}
