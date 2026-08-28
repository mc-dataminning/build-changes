public class gol extends gme<cih, guk, fyc> {
   private static final alc a = alc.b("textures/entity/llama/creamy.png");
   private static final alc b = alc.b("textures/entity/llama/white.png");
   private static final alc k = alc.b("textures/entity/llama/brown.png");
   private static final alc l = alc.b("textures/entity/llama/gray.png");

   public gol(gnj.a $$0, gaj $$1, gaj $$2) {
      super($$0, new fyc($$0.a($$1)), new fyc($$0.a($$2)), 0.7F);
      this.a(new grq(this, $$0.f()));
   }

   public alc a(guk $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public guk c() {
      return new guk();
   }

   public void a(cih $$0, guk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = !$$0.o_() && $$0.t();
      $$1.c = $$0.gD();
      $$1.d = $$0.gs();
   }
}
