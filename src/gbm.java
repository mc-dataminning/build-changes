public class gbm extends gbl<gxw> {
   private static final String a = "base";
   private static final String b = "upper_jaw";
   private static final String c = "lower_jaw";
   private final gen d;
   private final gen e;
   private final gen f;

   public gbm(gen $$0) {
      super($$0);
      this.d = $$0.b("base");
      this.e = this.d.b("upper_jaw");
      this.f = this.d.b("lower_jaw");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      gex $$2 = $$1.a("base", ges.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F), gep.a(-5.0F, 24.0F, -5.0F));
      ges $$3 = ges.c().a(40, 0).a(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      $$2.a("upper_jaw", $$3, gep.a(6.5F, 0.0F, 1.0F, 0.0F, 0.0F, 2.042035F));
      $$2.a("lower_jaw", $$3, gep.a(3.5F, 0.0F, 9.0F, 0.0F, (float) Math.PI, 4.2411504F));
      return get.a($$0, 64, 32);
   }

   public void a(gxw $$0) {
      super.a($$0);
      float $$1 = $$0.b;
      float $$2 = Math.min($$1 * 2.0F, 1.0F);
      $$2 = 1.0F - $$2 * $$2 * $$2;
      this.e.g = (float) Math.PI - $$2 * 0.35F * (float) Math.PI;
      this.f.g = (float) Math.PI + $$2 * 0.35F * (float) Math.PI;
      this.d.c = this.d.c - ($$1 + bae.a($$1 * 2.7F)) * 7.2F;
      float $$3 = 1.0F;
      if ($$1 > 0.9F) {
         $$3 *= (1.0F - $$1) / 0.1F;
      }

      this.v.c = 24.0F - 20.0F * $$3;
      this.v.h = $$3;
      this.v.i = $$3;
      this.v.j = $$3;
   }
}
