public class glk extends ghv<cne> {
   public static final ale a = new ale("textures/entity/projectiles/arrow.png");
   public static final ale f = new ale("textures/entity/projectiles/tipped_arrow.png");

   public glk(giw.a $$0) {
      super($$0);
   }

   public ale a(cne $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
