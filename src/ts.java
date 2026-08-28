public class ts extends sp {
   private final Throwable a;

   public ts(Throwable $$0) {
      super($$0.getMessage());
      this.a = $$0;
   }

   @Override
   public xc a() {
      return xc.a("test.error.unknown", this.a.getMessage());
   }
}
