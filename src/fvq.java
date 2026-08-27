public class fvq extends fse<cci> {
   public static final aez a = new aez("textures/entity/projectiles/arrow.png");
   public static final aez f = new aez("textures/entity/projectiles/tipped_arrow.png");

   public fvq(ftd.a $$0) {
      super($$0);
   }

   public aez a(cci $$0) {
      return $$0.F() > 0 ? f : a;
   }
}
