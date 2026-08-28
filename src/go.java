public interface go {
   ewh a(eq var1);

   ewg b(eq var1);

   default ja c(eq $$0) {
      return ja.a(this.a($$0));
   }

   boolean a();

   boolean b();

   boolean c();
}
