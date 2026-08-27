public class fwq extends fte<cdf> {
   public static final afw a = new afw("textures/entity/projectiles/arrow.png");
   public static final afw f = new afw("textures/entity/projectiles/tipped_arrow.png");

   public fwq(fud.a $$0) {
      super($$0);
   }

   public afw a(cdf $$0) {
      return $$0.F() > 0 ? f : a;
   }
}
