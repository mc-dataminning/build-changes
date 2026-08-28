public class gdm extends gbh<gyo> {
   private final gej a;

   public gdm(gej $$0) {
      super($$0, glq::g);
      this.a = $$0.b("tail");
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", geo.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gel.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", geo.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gel.a(0.0F, 22.0F, 0.0F));
      return gep.a($$0, 16, 16);
   }

   public void a(gyo $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azu.a(0.3F * $$0.p);
   }
}
