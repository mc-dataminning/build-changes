public class gpu extends gqq<cls, gvz, fzo> {
   private static final alj a = alj.b("textures/entity/ghast/ghast.png");
   private static final alj b = alj.b("textures/entity/ghast/ghast_shooting.png");

   public gpu(gpk.a $$0) {
      super($$0, new fzo($$0.a(gck.aN)), 1.5F);
   }

   public alj a(gvz $$0) {
      return $$0.a ? b : a;
   }

   public gvz b() {
      return new gvz();
   }

   public void a(cls $$0, gvz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n();
   }
}
