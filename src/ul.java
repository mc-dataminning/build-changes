public class ul extends Exception {
   private final tl a;

   public ul(tl $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ul(tl $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public tl b() {
      return this.a;
   }
}
