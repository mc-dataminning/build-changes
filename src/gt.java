public interface gt {
   ezh a(ev var1, boolean var2);

   ezg b(ev var1, boolean var2);

   default ezh a(ev $$0) {
      return this.a($$0, false);
   }

   default ezg b(ev $$0) {
      return this.b($$0, false);
   }

   default jg c(ev $$0) {
      return jg.a((jz)this.a($$0, false));
   }

   boolean a();

   boolean b();

   boolean c();
}
