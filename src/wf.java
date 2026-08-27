public class wf extends Exception {
   private final vf a;

   public wf(vf $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wf(vf $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public vf b() {
      return this.a;
   }
}
