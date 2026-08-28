public class gti extends gqi<ciq, gzh, gcv> {
   private static final alz a = alz.b("textures/entity/rabbit/brown.png");
   private static final alz b = alz.b("textures/entity/rabbit/white.png");
   private static final alz k = alz.b("textures/entity/rabbit/black.png");
   private static final alz l = alz.b("textures/entity/rabbit/gold.png");
   private static final alz m = alz.b("textures/entity/rabbit/salt.png");
   private static final alz n = alz.b("textures/entity/rabbit/white_splotched.png");
   private static final alz o = alz.b("textures/entity/rabbit/toast.png");
   private static final alz p = alz.b("textures/entity/rabbit/caerbannog.png");

   public gti(gro.a $$0) {
      super($$0, new gcv($$0.a(gel.cq)), new gcv($$0.a(gel.cr)), 0.3F);
   }

   public alz a(gzh $$0) {
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

   public gzh b() {
      return new gzh();
   }

   public void a(ciq $$0, gzh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.al().getString()));
      $$1.c = $$0.gm();
   }
}
