public class ue extends Exception {
   private final tf a;

   public ue(tf $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ue(tf $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public tf b() {
      return this.a;
   }
}
