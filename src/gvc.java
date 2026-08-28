public class gvc extends gvj<gxj, gaz> {
   private static final alp a = alp.b("textures/entity/creeper/creeper_armor.png");
   private final gaz b;

   public gvc(gti<gxj, gaz> $$0, gef $$1) {
      super($$0);
      this.b = new gaz($$1.a(gei.aj));
   }

   protected boolean a(gxj $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alp a() {
      return a;
   }

   protected gaz b() {
      return this.b;
   }
}
