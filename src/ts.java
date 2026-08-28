public class ts extends sp {
   private final Throwable a;

   public ts(Throwable $$0) {
      super($$0.getMessage());
      this.a = $$0;
   }

   @Override
   public xg a() {
      return xg.a("test.error.unknown", this.a.getMessage());
   }
}
