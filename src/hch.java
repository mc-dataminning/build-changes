import javax.annotation.Nullable;

public class hch implements hcm {
   private static final int a = 6000;
   private static final xd b = xd.c("tutorial.find_tree.title");
   private static final xd c = xd.c("tutorial.find_tree.description");
   private final hcl d;
   @Nullable
   private fmm e;
   private int f;

   public hch(hcl $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hcn.f);
      } else {
         if (this.f == 1) {
            gfs $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hcn.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fmm(fmm.a.c, b, c, false);
            this.d.e().az().a(this.e);
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
   public void a(gax $$0, eyc $$1) {
      if ($$1.c() == eyc.a.b) {
         dua $$2 = $$0.a_(((eya)$$1).a());
         if ($$2.a(aws.ak)) {
            this.d.a(hcn.c);
         }
      }
   }

   @Override
   public void a(cvl $$0) {
      if ($$0.a(axb.aM)) {
         this.d.a(hcn.e);
      }
   }

   private static boolean b(gfs $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(axb.aM));
   }

   public static boolean a(gfs $$0) {
      for (jn<dgv> $$1 : lu.e.b(aws.ak)) {
         dgv $$2 = $$1.a();
         if ($$0.i().a(awn.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
