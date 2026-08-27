public class fyd extends fxa<byb, fhs<byb>> {
   private static final aew a = new aew("textures/entity/wither/wither_armor.png");
   private final fhs<byb> b;

   public fyd(fvc<byb, fhs<byb>> $$0, fhy $$1) {
      super($$0);
      this.b = new fhs<>($$1.a(fib.bP));
   }

   @Override
   protected float a(float $$0) {
      return arw.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aew a() {
      return a;
   }

   @Override
   protected ffd<byb> b() {
      return this.b;
   }
}
