public class fvp extends fsd<cbx> {
   public static final aeu a = new aeu("textures/entity/projectiles/arrow.png");
   public static final aeu f = new aeu("textures/entity/projectiles/tipped_arrow.png");

   public fvp(ftc.a $$0) {
      super($$0);
   }

   public aeu a(cbx $$0) {
      return $$0.z() > 0 ? f : a;
   }
}
