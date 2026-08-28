import javax.annotation.Nullable;

public class hed implements hei {
   private static final int a = 6000;
   private static final xi b = xi.c("tutorial.find_tree.title");
   private static final xi c = xi.c("tutorial.find_tree.description");
   private final heh d;
   @Nullable
   private fnt e;
   private int f;

   public hed(heh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hej.f);
      } else {
         if (this.f == 1) {
            ghd $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(hej.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fnt(fnt.a.c, b, c, false);
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
   public void a(gci $$0, ezl $$1) {
      if ($$1.d() == ezl.a.b) {
         dvj $$2 = $$0.a_(((ezj)$$1).b());
         if ($$2.a(axa.ak)) {
            this.d.a(hej.c);
         }
      }
   }

   @Override
   public void a(cwb $$0) {
      if ($$0.a(axj.aQ)) {
         this.d.a(hej.e);
      }
   }

   private static boolean b(ghd $$0) {
      return $$0.gk().a_($$0x -> $$0x.a(axj.aQ));
   }

   public static boolean a(ghd $$0) {
      for (jq<die> $$1 : ly.e.c(axa.ak)) {
         die $$2 = $$1.a();
         if ($$0.i().a(awv.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
