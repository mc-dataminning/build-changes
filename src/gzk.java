public class gzk extends gxc<clw, hfq, git> {
   private static final ali a = ali.b("textures/entity/llama/creamy.png");
   private static final ali j = ali.b("textures/entity/llama/white.png");
   private static final ali k = ali.b("textures/entity/llama/brown.png");
   private static final ali l = ali.b("textures/entity/llama/gray.png");

   public gzk(gyi.a $$0, glc $$1, glc $$2) {
      super($$0, new git($$0.a($$1)), new git($$0.a($$2)), 0.7F);
      this.a(new hcq(this, $$0.f(), $$0.h()));
   }

   public ali a(hfq $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public hfq b() {
      return new hfq();
   }

   public void a(clw $$0, hfq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gH();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.fY();
      $$1.d = $$0.gx();
   }
}
