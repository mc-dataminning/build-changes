public record gj<T>(int a, gm<T> b) {
   public void a(gn<T> $$0) {
      gp $$1 = $$0.b();

      try {
         this.b.execute($$0, this.a);
      } catch (Exception var4) {
         if ($$1 != null) {
            $$1.a(var4.getMessage());
         }
      }
   }
}
