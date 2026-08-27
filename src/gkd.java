public class gkd implements gki {
   private static final int a = 6000;
   private static final vf b = vf.c("tutorial.find_tree.title");
   private static final vf c = vf.c("tutorial.find_tree.description");
   private final gkh d;
   private ezq e;
   private int f;

   public gkd(gkh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkj.f);
      } else {
         if (this.f == 1) {
            fsj $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gkj.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new ezq(ezq.a.c, b, c, false);
            this.d.e().ay().a(this.e);
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
   public void a(fns $$0, elr $$1) {
      if ($$1.c() == elr.a.b) {
         djh $$2 = $$0.a_(((elp)$$1).a());
         if ($$2.a(ash.ai)) {
            this.d.a(gkj.c);
         }
      }
   }

   @Override
   public void a(cmy $$0) {
      if ($$0.a(asp.al)) {
         this.d.a(gkj.e);
      }
   }

   private static boolean b(fsj $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(asp.al));
   }

   public static boolean a(fsj $$0) {
      for (ih<cwq> $$1 : kd.e.c(ash.ai)) {
         cwq $$2 = $$1.a();
         if ($$0.j().a(asc.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
