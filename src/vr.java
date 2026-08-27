public class vr extends Exception {
   private final ur a;

   public vr(ur $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public vr(ur $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public ur b() {
      return this.a;
   }
}
