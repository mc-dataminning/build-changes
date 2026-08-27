public class ud extends Exception {
   private final te a;

   public ud(te $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ud(te $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public te b() {
      return this.a;
   }
}
