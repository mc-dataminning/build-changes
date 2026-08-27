public record ye(int a, float b) implements ve<wx> {
   public ye(bjm $$0) {
      this($$0.ah(), $$0.eD());
   }

   public ye(so $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(so $$0) {
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
