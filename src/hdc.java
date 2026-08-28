import javax.annotation.Nullable;

public class hdc implements hdi {
   private static final int a = 1200;
   private static final xe b = xe.c("tutorial.craft_planks.title");
   private static final xe c = xe.c("tutorial.craft_planks.description");
   private final hdh d;
   @Nullable
   private fna e;
   private int f;

   public hdc(hdh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdj.f);
      } else {
         if (this.f == 1) {
            ggh $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gd().a(axe.b)) {
                  this.d.a(hdj.f);
                  return;
               }

               if (a($$0, axe.b)) {
                  this.d.a(hdj.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fna(fna.a.e, b, c, false);
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
   public void a(cvs $$0) {
      if ($$0.a(axe.b)) {
         this.d.a(hdj.f);
      }
   }

   public static boolean a(ggh $$0, axl<cvn> $$1) {
      for (jo<cvn> $$2 : lv.g.c($$1)) {
         if ($$0.i().a(awq.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
