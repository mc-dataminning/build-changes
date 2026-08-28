public class gln extends ghy<cnh> {
   public static final alf a = new alf("textures/entity/projectiles/arrow.png");
   public static final alf f = new alf("textures/entity/projectiles/tipped_arrow.png");

   public gln(giz.a $$0) {
      super($$0);
   }

   public alf a(cnh $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
