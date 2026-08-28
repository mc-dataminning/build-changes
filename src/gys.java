public class gys extends gzo<cot, hfa, gig> {
   private static final ali a = ali.b("textures/entity/ghast/ghast.png");
   private static final ali j = ali.b("textures/entity/ghast/ghast_shooting.png");

   public gys(gyi.a $$0) {
      super($$0, new gig($$0.a(gld.bb)), 1.5F);
   }

   public ali a(hfa $$0) {
      return $$0.a ? j : a;
   }

   public hfa b() {
      return new hfa();
   }

   public void a(cot $$0, hfa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
