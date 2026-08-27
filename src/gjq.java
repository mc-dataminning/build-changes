public class gjq implements gjv {
   private static final int a = 6000;
   private static final vd b = vd.c("tutorial.find_tree.title");
   private static final vd c = vd.c("tutorial.find_tree.description");
   private final gju d;
   private ezi e;
   private int f;

   public gjq(gju $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gjw.f);
      } else {
         if (this.f == 1) {
            fsb $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gjw.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new ezi(ezi.a.c, b, c, false);
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
   public void a(fnk $$0, elk $$1) {
      if ($$1.c() == elk.a.b) {
         dja $$2 = $$0.a_(((eli)$$1).a());
         if ($$2.a(asb.ai)) {
            this.d.a(gjw.c);
         }
      }
   }

   @Override
   public void a(cmr $$0) {
      if ($$0.a(asj.al)) {
         this.d.a(gjw.e);
      }
   }

   private static boolean b(fsb $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(asj.al));
   }

   public static boolean a(fsb $$0) {
      for (ih<cwj> $$1 : kd.e.c(asb.ai)) {
         cwj $$2 = $$1.a();
         if ($$0.j().a(arw.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
