public class fyp extends fvd<ceh> {
   public static final agm a = new agm("textures/entity/projectiles/arrow.png");
   public static final agm f = new agm("textures/entity/projectiles/tipped_arrow.png");

   public fyp(fwc.a $$0) {
      super($$0);
   }

   public agm a(ceh $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
