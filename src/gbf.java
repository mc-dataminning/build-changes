public class gbf extends gbg {
   protected final gcl a;

   public gbf(gcl $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gct a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("head", gcq.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gcn.a);
      return $$0;
   }

   public static gcr b() {
      gct $$0 = a();
      gcv $$1 = $$0.a();
      $$1.b("head").a("hat", gcq.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gcp(0.25F)), gcn.a);
      return gcr.a($$0, 64, 64);
   }

   public static gcr c() {
      gct $$0 = a();
      return gcr.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
