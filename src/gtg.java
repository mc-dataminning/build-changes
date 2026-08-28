public class gtg extends gqy<cjf, gzl, gct> {
   private static final akv a = akv.b("textures/entity/llama/creamy.png");
   private static final akv b = akv.b("textures/entity/llama/white.png");
   private static final akv k = akv.b("textures/entity/llama/brown.png");
   private static final akv l = akv.b("textures/entity/llama/gray.png");

   public gtg(gse.a $$0, gfb $$1, gfb $$2) {
      super($$0, new gct($$0.a($$1)), new gct($$0.a($$2)), 0.7F);
      this.a(new gwn(this, $$0.f(), $$0.h()));
   }

   public akv a(gzl $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gzl b() {
      return new gzl();
   }

   public void a(cjf $$0, gzl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF();
      $$1.b = !$$0.e_() && $$0.t();
      $$1.c = $$0.ak();
      $$1.d = $$0.gv();
   }
}
