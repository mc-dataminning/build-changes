public class si extends sp {
   protected final xg a;
   protected final int b;

   public si(xg $$0, int $$1) {
      super($$0.getString());
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public xg a() {
      return xg.a("test.error.tick", this.a, this.b);
   }

   @Override
   public String getMessage() {
      return this.a().getString();
   }
}
