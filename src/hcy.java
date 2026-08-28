import javax.annotation.Nullable;

public class hcy implements hdd {
   private static final int a = 6000;
   private static final xd b = xd.c("tutorial.find_tree.title");
   private static final xd c = xd.c("tutorial.find_tree.description");
   private final hdc d;
   @Nullable
   private fmw e;
   private int f;

   public hcy(hdc $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hde.f);
      } else {
         if (this.f == 1) {
            ggc $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hde.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fmw(fmw.a.c, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void a(gbh $$0, eyq $$1) {
      if ($$1.d() == eyq.a.b) {
         duo $$2 = $$0.a_(((eyo)$$1).b());
         if ($$2.a(awt.ak)) {
            this.d.a(hde.c);
         }
      }
   }

   @Override
   public void a(cvp $$0) {
      if ($$0.a(axc.aM)) {
         this.d.a(hde.e);
      }
   }

   private static boolean b(ggc $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(axc.aM));
   }

   public static boolean a(ggc $$0) {
      for (jn<dhj> $$1 : lu.e.b(awt.ak)) {
         dhj $$2 = $$1.a();
         if ($$0.i().a(awo.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
