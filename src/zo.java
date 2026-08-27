public record zo(int a, float b) implements wo<yh> {
   public zo(bll $$0) {
      this($$0.aj(), $$0.eF());
   }

   public zo(ty $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
