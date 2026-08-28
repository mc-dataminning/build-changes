public class ghu extends gjy<cfb, fsz<cfb>> {
   private static final alb a = new alb("textures/entity/bee/bee_angry.png");
   private static final alb i = new alb("textures/entity/bee/bee_angry_nectar.png");
   private static final alb j = new alb("textures/entity/bee/bee.png");
   private static final alb k = new alb("textures/entity/bee/bee_nectar.png");

   public ghu(gis.a $$0) {
      super($$0, new fsz<>($$0.a(fwu.k)), 0.4F);
   }

   public alb a(cfb $$0) {
      if ($$0.Z_()) {
         return $$0.gA() ? i : a;
      } else {
         return $$0.gA() ? k : j;
      }
   }
}
