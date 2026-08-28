public class gtr extends gtk<cho, gzs, gcz> {
   private static final akv a = akv.b("textures/entity/parrot/parrot_red_blue.png");
   private static final akv b = akv.b("textures/entity/parrot/parrot_blue.png");
   private static final akv k = akv.b("textures/entity/parrot/parrot_green.png");
   private static final akv l = akv.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akv m = akv.b("textures/entity/parrot/parrot_grey.png");

   public gtr(gse.a $$0) {
      super($$0, new gcz($$0.a(gfc.bN)), 0.3F);
   }

   public akv a(gzs $$0) {
      return a($$0.a);
   }

   public gzs b() {
      return new gzs();
   }

   public void a(cho $$0, gzs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG();
      float $$3 = ayz.h($$2, $$0.cf, $$0.cc);
      float $$4 = ayz.h($$2, $$0.ce, $$0.cd);
      $$1.b = (ayz.a($$3) + 1.0F) * $$4;
      $$1.c = gcz.a($$0);
   }

   public static akv a(cho.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
