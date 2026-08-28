public class yc extends Exception {
   private final xc a;

   public yc(xc $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public yc(xc $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public xc a() {
      return this.a;
   }
}
