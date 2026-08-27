public record xw(int a, float b) implements uw<wo> {
   public xw(biw $$0) {
      this($$0.ah(), $$0.eD());
   }

   public xw(sh $$0) {
      this($$0.m(), $$0.readFloat());
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
