public class um extends Exception {
   private final tn a;

   public um(tn $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public um(tn $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public tn b() {
      return this.a;
   }
}
