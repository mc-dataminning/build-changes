public class ggg extends gea<hbk> {
   private final ghd a;

   public ggg(ghd $$0) {
      super($$0, goi::g);
      this.a = $$0.b("tail");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", ghi.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), ghf.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", ghi.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), ghf.a(0.0F, 22.0F, 0.0F));
      return ghj.a($$0, 16, 16);
   }

   public void a(hbk $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azk.a(0.3F * $$0.u);
   }
}
