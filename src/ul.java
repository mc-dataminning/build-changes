public class ul extends Exception {
   private final tm a;

   public ul(tm $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ul(tm $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public tm b() {
      return this.a;
   }
}
