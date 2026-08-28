import javax.annotation.Nullable;

public class hes implements hey {
   private static final int a = 1200;
   private static final xl b = xl.c("tutorial.craft_planks.title");
   private static final xl c = xl.c("tutorial.craft_planks.description");
   private final hex d;
   @Nullable
   private foi e;
   private int f;

   public hes(hex $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hez.f);
      } else {
         if (this.f == 1) {
            ght $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gl().a(axm.b)) {
                  this.d.a(hez.f);
                  return;
               }

               if (a($$0, axm.b)) {
                  this.d.a(hez.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new foi(foi.a.e, b, c, false);
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
   public void a(cwf $$0) {
      if ($$0.a(axm.b)) {
         this.d.a(hez.f);
      }
   }

   public static boolean a(ght $$0, axt<cwb> $$1) {
      for (jq<cwb> $$2 : lz.g.c($$1)) {
         if ($$0.i().a(awy.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
