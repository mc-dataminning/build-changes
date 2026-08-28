import javax.annotation.Nullable;

public class hdr implements hdx {
   private static final int a = 1200;
   private static final xh b = xh.c("tutorial.craft_planks.title");
   private static final xh c = xh.c("tutorial.craft_planks.description");
   private final hdw d;
   @Nullable
   private fnl e;
   private int f;

   public hdr(hdw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdy.f);
      } else {
         if (this.f == 1) {
            ggs $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gk().a(axi.b)) {
                  this.d.a(hdy.f);
                  return;
               }

               if (a($$0, axi.b)) {
                  this.d.a(hdy.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fnl(fnl.a.e, b, c, false);
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
   public void a(cvx $$0) {
      if ($$0.a(axi.b)) {
         this.d.a(hdy.f);
      }
   }

   public static boolean a(ggs $$0, axp<cvt> $$1) {
      for (jp<cvt> $$2 : lx.g.c($$1)) {
         if ($$0.i().a(awu.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
