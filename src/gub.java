public class gub extends gsx<gxp, gbq> {
   private static final all a = all.b("textures/entity/wither/wither_armor.png");
   private final gbq b;

   public gub(gqw<gxp, gbq> $$0, gby $$1) {
      super($$0);
      this.b = new gbq($$1.a(gcb.da));
   }

   protected boolean a(gxp $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azn.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected all a() {
      return a;
   }

   protected gbq b() {
      return this.b;
   }
}
