public record yd(int a, float b) implements vd<ww> {
   public yd(bjg $$0) {
      this($$0.ah(), $$0.eD());
   }

   public yd(so $$0) {
      this($$0.m(), $$0.readFloat());
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
