public class ws extends Exception {
   private final vs a;

   public ws(vs $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ws(vs $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public vs b() {
      return this.a;
   }
}
