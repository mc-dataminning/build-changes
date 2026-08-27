public class ggr implements ggx {
   private static final int a = 1200;
   private static final ur b = ur.c("tutorial.craft_planks.title");
   private static final ur c = ur.c("tutorial.craft_planks.description");
   private final ggw d;
   private eww e;
   private int f;

   public ggr(ggw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ggy.f);
      } else {
         if (this.f == 1) {
            fpj $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(ark.b)) {
                  this.d.a(ggy.f);
                  return;
               }

               if (a($$0, ark.b)) {
                  this.d.a(ggy.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new eww(eww.a.e, b, c, false);
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
   public void a(clb $$0) {
      if ($$0.a(ark.b)) {
         this.d.a(ggy.f);
      }
   }

   public static boolean a(fpj $$0, arr<ckw> $$1) {
      for (ib<ckw> $$2 : jy.i.c($$1)) {
         if ($$0.j().a(aqx.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
