public record yf(int a, float b) implements vf<wy> {
   public yf(bji $$0) {
      this($$0.ah(), $$0.eD());
   }

   public yf(sq $$0) {
      this($$0.m(), $$0.readFloat());
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
