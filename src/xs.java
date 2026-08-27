public class xs extends Exception {
   private final ws a;

   public xs(ws $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xs(ws $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public ws b() {
      return this.a;
   }
}
