public interface go {
   ewf a(eq var1);

   ewe b(eq var1);

   default ja c(eq $$0) {
      return ja.a(this.a($$0));
   }

   boolean a();

   boolean b();

   boolean c();
}
