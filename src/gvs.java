public class gvs extends gvz<gya, gbq> {
   private static final aku a = aku.b("textures/entity/creeper/creeper_armor.png");
   private final gbq b;

   public gvs(gty<gya, gbq> $$0, gew $$1) {
      super($$0);
      this.b = new gbq($$1.a(gez.aj));
   }

   protected boolean a(gya $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aku a() {
      return a;
   }

   protected gbq b() {
      return this.b;
   }
}
