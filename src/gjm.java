public class gjm {
   private final goa a;
   private final gjd b;
   private final goy c;
   private gjm.a d = gjm.a.a;

   public gjm(goa $$0, gjd $$1, goy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            iu $$0 = this.a.dv();
            boolean $$1 = this.b.e($$0.v());
            if ($$1 || this.c.a($$0) || this.a.U_() || !this.a.bK()) {
               this.d = gjm.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == gjm.a.c;
   }

   public void c() {
      if (this.d == gjm.a.a) {
         this.d = gjm.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
