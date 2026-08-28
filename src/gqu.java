public class gqu extends gnv<chp, gwr, gal> {
   private static final all a = all.b("textures/entity/rabbit/brown.png");
   private static final all b = all.b("textures/entity/rabbit/white.png");
   private static final all k = all.b("textures/entity/rabbit/black.png");
   private static final all l = all.b("textures/entity/rabbit/gold.png");
   private static final all m = all.b("textures/entity/rabbit/salt.png");
   private static final all n = all.b("textures/entity/rabbit/white_splotched.png");
   private static final all o = all.b("textures/entity/rabbit/toast.png");
   private static final all p = all.b("textures/entity/rabbit/caerbannog.png");

   public gqu(gpa.a $$0) {
      super($$0, new gal($$0.a(gcb.bX)), new gal($$0.a(gcb.bY)), 0.3F);
   }

   public all a(gwr $$0) {
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

   public gwr c() {
      return new gwr();
   }

   public void a(chp $$0, gwr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.am().getString()));
      $$1.c = $$0.gv();
   }
}
