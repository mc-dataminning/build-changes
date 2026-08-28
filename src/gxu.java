public class gxu extends gxn<cjo, hdv, ggx> {
   private static final alg a = alg.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alg j = alg.b("textures/entity/parrot/parrot_blue.png");
   private static final alg k = alg.b("textures/entity/parrot/parrot_green.png");
   private static final alg l = alg.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alg m = alg.b("textures/entity/parrot/parrot_grey.png");

   public gxu(gwh.a $$0) {
      super($$0, new ggx($$0.a(gjb.cb)), 0.3F);
   }

   public alg a(hdv $$0) {
      return a($$0.a);
   }

   public hdv b() {
      return new hdv();
   }

   public void a(cjo $$0, hdv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF();
      float $$3 = azm.h($$2, $$0.bN, $$0.bK);
      float $$4 = azm.h($$2, $$0.bM, $$0.bL);
      $$1.b = (azm.a($$3) + 1.0F) * $$4;
      $$1.c = ggx.a($$0);
   }

   public static alg a(cjo.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
