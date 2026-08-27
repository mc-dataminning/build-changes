public class fuw extends frk<cbt> {
   public static final aep a = new aep("textures/entity/projectiles/arrow.png");
   public static final aep f = new aep("textures/entity/projectiles/tipped_arrow.png");

   public fuw(fsj.a $$0) {
      super($$0);
   }

   public aep a(cbt $$0) {
      return $$0.z() > 0 ? f : a;
   }
}
