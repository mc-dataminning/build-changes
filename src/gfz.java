public class gfz extends gid<cdq, frf<cdq>> {
   private static final akh a = new akh("textures/entity/bee/bee_angry.png");
   private static final akh i = new akh("textures/entity/bee/bee_angry_nectar.png");
   private static final akh j = new akh("textures/entity/bee/bee.png");
   private static final akh k = new akh("textures/entity/bee/bee_nectar.png");

   public gfz(ggx.a $$0) {
      super($$0, new frf<>($$0.a(fva.k)), 0.4F);
   }

   public akh a(cdq $$0) {
      if ($$0.Z_()) {
         return $$0.gz() ? i : a;
      } else {
         return $$0.gz() ? k : j;
      }
   }
}
