public class gto extends gth<chm, gzp, gcw> {
   private static final aku a = aku.b("textures/entity/parrot/parrot_red_blue.png");
   private static final aku b = aku.b("textures/entity/parrot/parrot_blue.png");
   private static final aku k = aku.b("textures/entity/parrot/parrot_green.png");
   private static final aku l = aku.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aku m = aku.b("textures/entity/parrot/parrot_grey.png");

   public gto(gsb.a $$0) {
      super($$0, new gcw($$0.a(gez.bN)), 0.3F);
   }

   public aku a(gzp $$0) {
      return a($$0.a);
   }

   public gzp b() {
      return new gzp();
   }

   public void a(chm $$0, gzp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD();
      float $$3 = ayy.h($$2, $$0.cf, $$0.cc);
      float $$4 = ayy.h($$2, $$0.ce, $$0.cd);
      $$1.b = (ayy.a($$3) + 1.0F) * $$4;
      $$1.c = gcw.a($$0);
   }

   public static aku a(chm.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
