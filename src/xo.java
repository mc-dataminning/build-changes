public class xo extends Exception {
   private final wo a;

   public xo(wo $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xo(wo $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public wo a() {
      return this.a;
   }
}
