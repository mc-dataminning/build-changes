public class gvg implements gvl {
   private static final int a = 6000;
   private static final wu b = wu.c("tutorial.find_tree.title");
   private static final wu c = wu.c("tutorial.find_tree.description");
   private final gvk d;
   private fkd e;
   private int f;

   public gvg(gvk $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvm.f);
      } else {
         if (this.f == 1) {
            gdf $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gvm.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fkd(fkd.a.c, b, c, false);
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
   public void a(fyj $$0, ewd $$1) {
      if ($$1.c() == ewd.a.b) {
         dsk $$2 = $$0.a_(((ewb)$$1).a());
         if ($$2.a(avw.aj)) {
            this.d.a(gvm.c);
         }
      }
   }

   @Override
   public void a(cuc $$0) {
      if ($$0.a(awf.aM)) {
         this.d.a(gvm.e);
      }
   }

   private static boolean b(gdf $$0) {
      return $$0.fZ().a_($$0x -> $$0x.a(awf.aM));
   }

   public static boolean a(gdf $$0) {
      for (jj<dfh> $$1 : lq.e.c(avw.aj)) {
         dfh $$2 = $$1.a();
         if ($$0.j().a(avr.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
