public class gkc implements gki {
   private static final int a = 1200;
   private static final vf b = vf.c("tutorial.craft_planks.title");
   private static final vf c = vf.c("tutorial.craft_planks.description");
   private final gkh d;
   private ezq e;
   private int f;

   public gkc(gkh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkj.f);
      } else {
         if (this.f == 1) {
            fsj $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(asp.b)) {
                  this.d.a(gkj.f);
                  return;
               }

               if (a($$0, asp.b)) {
                  this.d.a(gkj.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new ezq(ezq.a.e, b, c, false);
            this.d.e().ay().a(this.e);
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
   public void a(cmy $$0) {
      if ($$0.a(asp.b)) {
         this.d.a(gkj.f);
      }
   }

   public static boolean a(fsj $$0, asw<cmt> $$1) {
      for (ih<cmt> $$2 : kd.h.c($$1)) {
         if ($$0.j().a(asc.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
