public class gut extends grc<cpg, hap> {
   public static final akv a = akv.b("textures/entity/projectiles/arrow.png");
   public static final akv b = akv.b("textures/entity/projectiles/tipped_arrow.png");

   public gut(gse.a $$0) {
      super($$0);
   }

   protected akv a(hap $$0) {
      return $$0.d ? b : a;
   }

   public hap a() {
      return new hap();
   }

   public void a(cpg $$0, hap $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.D() > 0;
   }
}
