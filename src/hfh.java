import javax.annotation.Nullable;

public class hfh implements hfj {
   private static final int a = 600;
   private static final xj b = xj.c("tutorial.punch_tree.title");
   private static final xj c = xj.a("tutorial.punch_tree.description", hfi.a("attack"));
   private final hfi d;
   @Nullable
   private fop e;
   private int f;
   private int g;

   public hfh(hfi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hfk.f);
      } else {
         if (this.f == 1) {
            gic $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gg().a(axl.r)) {
                  this.d.a(hfk.e);
                  return;
               }

               if (hfe.a($$0)) {
                  this.d.a(hfk.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fop(fop.a.c, b, c, true);
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
   public void a(gdh $$0, jh $$1, dvv $$2, float $$3) {
      boolean $$4 = $$2.a(axc.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hfk.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cwm $$0) {
      if ($$0.a(axl.r)) {
         this.d.a(hfk.e);
      }
   }
}
