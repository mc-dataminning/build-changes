public class gya extends gvs<cll, heg, ghi> {
   private static final alg a = alg.b("textures/entity/llama/creamy.png");
   private static final alg j = alg.b("textures/entity/llama/white.png");
   private static final alg k = alg.b("textures/entity/llama/brown.png");
   private static final alg l = alg.b("textures/entity/llama/gray.png");

   public gya(gwy.a $$0, gjr $$1, gjr $$2) {
      super($$0, new ghi($$0.a($$1)), new ghi($$0.a($$2)), 0.7F);
      this.a(new hbg(this, $$0.f(), $$0.h()));
   }

   public alg a(heg $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public heg b() {
      return new heg();
   }

   public void a(cll $$0, heg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.fX();
      $$1.d = $$0.gw();
   }
}
