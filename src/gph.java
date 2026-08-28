public class gph extends goe<ciu, fxy<ciu>> {
   private static final akr a = akr.b("textures/entity/wither/wither_armor.png");
   private final fxy<ciu> b;

   public gph(gmd<ciu, fxy<ciu>> $$0, fye $$1) {
      super($$0);
      this.b = new fxy<>($$1.a(fyh.bX));
   }

   @Override
   protected float a(float $$0) {
      return ayo.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akr a() {
      return a;
   }

   @Override
   protected fvi<ciu> b() {
      return this.b;
   }
}
