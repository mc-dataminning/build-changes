public class grv extends gsr<cmi, gyb, gbm> {
   private static final alp a = alp.b("textures/entity/ghast/ghast.png");
   private static final alp b = alp.b("textures/entity/ghast/ghast_shooting.png");

   public grv(grl.a $$0) {
      super($$0, new gbm($$0.a(gei.aR)), 1.5F);
   }

   public alp a(gyb $$0) {
      return $$0.a ? b : a;
   }

   public gyb b() {
      return new gyb();
   }

   public void a(cmi $$0, gyb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
