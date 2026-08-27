public class fvw extends fsk<cce> {
   public static final aey a = new aey("textures/entity/projectiles/arrow.png");
   public static final aey f = new aey("textures/entity/projectiles/tipped_arrow.png");

   public fvw(ftj.a $$0) {
      super($$0);
   }

   public aey a(cce $$0) {
      return $$0.F() > 0 ? f : a;
   }
}
