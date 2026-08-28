public class yp extends Exception {
   private final xp a;

   public yp(xp $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public yp(xp $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public xp a() {
      return this.a;
   }
}
