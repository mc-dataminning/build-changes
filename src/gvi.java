public class gvi implements gvn {
   private static final int a = 6000;
   private static final wu b = wu.c("tutorial.find_tree.title");
   private static final wu c = wu.c("tutorial.find_tree.description");
   private final gvm d;
   private fkf e;
   private int f;

   public gvi(gvm $$0) {
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
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gvo.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fkf(fkf.a.c, b, c, false);
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
   public void a(fyl $$0, ewf $$1) {
      if ($$1.c() == ewf.a.b) {
         dsl $$2 = $$0.a_(((ewd)$$1).a());
         if ($$2.a(avw.aj)) {
            this.d.a(gvo.c);
         }
      }
   }

   @Override
   public void a(cud $$0) {
      if ($$0.a(awf.aM)) {
         this.d.a(gvo.e);
      }
   }

   private static boolean b(gdh $$0) {
      return $$0.ga().a_($$0x -> $$0x.a(awf.aM));
   }

   public static boolean a(gdh $$0) {
      for (jj<dfi> $$1 : lq.e.c(avw.aj)) {
         dfi $$2 = $$1.a();
         if ($$0.j().a(avr.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
