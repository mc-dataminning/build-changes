public class gzm extends gxe<cly, hfs, giv> {
   private static final alk a = alk.b("textures/entity/llama/creamy.png");
   private static final alk j = alk.b("textures/entity/llama/white.png");
   private static final alk k = alk.b("textures/entity/llama/brown.png");
   private static final alk l = alk.b("textures/entity/llama/gray.png");

   public gzm(gyk.a $$0, gle $$1, gle $$2) {
      super($$0, new giv($$0.a($$1)), new giv($$0.a($$2)), 0.7F);
      this.a(new hcs(this, $$0.f(), $$0.h()));
   }

   public alk a(hfs $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public hfs b() {
      return new hfs();
   }

   public void a(cly $$0, hfs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gH();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.fY();
      $$1.d = $$0.gx();
   }
}
