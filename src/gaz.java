public class gaz extends fxm<cfp> {
   public static final ahg a = new ahg("textures/entity/projectiles/arrow.png");
   public static final ahg f = new ahg("textures/entity/projectiles/tipped_arrow.png");

   public gaz(fym.a $$0) {
      super($$0);
   }

   public ahg a(cfp $$0) {
      return $$0.I() > 0 ? f : a;
   }
}
