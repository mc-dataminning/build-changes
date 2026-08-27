public class xi extends Exception {
   private final wi a;

   public xi(wi $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xi(wi $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public wi b() {
      return this.a;
   }
}
