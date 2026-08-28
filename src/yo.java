public class yo extends Exception {
   private final xo a;

   public yo(xo $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public yo(xo $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public xo a() {
      return this.a;
   }
}
