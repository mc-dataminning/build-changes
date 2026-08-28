public class sh extends RuntimeException {
   protected final ww a;
   protected final int b;

   public sh(ww $$0, int $$1) {
      super($$0.getString());
      this.a = $$0;
      this.b = $$1;
   }

   public ww a() {
      return ww.a("test.error.tick", this.a, this.b);
   }

   @Override
   public String getMessage() {
      return this.a().getString();
   }
}
