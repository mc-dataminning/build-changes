public class ghk implements ghp {
   private static final int a = 6000;
   private static final uv b = uv.c("tutorial.find_tree.title");
   private static final uv c = uv.c("tutorial.find_tree.description");
   private final gho d;
   private exo e;
   private int f;

   public ghk(gho $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ghq.f);
      } else {
         if (this.f == 1) {
            fqb $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(ghq.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new exo(exo.a.c, b, c, false);
            this.d.e().ax().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(flo $$0, ejx $$1) {
      if ($$1.c() == ejx.a.b) {
         dhn $$2 = $$0.a_(((ejv)$$1).a());
         if ($$2.a(ark.ai)) {
            this.d.a(ghq.c);
         }
      }
   }

   @Override
   public void a(clo $$0) {
      if ($$0.a(ars.al)) {
         this.d.a(ghq.e);
      }
   }

   private static boolean b(fqb $$0) {
      return $$0.fT().a_($$0x -> $$0x.a(ars.al));
   }

   public static boolean a(fqb $$0) {
      for (ig<cvf> $$1 : kc.f.c(ark.ai)) {
         cvf $$2 = $$1.a();
         if ($$0.j().a(arf.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
