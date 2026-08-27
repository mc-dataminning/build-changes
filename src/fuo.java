public class fuo extends fwq<bwk, fgi<bwk>> {
   private static final agg a = new agg("textures/entity/bee/bee_angry.png");
   private static final agg i = new agg("textures/entity/bee/bee_angry_nectar.png");
   private static final agg j = new agg("textures/entity/bee/bee.png");
   private static final agg k = new agg("textures/entity/bee/bee_nectar.png");

   public fuo(fvk.a $$0) {
      super($$0, new fgi<>($$0.a(fka.j)), 0.4F);
   }

   public agg a(bwk $$0) {
      if ($$0.Y_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
