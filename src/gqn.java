public class gqn extends gqg<chl, gwk, fzy> {
   private static final all a = all.b("textures/entity/parrot/parrot_red_blue.png");
   private static final all b = all.b("textures/entity/parrot/parrot_blue.png");
   private static final all k = all.b("textures/entity/parrot/parrot_green.png");
   private static final all l = all.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final all m = all.b("textures/entity/parrot/parrot_grey.png");

   public gqn(gpa.a $$0) {
      super($$0, new fzy($$0.a(gcb.br)), 0.3F);
   }

   public all a(gwk $$0) {
      return a($$0.a);
   }

   public gwk c() {
      return new gwk();
   }

   public void a(chl $$0, gwk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gJ();
      float $$3 = azn.h($$2, $$0.cf, $$0.cc);
      float $$4 = azn.h($$2, $$0.ce, $$0.cd);
      $$1.b = (azn.a($$3) + 1.0F) * $$4;
      $$1.c = fzy.a($$0);
   }

   public static all a(chl.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
         case e -> m;
      };
   }
}
