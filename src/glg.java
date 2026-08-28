public class glg extends ghr<cna> {
   public static final alb a = new alb("textures/entity/projectiles/arrow.png");
   public static final alb f = new alb("textures/entity/projectiles/tipped_arrow.png");

   public glg(gis.a $$0) {
      super($$0);
   }

   public alb a(cna $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
