public record xx(int a, float b) implements ux<wp> {
   public xx(biy $$0) {
      this($$0.ah(), $$0.eC());
   }

   public xx(si $$0) {
      this($$0.m(), $$0.readFloat());
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
