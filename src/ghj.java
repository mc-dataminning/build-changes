public class ghj implements ghp {
   private static final int a = 1200;
   private static final uv b = uv.c("tutorial.craft_planks.title");
   private static final uv c = uv.c("tutorial.craft_planks.description");
   private final gho d;
   private exo e;
   private int f;

   public ghj(gho $$0) {
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
            if ($$0 != null) {
               if ($$0.fT().a(ars.b)) {
                  this.d.a(ghq.f);
                  return;
               }

               if (a($$0, ars.b)) {
                  this.d.a(ghq.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new exo(exo.a.e, b, c, false);
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
   public void a(clo $$0) {
      if ($$0.a(ars.b)) {
         this.d.a(ghq.f);
      }
   }

   public static boolean a(fqb $$0, arz<clj> $$1) {
      for (ig<clj> $$2 : kc.i.c($$1)) {
         if ($$0.j().a(arf.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
