public class xw extends Exception {
   private final ww a;

   public xw(ww $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xw(ww $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public ww a() {
      return this.a;
   }
}
