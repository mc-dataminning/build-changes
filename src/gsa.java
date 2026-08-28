public class gsa extends gsh<gug, fyc> {
   private static final ali a = ali.b("textures/entity/creeper/creeper_armor.png");
   private final fyc b;

   public gsa(gqg<gug, fyc> $$0, gbi $$1) {
      super($$0);
      this.b = new fyc($$1.a(gbl.X));
   }

   protected boolean a(gug $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ali a() {
      return a;
   }

   protected fyc b() {
      return this.b;
   }
}
