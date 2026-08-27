public class vi extends Exception {
   private final ui a;

   public vi(ui $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public vi(ui $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public ui b() {
      return this.a;
   }
}
