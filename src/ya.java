public record ya(int a, float b) implements va<ws> {
   public ya(bjb $$0) {
      this($$0.ah(), $$0.eC());
   }

   public ya(sl $$0) {
      this($$0.m(), $$0.readFloat());
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
