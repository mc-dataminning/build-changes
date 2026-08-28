public class gtp extends gti<chn, gzq, gcy> {
   private static final aku a = aku.b("textures/entity/parrot/parrot_red_blue.png");
   private static final aku b = aku.b("textures/entity/parrot/parrot_blue.png");
   private static final aku k = aku.b("textures/entity/parrot/parrot_green.png");
   private static final aku l = aku.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aku m = aku.b("textures/entity/parrot/parrot_grey.png");

   public gtp(gsc.a $$0) {
      super($$0, new gcy($$0.a(gfb.bN)), 0.3F);
   }

   public aku a(gzq $$0) {
      return a($$0.a);
   }

   public gzq b() {
      return new gzq();
   }

   public void a(chn $$0, gzq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD();
      float $$3 = ayz.h($$2, $$0.cf, $$0.cc);
      float $$4 = ayz.h($$2, $$0.ce, $$0.cd);
      $$1.b = (ayz.a($$3) + 1.0F) * $$4;
      $$1.c = gcy.a($$0);
   }

   public static aku a(chn.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
