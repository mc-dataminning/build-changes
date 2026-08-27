public record zv(int a, float b) implements wu<yo> {
   public zv(blv $$0) {
      this($$0.aj(), $$0.eE());
   }

   public zv(ue $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
