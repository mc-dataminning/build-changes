public record hw(int a, er b, hw.a c) {
   public void a(int $$0) {
      this.b.onSuccess($$0);
   }

   public void a() {
      this.b.onFailure();
   }

   public void b() {
      this.c.discard();
   }

   public int c() {
      return this.a;
   }

   public er d() {
      return this.b;
   }

   public hw.a e() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void discard();
   }
}
