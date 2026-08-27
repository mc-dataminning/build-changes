public record zk(int a, float b) implements wk<yd> {
   public zk(blg $$0) {
      this($$0.aj(), $$0.eF());
   }

   public zk(tu $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
