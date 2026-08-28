import javax.annotation.Nullable;

public class hcg implements hcm {
   private static final int a = 1200;
   private static final xd b = xd.c("tutorial.craft_planks.title");
   private static final xd c = xd.c("tutorial.craft_planks.description");
   private final hcl d;
   @Nullable
   private fmm e;
   private int f;

   public hcg(hcl $$0) {
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
            if ($$0 != null) {
               if ($$0.gc().a(axb.b)) {
                  this.d.a(hcn.f);
                  return;
               }

               if (a($$0, axb.b)) {
                  this.d.a(hcn.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fmm(fmm.a.e, b, c, false);
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
   public void a(cvl $$0) {
      if ($$0.a(axb.b)) {
         this.d.a(hcn.f);
      }
   }

   public static boolean a(gfs $$0, axi<cvg> $$1) {
      for (jn<cvg> $$2 : lu.g.b($$1)) {
         if ($$0.i().a(awn.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
