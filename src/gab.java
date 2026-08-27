public class gab extends fwo<cez> {
   public static final agt a = new agt("textures/entity/projectiles/arrow.png");
   public static final agt f = new agt("textures/entity/projectiles/tipped_arrow.png");

   public gab(fxo.a $$0) {
      super($$0);
   }

   public agt a(cez $$0) {
      return $$0.I() > 0 ? f : a;
   }
}
