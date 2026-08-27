public class ful extends fup<bwv, ffy<bwv>> {
   private static final aey a = new aey("textures/entity/llama/creamy.png");
   private static final aey i = new aey("textures/entity/llama/white.png");
   private static final aey j = new aey("textures/entity/llama/brown.png");
   private static final aey k = new aey("textures/entity/llama/gray.png");

   public ful(ftj.a $$0, fic $$1) {
      super($$0, new ffy<>($$0.a($$1)), 0.7F);
      this.a(new fxl(this, $$0.f()));
   }

   public aey a(bwv $$0) {
      return switch ($$0.gp()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
