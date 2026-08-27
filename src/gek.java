public class gek extends ggo<cce, fpq<cce>> {
   private static final ajt a = new ajt("textures/entity/bee/bee_angry.png");
   private static final ajt i = new ajt("textures/entity/bee/bee_angry_nectar.png");
   private static final ajt j = new ajt("textures/entity/bee/bee.png");
   private static final ajt k = new ajt("textures/entity/bee/bee_nectar.png");

   public gek(gfi.a $$0) {
      super($$0, new fpq<>($$0.a(ftl.k)), 0.4F);
   }

   public ajt a(cce $$0) {
      if ($$0.Y_()) {
         return $$0.gx() ? i : a;
      } else {
         return $$0.gx() ? k : j;
      }
   }
}
