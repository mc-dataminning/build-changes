public class tv extends Exception {
   private final sw a;

   public tv(sw $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public tv(sw $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public sw b() {
      return this.a;
   }
}
