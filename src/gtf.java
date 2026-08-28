public class gtf extends gqf<cii, gze, gcs> {
   private static final alp a = alp.b("textures/entity/rabbit/brown.png");
   private static final alp b = alp.b("textures/entity/rabbit/white.png");
   private static final alp k = alp.b("textures/entity/rabbit/black.png");
   private static final alp l = alp.b("textures/entity/rabbit/gold.png");
   private static final alp m = alp.b("textures/entity/rabbit/salt.png");
   private static final alp n = alp.b("textures/entity/rabbit/white_splotched.png");
   private static final alp o = alp.b("textures/entity/rabbit/toast.png");
   private static final alp p = alp.b("textures/entity/rabbit/caerbannog.png");

   public gtf(grl.a $$0) {
      super($$0, new gcs($$0.a(gei.ct)), new gcs($$0.a(gei.cu)), 0.3F);
   }

   public alp a(gze $$0) {
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

   public gze b() {
      return new gze();
   }

   public void a(cii $$0, gze $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.al().getString()));
      $$1.c = $$0.go();
   }
}
