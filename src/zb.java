public record zb(int a, float b) implements wb<xu> {
   public zb(bkj $$0) {
      this($$0.ah(), $$0.eD());
   }

   public zb(tl $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
