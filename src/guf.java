public class guf extends grx<cjz, hak, gds> {
   private static final aku a = aku.b("textures/entity/llama/creamy.png");
   private static final aku b = aku.b("textures/entity/llama/white.png");
   private static final aku k = aku.b("textures/entity/llama/brown.png");
   private static final aku l = aku.b("textures/entity/llama/gray.png");

   public guf(gtd.a $$0, gga $$1, gga $$2) {
      super($$0, new gds($$0.a($$1)), new gds($$0.a($$2)), 0.7F);
      this.a(new gxm(this, $$0.f(), $$0.h()));
   }

   public aku a(hak $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public hak b() {
      return new hak();
   }

   public void a(cjz $$0, hak $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.aj();
      $$1.d = $$0.gv();
   }
}
