public class giy implements gje {
   private static final int a = 1200;
   private static final vb b = vb.c("tutorial.craft_planks.title");
   private static final vb c = vb.c("tutorial.craft_planks.description");
   private final gjd d;
   private eyr e;
   private int f;

   public giy(gjd $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gjf.f);
      } else {
         if (this.f == 1) {
            frk $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(arz.b)) {
                  this.d.a(gjf.f);
                  return;
               }

               if (a($$0, arz.b)) {
                  this.d.a(gjf.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new eyr(eyr.a.e, b, c, false);
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
   public void a(cmh $$0) {
      if ($$0.a(arz.b)) {
         this.d.a(gjf.f);
      }
   }

   public static boolean a(frk $$0, asg<cmc> $$1) {
      for (ie<cmc> $$2 : kb.h.c($$1)) {
         if ($$0.j().a(arm.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
