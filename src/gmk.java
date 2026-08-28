public class gmk {
   private final gqz a;
   private final gmb b;
   private final grv c;
   private gmk.a d = gmk.a.a;

   public gmk(gqz $$0, gmb $$1, grv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            iv $$0 = this.a.dv();
            boolean $$1 = this.b.e($$0.v());
            if ($$1 || this.c.a($$0) || this.a.Z_() || !this.a.bJ()) {
               this.d = gmk.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == gmk.a.c;
   }

   public void c() {
      if (this.d == gmk.a.a) {
         this.d = gmk.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
