public class gsn extends gtj<clr, gyu, gcf> {
   private static final akv a = akv.b("textures/entity/ghast/ghast.png");
   private static final akv b = akv.b("textures/entity/ghast/ghast_shooting.png");

   public gsn(gsd.a $$0) {
      super($$0, new gcf($$0.a(gfb.aR)), 1.5F);
   }

   public akv a(gyu $$0) {
      return $$0.a ? b : a;
   }

   public gyu b() {
      return new gyu();
   }

   public void a(clr $$0, gyu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
