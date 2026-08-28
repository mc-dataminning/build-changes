public class gvh implements gvn {
   private static final int a = 1200;
   private static final wu b = wu.c("tutorial.craft_planks.title");
   private static final wu c = wu.c("tutorial.craft_planks.description");
   private final gvm d;
   private fkf e;
   private int f;

   public gvh(gvm $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvo.f);
      } else {
         if (this.f == 1) {
            gdh $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.ga().a(awf.b)) {
                  this.d.a(gvo.f);
                  return;
               }

               if (a($$0, awf.b)) {
                  this.d.a(gvo.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fkf(fkf.a.e, b, c, false);
            this.d.e().aw().a(this.e);
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
   public void a(cud $$0) {
      if ($$0.a(awf.b)) {
         this.d.a(gvo.f);
      }
   }

   public static boolean a(gdh $$0, awm<cty> $$1) {
      for (jj<cty> $$2 : lq.g.c($$1)) {
         if ($$0.j().a(avr.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
