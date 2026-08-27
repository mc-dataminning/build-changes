public class gjk extends gfw<clp> {
   public static final akh a = new akh("textures/entity/projectiles/arrow.png");
   public static final akh f = new akh("textures/entity/projectiles/tipped_arrow.png");

   public gjk(ggx.a $$0) {
      super($$0);
   }

   public akh a(clp $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
