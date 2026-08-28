public interface wk {
   zp N_();

   vw b();

   void a(vx var1);

   default void a(zo $$0, Exception $$1) throws aa {
      throw zr.a($$1, $$0, this);
   }

   default vx a(xg $$0, Throwable $$1) {
      return new vx($$0);
   }

   boolean c();

   default boolean a(zo<?> $$0) {
      return this.c();
   }

   default void a(p $$0) {
      q $$1 = $$0.a("Connection");
      $$1.a("Protocol", () -> this.b().a());
      $$1.a("Flow", () -> this.N_().toString());
      this.a($$0, $$1);
   }

   default void a(p $$0, q $$1) {
   }
}
