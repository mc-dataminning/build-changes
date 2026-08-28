public class gwx extends gwq<cje, hcx, ggc> {
   private static final ale a = ale.b("textures/entity/parrot/parrot_red_blue.png");
   private static final ale j = ale.b("textures/entity/parrot/parrot_blue.png");
   private static final ale k = ale.b("textures/entity/parrot/parrot_green.png");
   private static final ale l = ale.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ale m = ale.b("textures/entity/parrot/parrot_grey.png");

   public gwx(gvk.a $$0) {
      super($$0, new ggc($$0.a(gif.bX)), 0.3F);
   }

   public ale a(hcx $$0) {
      return a($$0.a);
   }

   public hcx b() {
      return new hcx();
   }

   public void a(cje $$0, hcx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE();
      float $$3 = azk.h($$2, $$0.bM, $$0.bJ);
      float $$4 = azk.h($$2, $$0.bL, $$0.bK);
      $$1.b = (azk.a($$3) + 1.0F) * $$4;
      $$1.c = ggc.a($$0);
   }

   public static ale a(cje.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
