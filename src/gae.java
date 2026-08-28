public class gae extends fxz<gva> {
   private final gbb a;

   public gae(gbb $$0) {
      super($$0, gig::f);
      this.a = $$0.b("tail");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gbg.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gbd.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gbg.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gbd.a(0.0F, 22.0F, 0.0F));
      return gbh.a($$0, 16, 16);
   }

   public void a(gva $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azj.a(0.3F * $$0.p);
   }
}
