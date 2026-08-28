public class gwq extends gvm<haf, gea> {
   private static final alz a = alz.b("textures/entity/wither/wither_armor.png");
   private final gea b;

   public gwq(gtl<haf, gea> $$0, gei $$1) {
      super($$0);
      this.b = new gea($$1.a(gel.dv));
   }

   protected boolean a(haf $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return bae.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alz a() {
      return a;
   }

   protected gea b() {
      return this.b;
   }
}
