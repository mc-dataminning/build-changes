public class gkr implements gkw {
   private static final int a = 6000;
   private static final vg b = vg.c("tutorial.find_tree.title");
   private static final vg c = vg.c("tutorial.find_tree.description");
   private final gkv d;
   private fab e;
   private int f;

   public gkr(gkv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkx.f);
      } else {
         if (this.f == 1) {
            fsv $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gkx.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fab(fab.a.c, b, c, false);
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
   public void a(foe $$0, ema $$1) {
      if ($$1.c() == ema.a.b) {
         djp $$2 = $$0.a_(((ely)$$1).a());
         if ($$2.a(asi.ai)) {
            this.d.a(gkx.c);
         }
      }
   }

   @Override
   public void a(cng $$0) {
      if ($$0.a(asq.al)) {
         this.d.a(gkx.e);
      }
   }

   private static boolean b(fsv $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(asq.al));
   }

   public static boolean a(fsv $$0) {
      for (ih<cwy> $$1 : kd.e.c(asi.ai)) {
         cwy $$2 = $$1.a();
         if ($$0.j().a(asd.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
