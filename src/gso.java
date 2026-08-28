public class gso extends gtk<cls, gyv, gcg> {
   private static final akv a = akv.b("textures/entity/ghast/ghast.png");
   private static final akv b = akv.b("textures/entity/ghast/ghast_shooting.png");

   public gso(gse.a $$0) {
      super($$0, new gcg($$0.a(gfc.aR)), 1.5F);
   }

   public akv a(gyv $$0) {
      return $$0.a ? b : a;
   }

   public gyv b() {
      return new gyv();
   }

   public void a(cls $$0, gyv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
