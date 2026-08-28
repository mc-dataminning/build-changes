public class gcy extends gew {
   private final ghd a;

   public gcy(ghd $$0) {
      super($$0, goi::d);
      this.a = $$0.b("flag");
   }

   public static ghj a(boolean $$0) {
      ghl $$1 = new ghl();
      ghn $$2 = $$1.a();
      $$2.a("flag", ghi.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), ghf.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return ghj.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * azk.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
