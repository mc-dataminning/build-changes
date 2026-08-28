public class gdu extends gdv {
   protected final gfa a;

   public gdu(gfa $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gfi a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("head", gff.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfc.a);
      return $$0;
   }

   public static gfg b() {
      gfi $$0 = a();
      gfk $$1 = $$0.a();
      $$1.b("head").a("hat", gff.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfe(0.25F)), gfc.a);
      return gfg.a($$0, 64, 64);
   }

   public static gfg c() {
      gfi $$0 = a();
      return gfg.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
