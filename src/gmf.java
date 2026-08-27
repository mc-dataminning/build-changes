public class gmf extends glz<ceu, fwr> {
   private static final akt a = new akt("textures/entity/parrot/parrot_red_blue.png");
   private static final akt b = new akt("textures/entity/parrot/parrot_blue.png");
   private static final akt g = new akt("textures/entity/parrot/parrot_green.png");
   private static final akt k = new akt("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akt l = new akt("textures/entity/parrot/parrot_grey.png");

   public gmf(gkq.a $$0) {
      super($$0, new fwr($$0.a(fyr.aK)), 0.3F);
   }

   public akt a(ceu $$0) {
      return a($$0.gG());
   }

   public static akt a(ceu.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> g;
         case d -> k;
         case e -> l;
      };
   }

   public float a(ceu $$0, float $$1) {
      float $$2 = aym.i($$1, $$0.cn, $$0.ck);
      float $$3 = aym.i($$1, $$0.cm, $$0.cl);
      return (aym.a($$2) + 1.0F) * $$3;
   }
}
