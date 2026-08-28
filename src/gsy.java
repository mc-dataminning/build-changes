public class gsy extends gsr<cie, gyx, gcf> {
   private static final alp a = alp.b("textures/entity/parrot/parrot_red_blue.png");
   private static final alp b = alp.b("textures/entity/parrot/parrot_blue.png");
   private static final alp k = alp.b("textures/entity/parrot/parrot_green.png");
   private static final alp l = alp.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alp m = alp.b("textures/entity/parrot/parrot_grey.png");

   public gsy(grl.a $$0) {
      super($$0, new gcf($$0.a(gei.bN)), 0.3F);
   }

   public alp a(gyx $$0) {
      return a($$0.a);
   }

   public gyx b() {
      return new gyx();
   }

   public void a(cie $$0, gyx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      float $$3 = azu.h($$2, $$0.cg, $$0.cd);
      float $$4 = azu.h($$2, $$0.cf, $$0.ce);
      $$1.b = (azu.a($$3) + 1.0F) * $$4;
      $$1.c = gcf.a($$0);
   }

   public static alp a(cie.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
