public record gfb<T extends ghl>(T a, T b) {
   public T a(boolean $$0) {
      return $$0 ? this.b : this.a;
   }
}
