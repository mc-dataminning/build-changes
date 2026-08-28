public class gyf extends gxb<hbx, gfq> {
   private static final aku a = aku.b("textures/entity/wither/wither_armor.png");
   private final gfq b;

   public gyf(gva<hbx, gfq> $$0, gfy $$1) {
      super($$0);
      this.b = new gfq($$1.a(ggb.dD));
   }

   protected boolean a(hbx $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return ayz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aku a() {
      return a;
   }

   protected gfq b() {
      return this.b;
   }
}
