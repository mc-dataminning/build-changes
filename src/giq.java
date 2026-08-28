public class giq extends ggk<hdz> {
   private final gjo a;

   public giq(gjo $$0) {
      super($$0, gqx::g);
      this.a = $$0.b("tail");
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gjt.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gjq.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gjt.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gjq.a(0.0F, 22.0F, 0.0F));
      return gju.a($$0, 16, 16);
   }

   public void a(hdz $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azm.a(0.3F * $$0.u);
   }
}
