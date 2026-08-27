public class gek implements gep {
   private static final int a = 6000;
   private static final ti b = ti.c("tutorial.find_tree.title");
   private static final ti c = ti.c("tutorial.find_tree.description");
   private final geo d;
   private euu e;
   private int f;

   public gek(geo $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(geq.f);
      } else {
         if (this.f == 1) {
            fnb $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(geq.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new euu(euu.a.c, b, c, false);
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
   public void a(fis $$0, ehg $$1) {
      if ($$1.c() == ehg.a.b) {
         dfe $$2 = $$0.a_(((ehe)$$1).a());
         if ($$2.a(apo.ai)) {
            this.d.a(geq.c);
         }
      }
   }

   @Override
   public void a(cja $$0) {
      if ($$0.a(apw.al)) {
         this.d.a(geq.e);
      }
   }

   private static boolean b(fnb $$0) {
      return $$0.fQ().a_($$0x -> $$0x.a(apw.al));
   }

   public static boolean a(fnb $$0) {
      for (hg<csq> $$1 : jd.f.c(apo.ai)) {
         csq $$2 = $$1.a();
         if ($$0.j().a(apj.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
