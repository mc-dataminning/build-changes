public class gja extends gfm<ckt> {
   public static final akf a = new akf("textures/entity/projectiles/arrow.png");
   public static final akf f = new akf("textures/entity/projectiles/tipped_arrow.png");

   public gja(ggn.a $$0) {
      super($$0);
   }

   public akf a(ckt $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
