public record gk<T>(gq a, gn<T> b) {
   public void a(go<T> $$0) {
      gr $$1 = $$0.b();

      try {
         this.b.execute($$0, this.a);
      } catch (Exception var4) {
         if ($$1 != null) {
            $$1.a(var4.getMessage());
         }
      }
   }
}
