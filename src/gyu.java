public class gyu extends gzq<cov, hfc, gii> {
   private static final alk a = alk.b("textures/entity/ghast/ghast.png");
   private static final alk j = alk.b("textures/entity/ghast/ghast_shooting.png");

   public gyu(gyk.a $$0) {
      super($$0, new gii($$0.a(glf.bb)), 1.5F);
   }

   public alk a(hfc $$0) {
      return $$0.a ? j : a;
   }

   public hfc b() {
      return new hfc();
   }

   public void a(cov $$0, hfc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
