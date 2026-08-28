public class gou extends gpq<cll, guy, fyp> {
   private static final ali a = ali.b("textures/entity/ghast/ghast.png");
   private static final ali b = ali.b("textures/entity/ghast/ghast_shooting.png");

   public gou(gok.a $$0) {
      super($$0, new fyp($$0.a(gbl.aD)), 1.5F);
   }

   public ali a(guy $$0) {
      return $$0.a ? b : a;
   }

   public guy c() {
      return new guy();
   }

   public void a(cll $$0, guy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}
