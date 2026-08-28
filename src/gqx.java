public class gqx extends gqq<cho, gwv, gah> {
   private static final alj a = alj.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alj b = alj.b("textures/entity/parrot/parrot_blue.png");
   private static final alj k = alj.b("textures/entity/parrot/parrot_green.png");
   private static final alj l = alj.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alj m = alj.b("textures/entity/parrot/parrot_grey.png");

   public gqx(gpk.a $$0) {
      super($$0, new gah($$0.a(gck.bH)), 0.3F);
   }

   public alj a(gwv $$0) {
      return a($$0.a);
   }

   public gwv b() {
      return new gwv();
   }

   public void a(cho $$0, gwv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
      float $$3 = azm.h($$2, $$0.cf, $$0.cc);
      float $$4 = azm.h($$2, $$0.ce, $$0.cd);
      $$1.b = (azm.a($$3) + 1.0F) * $$4;
      $$1.c = gah.a($$0);
   }

   public static alj a(cho.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
