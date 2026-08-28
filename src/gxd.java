public class gxd extends gxz<coe, hdk, ggq> {
   private static final alg a = alg.b("textures/entity/ghast/ghast.png");
   private static final alg j = alg.b("textures/entity/ghast/ghast_shooting.png");

   public gxd(gwt.a $$0) {
      super($$0, new ggq($$0.a(gjn.bb)), 1.5F);
   }

   public alg a(hdk $$0) {
      return $$0.a ? j : a;
   }

   public hdk b() {
      return new hdk();
   }

   public void a(coe $$0, hdk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
