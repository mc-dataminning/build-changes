public class si extends sp {
   protected final xc a;
   protected final int b;

   public si(xc $$0, int $$1) {
      super($$0.getString());
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public xc a() {
      return xc.a("test.error.tick", this.a, this.b);
   }

   @Override
   public String getMessage() {
      return this.a().getString();
   }
}
