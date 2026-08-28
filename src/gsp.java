public class gsp extends gtl<clt, gyw, gch> {
   private static final akv a = akv.b("textures/entity/ghast/ghast.png");
   private static final akv b = akv.b("textures/entity/ghast/ghast_shooting.png");

   public gsp(gsf.a $$0) {
      super($$0, new gch($$0.a(gfd.aR)), 1.5F);
   }

   public akv a(gyw $$0) {
      return $$0.a ? b : a;
   }

   public gyw b() {
      return new gyw();
   }

   public void a(clt $$0, gyw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
