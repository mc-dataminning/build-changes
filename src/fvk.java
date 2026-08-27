public class fvk extends fry<cbu> {
   public static final aer a = new aer("textures/entity/projectiles/arrow.png");
   public static final aer f = new aer("textures/entity/projectiles/tipped_arrow.png");

   public fvk(fsx.a $$0) {
      super($$0);
   }

   public aer a(cbu $$0) {
      return $$0.z() > 0 ? f : a;
   }
}
