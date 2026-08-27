public class gel implements geq {
   private static final int a = 6000;
   private static final tl b = tl.c("tutorial.find_tree.title");
   private static final tl c = tl.c("tutorial.find_tree.description");
   private final gep d;
   private euu e;
   private int f;

   public gel(gep $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ger.f);
      } else {
         if (this.f == 1) {
            fnc $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(ger.e);
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
   public void a(fis $$0, ehf $$1) {
      if ($$1.c() == ehf.a.b) {
         dfd $$2 = $$0.a_(((ehd)$$1).a());
         if ($$2.a(apv.ai)) {
            this.d.a(ger.c);
         }
      }
   }

   @Override
   public void a(cjl $$0) {
      if ($$0.a(aqd.al)) {
         this.d.a(ger.e);
      }
   }

   private static boolean b(fnc $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(aqd.al));
   }

   public static boolean a(fnc $$0) {
      for (he<ctc> $$1 : jb.f.c(apv.ai)) {
         ctc $$2 = $$1.a();
         if ($$0.j().a(apq.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
