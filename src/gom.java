public class gom extends gln<cgp, gui, fyl> {
   private static final alb a = alb.b("textures/entity/rabbit/brown.png");
   private static final alb b = alb.b("textures/entity/rabbit/white.png");
   private static final alb k = alb.b("textures/entity/rabbit/black.png");
   private static final alb l = alb.b("textures/entity/rabbit/gold.png");
   private static final alb m = alb.b("textures/entity/rabbit/salt.png");
   private static final alb n = alb.b("textures/entity/rabbit/white_splotched.png");
   private static final alb o = alb.b("textures/entity/rabbit/toast.png");
   private static final alb p = alb.b("textures/entity/rabbit/caerbannog.png");

   public gom(gms.a $$0) {
      super($$0, new fyl($$0.a(gaa.bW)), new fyl($$0.a(gaa.bX)), 0.3F);
   }

   public alb a(gui $$0) {
      if ($$0.b) {
         return o;
      } else {
         return switch ($$0.c) {
            case a -> a;
            case b -> b;
            case c -> k;
            case e -> l;
            case f -> m;
            case d -> n;
            case g -> p;
         };
      }
   }

   public gui c() {
      return new gui();
   }

   public void a(cgp $$0, gui $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.aj().getString()));
      $$1.c = $$0.go();
   }
}
