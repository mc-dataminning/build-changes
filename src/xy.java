public class xy extends Exception {
   private final wy a;

   public xy(wy $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xy(wy $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public wy a() {
      return this.a;
   }
}
