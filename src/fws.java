public class fws extends fxa<byu, fex<byu>> {
   private static final aex a = new aex("textures/entity/creeper/creeper_armor.png");
   private final fex<byu> b;

   public fws(fvc<byu, fex<byu>> $$0, fhy $$1) {
      super($$0);
      this.b = new fex<>($$1.a(fib.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aex a() {
      return a;
   }

   @Override
   protected ffd<byu> b() {
      return this.b;
   }
}
