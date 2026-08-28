public class guy extends gqu<cjc, gyl, gap<gyl>> {
   private static final akv a = akv.b("textures/entity/horse/horse_zombie.png");
   private static final akv b = akv.b("textures/entity/horse/horse_skeleton.png");
   private final akv k;

   public guy(gse.a $$0, gfb $$1, gfb $$2, boolean $$3) {
      super($$0, new gcm($$0.a($$1)), new gcm($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public akv a(gyl $$0) {
      return this.k;
   }

   public gyl b() {
      return new gyl();
   }
}
