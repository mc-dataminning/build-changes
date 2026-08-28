public class sh extends so {
   protected final wy a;
   protected final int b;

   public sh(wy $$0, int $$1) {
      super($$0.getString());
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public wy a() {
      return wy.a("test.error.tick", this.a, this.b);
   }

   @Override
   public String getMessage() {
      return this.a().getString();
   }
}
