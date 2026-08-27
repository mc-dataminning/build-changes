public record gu(int a, dr b, gu.a c) {
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

   public dr d() {
      return this.b;
   }

   public gu.a e() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void discard();
   }
}
