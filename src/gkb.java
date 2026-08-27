public class gkb implements gkg {
   private static final int a = 6000;
   private static final vf b = vf.c("tutorial.find_tree.title");
   private static final vf c = vf.c("tutorial.find_tree.description");
   private final gkf d;
   private ezo e;
   private int f;

   public gkb(gkf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkh.f);
      } else {
         if (this.f == 1) {
            fsh $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gkh.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new ezo(ezo.a.c, b, c, false);
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
   public void a(fnq $$0, elq $$1) {
      if ($$1.c() == elq.a.b) {
         djg $$2 = $$0.a_(((elo)$$1).a());
         if ($$2.a(asg.ai)) {
            this.d.a(gkh.c);
         }
      }
   }

   @Override
   public void a(cmx $$0) {
      if ($$0.a(aso.al)) {
         this.d.a(gkh.e);
      }
   }

   private static boolean b(fsh $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(aso.al));
   }

   public static boolean a(fsh $$0) {
      for (ih<cwp> $$1 : kd.e.c(asg.ai)) {
         cwp $$2 = $$1.a();
         if ($$0.j().a(asb.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
