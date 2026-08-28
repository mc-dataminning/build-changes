public class gpx extends gmi<cod, gvo> {
   public static final alc a = alc.b("textures/entity/projectiles/arrow.png");
   public static final alc b = alc.b("textures/entity/projectiles/tipped_arrow.png");

   public gpx(gnj.a $$0) {
      super($$0);
   }

   public alc a(gvo $$0) {
      return $$0.d ? b : a;
   }

   public gvo a() {
      return new gvo();
   }

   public void a(cod $$0, gvo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.E() > 0;
   }
}
