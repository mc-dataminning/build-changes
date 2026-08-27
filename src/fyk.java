public class fyk extends fuy<cec> {
   public static final agi a = new agi("textures/entity/projectiles/arrow.png");
   public static final agi f = new agi("textures/entity/projectiles/tipped_arrow.png");

   public fyk(fvx.a $$0) {
      super($$0);
   }

   public agi a(cec $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
