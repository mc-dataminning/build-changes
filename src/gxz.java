public class gxz extends gui<crc, hdt> {
   public static final ale a = ale.b("textures/entity/projectiles/arrow.png");
   public static final ale g = ale.b("textures/entity/projectiles/tipped_arrow.png");

   public gxz(gvk.a $$0) {
      super($$0);
   }

   protected ale a(hdt $$0) {
      return $$0.d ? g : a;
   }

   public hdt a() {
      return new hdt();
   }

   public void a(crc $$0, hdt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.y() > 0;
   }
}
