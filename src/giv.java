public class giv extends giz<cgn, ftp<cgn>> {
   private static final akn a = new akn("textures/entity/llama/creamy.png");
   private static final akn i = new akn("textures/entity/llama/white.png");
   private static final akn j = new akn("textures/entity/llama/brown.png");
   private static final akn k = new akn("textures/entity/llama/gray.png");

   public giv(ght.a $$0, fvu $$1) {
      super($$0, new ftp<>($$0.a($$1)), 0.7F);
      this.a(new glz(this, $$0.f()));
   }

   public akn a(cgn $$0) {
      return switch ($$0.gB()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
