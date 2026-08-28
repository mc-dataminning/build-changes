public class guz extends gqv<cjd, gym, gaq<gym>> {
   private static final akv a = akv.b("textures/entity/horse/horse_zombie.png");
   private static final akv b = akv.b("textures/entity/horse/horse_skeleton.png");
   private final akv k;

   public guz(gsf.a $$0, gfc $$1, gfc $$2, boolean $$3) {
      super($$0, new gcn($$0.a($$1)), new gcn($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public akv a(gym $$0) {
      return this.k;
   }

   public gym b() {
      return new gym();
   }
}
