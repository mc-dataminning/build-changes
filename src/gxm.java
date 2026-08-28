public class gxm extends gxf<cjk, hdn, ggp> {
   private static final alg a = alg.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alg j = alg.b("textures/entity/parrot/parrot_blue.png");
   private static final alg k = alg.b("textures/entity/parrot/parrot_green.png");
   private static final alg l = alg.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alg m = alg.b("textures/entity/parrot/parrot_grey.png");

   public gxm(gvz.a $$0) {
      super($$0, new ggp($$0.a(git.bZ)), 0.3F);
   }

   public alg a(hdn $$0) {
      return a($$0.a);
   }

   public hdn b() {
      return new hdn();
   }

   public void a(cjk $$0, hdn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE();
      float $$3 = azm.h($$2, $$0.bM, $$0.bJ);
      float $$4 = azm.h($$2, $$0.bL, $$0.bK);
      $$1.b = (azm.a($$3) + 1.0F) * $$4;
      $$1.c = ggp.a($$0);
   }

   public static alg a(cjk.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
