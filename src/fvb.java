public class fvb extends frp<cbv> {
   public static final aer a = new aer("textures/entity/projectiles/arrow.png");
   public static final aer f = new aer("textures/entity/projectiles/tipped_arrow.png");

   public fvb(fso.a $$0) {
      super($$0);
   }

   public aer a(cbv $$0) {
      return $$0.z() > 0 ? f : a;
   }
}
