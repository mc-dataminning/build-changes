public class hax extends gxg<csi, hgt> {
   public static final ali a = ali.b("textures/entity/projectiles/arrow.png");
   public static final ali g = ali.b("textures/entity/projectiles/tipped_arrow.png");

   public hax(gyi.a $$0) {
      super($$0);
   }

   protected ali a(hgt $$0) {
      return $$0.d ? g : a;
   }

   public hgt a() {
      return new hgt();
   }

   public void a(csi $$0, hgt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
