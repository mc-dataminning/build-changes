public class tr extends so {
   private final Throwable a;

   public tr(Throwable $$0) {
      super($$0.getMessage());
      this.a = $$0;
   }

   @Override
   public xa a() {
      return xa.a("test.error.unknown", this.a.getMessage());
   }
}
