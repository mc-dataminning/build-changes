public class xx extends Exception {
   private final wx a;

   public xx(wx $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xx(wx $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public wx a() {
      return this.a;
   }
}
