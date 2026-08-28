public interface gfx<T extends dpn> {
   void a(T var1, float var2, fag var3, gdx var4, int var5, int var6);

   default boolean a(T $$0) {
      return false;
   }

   default int aS_() {
      return 64;
   }

   default boolean a(T $$0, evz $$1) {
      return evz.b($$0.az_()).a((jt)$$1, (double)this.aS_());
   }
}
