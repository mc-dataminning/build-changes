public class gva implements gvf {
   private static final int a = 6000;
   private static final wu b = wu.c("tutorial.find_tree.title");
   private static final wu c = wu.c("tutorial.find_tree.description");
   private final gve d;
   private fjx e;
   private int f;

   public gva(gve $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvg.f);
      } else {
         if (this.f == 1) {
            gcz $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gvg.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fjx(fjx.a.c, b, c, false);
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
   public void a(fyd $$0, evx $$1) {
      if ($$1.c() == evx.a.b) {
         dsh $$2 = $$0.a_(((evv)$$1).a());
         if ($$2.a(avu.aj)) {
            this.d.a(gvg.c);
         }
      }
   }

   @Override
   public void a(cua $$0) {
      if ($$0.a(awd.aM)) {
         this.d.a(gvg.e);
      }
   }

   private static boolean b(gcz $$0) {
      return $$0.fY().a_($$0x -> $$0x.a(awd.aM));
   }

   public static boolean a(gcz $$0) {
      for (jj<dff> $$1 : lq.e.c(avu.aj)) {
         dff $$2 = $$1.a();
         if ($$0.j().a(avp.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
