public class sg extends RuntimeException {
   protected final wv a;
   protected final int b;

   public sg(wv $$0, int $$1) {
      super($$0.getString());
      this.a = $$0;
      this.b = $$1;
   }

   public wv a() {
      return wv.a("test.error.tick", this.a, this.b);
   }

   @Override
   public String getMessage() {
      return this.a().getString();
   }
}
