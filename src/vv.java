public interface vv {
   yx a();

   vj b();

   void a(vk var1);

   default void a(yw $$0, Exception $$1) throws z {
      throw yz.a($$1, $$0, this);
   }

   default vk a(wp $$0, Throwable $$1) {
      return new vk($$0);
   }

   boolean c();

   default boolean a(yw<?> $$0) {
      return this.c();
   }

   default void a(o $$0) {
      p $$1 = $$0.a("Connection");
      $$1.a("Protocol", () -> this.b().a());
      $$1.a("Flow", () -> this.a().toString());
      this.a($$0, $$1);
   }

   default void a(o $$0, p $$1) {
   }
}
