public record vz(int a, float b) implements uo<ur> {
   public vz(bfz $$0) {
      this($$0.af(), $$0.eB());
   }

   public vz(sf $$0) {
      this($$0.m(), $$0.readFloat());
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.writeFloat(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public float c() {
      return this.b;
   }
}
