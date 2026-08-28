import javax.annotation.Nullable;

public class hck implements hcm {
   private static final int a = 600;
   private static final xd b = xd.c("tutorial.punch_tree.title");
   private static final xd c = xd.a("tutorial.punch_tree.description", hcl.a("attack"));
   private final hcl d;
   @Nullable
   private fmm e;
   private int f;
   private int g;

   public hck(hcl $$0) {
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
               if ($$0.gc().a(axb.r)) {
                  this.d.a(hcn.e);
                  return;
               }

               if (hch.a($$0)) {
                  this.d.a(hcn.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fmm(fmm.a.c, b, c, true);
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
   public void a(gax $$0, je $$1, dua $$2, float $$3) {
      boolean $$4 = $$2.a(aws.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hcn.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cvl $$0) {
      if ($$0.a(axb.r)) {
         this.d.a(hcn.e);
      }
   }
}
