public class gpb extends gou<cgt, gux, fym> {
   private static final ale a = ale.b("textures/entity/parrot/parrot_red_blue.png");
   private static final ale b = ale.b("textures/entity/parrot/parrot_blue.png");
   private static final ale k = ale.b("textures/entity/parrot/parrot_green.png");
   private static final ale l = ale.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ale m = ale.b("textures/entity/parrot/parrot_grey.png");

   public gpb(gno.a $$0) {
      super($$0, new fym($$0.a(gap.br)), 0.3F);
   }

   public ale a(gux $$0) {
      return a($$0.a);
   }

   public gux c() {
      return new gux();
   }

   public void a(cgt $$0, gux $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      float $$3 = azf.h($$2, $$0.cf, $$0.cc);
      float $$4 = azf.h($$2, $$0.ce, $$0.cd);
      $$1.b = (azf.a($$3) + 1.0F) * $$4;
      $$1.c = fym.a($$0);
   }

   public static ale a(cgt.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
