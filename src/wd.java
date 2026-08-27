public class wd extends Exception {
   private final vd a;

   public wd(vd $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wd(vd $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public vd b() {
      return this.a;
   }
}
