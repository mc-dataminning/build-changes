public class gow extends gop<cgq, gus, fyi> {
   private static final alc a = alc.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alc b = alc.b("textures/entity/parrot/parrot_blue.png");
   private static final alc k = alc.b("textures/entity/parrot/parrot_green.png");
   private static final alc l = alc.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alc m = alc.b("textures/entity/parrot/parrot_grey.png");

   public gow(gnj.a $$0) {
      super($$0, new fyi($$0.a(gak.br)), 0.3F);
   }

   public alc a(gus $$0) {
      return a($$0.a);
   }

   public gus c() {
      return new gus();
   }

   public void a(cgq $$0, gus $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD();
      float $$3 = azd.h($$2, $$0.cf, $$0.cc);
      float $$4 = azd.h($$2, $$0.ce, $$0.cd);
      $$1.b = (azd.a($$3) + 1.0F) * $$4;
      $$1.c = fyi.a($$0);
   }

   public static alc a(cgq.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
