public record ye(int a, float b) implements ve<wx> {
   public ye(bjg $$0) {
      this($$0.ah(), $$0.eD());
   }

   public ye(sp $$0) {
      this($$0.m(), $$0.readFloat());
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
