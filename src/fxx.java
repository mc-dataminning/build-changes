public class fxx extends ful<cdu> {
   public static final agg a = new agg("textures/entity/projectiles/arrow.png");
   public static final agg f = new agg("textures/entity/projectiles/tipped_arrow.png");

   public fxx(fvk.a $$0) {
      super($$0);
   }

   public agg a(cdu $$0) {
      return $$0.F() > 0 ? f : a;
   }
}
