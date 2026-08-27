public class fvu extends fsi<ccc> {
   public static final aex a = new aex("textures/entity/projectiles/arrow.png");
   public static final aex f = new aex("textures/entity/projectiles/tipped_arrow.png");

   public fvu(fth.a $$0) {
      super($$0);
   }

   public aex a(ccc $$0) {
      return $$0.F() > 0 ? f : a;
   }
}
