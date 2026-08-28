public class gpk extends gqg<clp, gvo, fzf> {
   private static final all a = all.b("textures/entity/ghast/ghast.png");
   private static final all b = all.b("textures/entity/ghast/ghast_shooting.png");

   public gpk(gpa.a $$0) {
      super($$0, new fzf($$0.a(gcb.aD)), 1.5F);
   }

   public all a(gvo $$0) {
      return $$0.a ? b : a;
   }

   public gvo c() {
      return new gvo();
   }

   public void a(clp $$0, gvo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}
