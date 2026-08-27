public class giv extends giz<cgl, ftp<cgl>> {
   private static final akm a = new akm("textures/entity/llama/creamy.png");
   private static final akm i = new akm("textures/entity/llama/white.png");
   private static final akm j = new akm("textures/entity/llama/brown.png");
   private static final akm k = new akm("textures/entity/llama/gray.png");

   public giv(ght.a $$0, fvu $$1) {
      super($$0, new ftp<>($$0.a($$1)), 0.7F);
      this.a(new glz(this, $$0.f()));
   }

   public akm a(cgl $$0) {
      return switch ($$0.gB()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
