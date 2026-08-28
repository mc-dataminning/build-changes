public class gib extends gkf<cfi, ftg<cfi>> {
   private static final alf a = new alf("textures/entity/bee/bee_angry.png");
   private static final alf i = new alf("textures/entity/bee/bee_angry_nectar.png");
   private static final alf j = new alf("textures/entity/bee/bee.png");
   private static final alf k = new alf("textures/entity/bee/bee_nectar.png");

   public gib(giz.a $$0) {
      super($$0, new ftg<>($$0.a(fxb.k)), 0.4F);
   }

   public alf a(cfi $$0) {
      if ($$0.Z_()) {
         return $$0.gA() ? i : a;
      } else {
         return $$0.gA() ? k : j;
      }
   }
}
