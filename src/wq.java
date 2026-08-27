public class wq extends Exception {
   private final vq a;

   public wq(vq $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wq(vq $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public vq b() {
      return this.a;
   }
}
