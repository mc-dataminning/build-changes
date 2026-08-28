public class gyx extends gwp<cmh, hff, gig> {
   private static final alr a = alr.b("textures/entity/llama/creamy.png");
   private static final alr j = alr.b("textures/entity/llama/white.png");
   private static final alr k = alr.b("textures/entity/llama/brown.png");
   private static final alr l = alr.b("textures/entity/llama/gray.png");

   public gyx(gxv.a $$0, gkp $$1, gkp $$2) {
      super($$0, new gig($$0.a($$1)), new gig($$0.a($$2)), 0.7F);
      this.a(new hcd(this, $$0.f(), $$0.h()));
   }

   public alr a(hff $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public hff b() {
      return new hff();
   }

   public void a(cmh $$0, hff $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gH();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.fY();
      $$1.d = $$0.gx();
   }
}
