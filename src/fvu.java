public class fvu extends fsi<ccc> {
   public static final aew a = new aew("textures/entity/projectiles/arrow.png");
   public static final aew f = new aew("textures/entity/projectiles/tipped_arrow.png");

   public fvu(fth.a $$0) {
      super($$0);
   }

   public aew a(ccc $$0) {
      return $$0.F() > 0 ? f : a;
   }
}
