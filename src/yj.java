public class yj extends Exception {
   private final xj a;

   public yj(xj $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public yj(xj $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public xj a() {
      return this.a;
   }
}
