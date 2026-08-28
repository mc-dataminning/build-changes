public class glx {
   private final gqm a;
   private final glo b;
   private final gri c;
   private glx.a d = glx.a.a;

   public glx(gqm $$0, glo $$1, gri $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            iw $$0 = this.a.dv();
            boolean $$1 = this.b.e($$0.v());
            if ($$1 || this.c.a($$0) || this.a.aa_() || !this.a.bJ()) {
               this.d = glx.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == glx.a.c;
   }

   public void c() {
      if (this.d == glx.a.a) {
         this.d = glx.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
