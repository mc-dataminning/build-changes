public class fyf extends fxc<byd, fhu<byd>> {
   private static final aey a = new aey("textures/entity/wither/wither_armor.png");
   private final fhu<byd> b;

   public fyf(fve<byd, fhu<byd>> $$0, fia $$1) {
      super($$0);
      this.b = new fhu<>($$1.a(fid.bP));
   }

   @Override
   protected float a(float $$0) {
      return ary.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aey a() {
      return a;
   }

   @Override
   protected fff<byd> b() {
      return this.b;
   }
}
