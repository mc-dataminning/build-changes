public class gts extends gtl<chp, gzt, gda> {
   private static final akv a = akv.b("textures/entity/parrot/parrot_red_blue.png");
   private static final akv b = akv.b("textures/entity/parrot/parrot_blue.png");
   private static final akv k = akv.b("textures/entity/parrot/parrot_green.png");
   private static final akv l = akv.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akv m = akv.b("textures/entity/parrot/parrot_grey.png");

   public gts(gsf.a $$0) {
      super($$0, new gda($$0.a(gfd.bN)), 0.3F);
   }

   public akv a(gzt $$0) {
      return a($$0.a);
   }

   public gzt b() {
      return new gzt();
   }

   public void a(chp $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG();
      float $$3 = ayz.h($$2, $$0.cf, $$0.cc);
      float $$4 = ayz.h($$2, $$0.ce, $$0.cd);
      $$1.b = (ayz.a($$3) + 1.0F) * $$4;
      $$1.c = gda.a($$0);
   }

   public static akv a(chp.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
