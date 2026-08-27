public class ghz extends ght<cdj, fsr> {
   private static final akf a = new akf("textures/entity/parrot/parrot_red_blue.png");
   private static final akf i = new akf("textures/entity/parrot/parrot_blue.png");
   private static final akf j = new akf("textures/entity/parrot/parrot_green.png");
   private static final akf k = new akf("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akf l = new akf("textures/entity/parrot/parrot_grey.png");

   public ghz(ggn.a $$0) {
      super($$0, new fsr($$0.a(fuq.aG)), 0.3F);
   }

   public akf a(cdj $$0) {
      return a($$0.gx());
   }

   public static akf a(cdj.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cdj $$0, float $$1) {
      float $$2 = axw.i($$1, $$0.ce, $$0.cb);
      float $$3 = axw.i($$1, $$0.cd, $$0.cc);
      return (axw.a($$2) + 1.0F) * $$3;
   }
}
