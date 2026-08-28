public class sh extends so {
   protected final xa a;
   protected final int b;

   public sh(xa $$0, int $$1) {
      super($$0.getString());
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public xa a() {
      return xa.a("test.error.tick", this.a, this.b);
   }

   @Override
   public String getMessage() {
      return this.a().getString();
   }
}
