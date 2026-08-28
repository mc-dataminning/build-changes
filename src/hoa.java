import javax.annotation.Nullable;

public class hoa implements hof {
   private static final int a = 6000;
   private static final ww b = ww.c("tutorial.find_tree.title");
   private static final ww c = ww.c("tutorial.find_tree.description");
   private final hoe d;
   @Nullable
   private fuc e;
   private int f;

   public hoa(hoe $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hog.f);
      } else {
         fof $$0 = this.d.e();
         if (this.f == 1) {
            goa $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hog.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fuc($$0.h, fuc.a.c, b, c, false);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }
   }

   @Override
   public void a(gjd $$0, fdu $$1) {
      if ($$1.d() == fdu.a.b) {
         dzo $$2 = $$0.a_(((fds)$$1).b());
         if ($$2.a(axa.al)) {
            this.d.a(hog.c);
         }
      }
   }

   @Override
   public void a(cys $$0) {
      if ($$0.a(axi.aQ)) {
         this.d.a(hog.e);
      }
   }

   private static boolean b(goa $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(axi.aQ));
   }

   public static boolean a(goa $$0) {
      for (je<dlu> $$1 : mf.e.c(axa.al)) {
         dlu $$2 = $$1.a();
         if ($$0.l().a(awv.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
