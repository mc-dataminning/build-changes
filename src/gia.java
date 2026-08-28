public class gia extends gke<cfh, ftf<cfh>> {
   private static final alf a = new alf("textures/entity/bee/bee_angry.png");
   private static final alf i = new alf("textures/entity/bee/bee_angry_nectar.png");
   private static final alf j = new alf("textures/entity/bee/bee.png");
   private static final alf k = new alf("textures/entity/bee/bee_nectar.png");

   public gia(giy.a $$0) {
      super($$0, new ftf<>($$0.a(fxa.k)), 0.4F);
   }

   public alf a(cfh $$0) {
      if ($$0.Z_()) {
         return $$0.gA() ? i : a;
      } else {
         return $$0.gA() ? k : j;
      }
   }
}
