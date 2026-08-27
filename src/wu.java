public class wu extends Exception {
   private final vu a;

   public wu(vu $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wu(vu $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public vu b() {
      return this.a;
   }
}
