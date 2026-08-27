public class wb extends Exception {
   private final vb a;

   public wb(vb $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wb(vb $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public vb b() {
      return this.a;
   }
}
