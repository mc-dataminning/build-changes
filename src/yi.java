public class yi extends Exception {
   private final xi a;

   public yi(xi $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public yi(xi $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public xi a() {
      return this.a;
   }
}
