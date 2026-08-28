public class ghx extends gkb<cfe, ftc<cfe>> {
   private static final ale a = new ale("textures/entity/bee/bee_angry.png");
   private static final ale i = new ale("textures/entity/bee/bee_angry_nectar.png");
   private static final ale j = new ale("textures/entity/bee/bee.png");
   private static final ale k = new ale("textures/entity/bee/bee_nectar.png");

   public ghx(giv.a $$0) {
      super($$0, new ftc<>($$0.a(fwx.k)), 0.4F);
   }

   public ale a(cfe $$0) {
      if ($$0.Z_()) {
         return $$0.gA() ? i : a;
      } else {
         return $$0.gA() ? k : j;
      }
   }
}
