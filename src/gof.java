public class gof extends gny<cgl, gub, fxy> {
   private static final alb a = alb.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alb b = alb.b("textures/entity/parrot/parrot_blue.png");
   private static final alb k = alb.b("textures/entity/parrot/parrot_green.png");
   private static final alb l = alb.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alb m = alb.b("textures/entity/parrot/parrot_grey.png");

   public gof(gms.a $$0) {
      super($$0, new fxy($$0.a(gaa.bq)), 0.3F);
   }

   public alb a(gub $$0) {
      return a($$0.a);
   }

   public gub c() {
      return new gub();
   }

   public void a(cgl $$0, gub $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      float $$3 = azc.h($$2, $$0.cg, $$0.cd);
      float $$4 = azc.h($$2, $$0.cf, $$0.ce);
      $$1.b = (azc.a($$3) + 1.0F) * $$4;
      $$1.c = fxy.a($$0);
   }

   public static alb a(cgl.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
