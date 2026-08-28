public class gpm extends gnf<ciy, gvm, fzc> {
   private static final ali a = ali.b("textures/entity/llama/creamy.png");
   private static final ali b = ali.b("textures/entity/llama/white.png");
   private static final ali k = ali.b("textures/entity/llama/brown.png");
   private static final ali l = ali.b("textures/entity/llama/gray.png");

   public gpm(gok.a $$0, gbk $$1, gbk $$2) {
      super($$0, new fzc($$0.a($$1)), new fzc($$0.a($$2)), 0.7F);
      this.a(new gsr(this, $$0.f(), $$0.h()));
   }

   public ali a(gvm $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gvm c() {
      return new gvm();
   }

   public void a(ciy $$0, gvm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gH();
      $$1.b = !$$0.p_() && $$0.t();
      $$1.c = $$0.ak();
      $$1.d = $$0.gx();
   }
}
