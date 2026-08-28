import javax.annotation.Nullable;

public class hoc implements hof {
   private static final int a = 600;
   private static final ww b = ww.c("tutorial.open_inventory.title");
   private static final ww c = ww.a("tutorial.open_inventory.description", hoe.a("inventory"));
   private final hoe d;
   @Nullable
   private fuc e;
   private int f;

   public hoc(hoe $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hog.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fof $$0 = this.d.e();
            this.e = new fuc($$0.h, fuc.a.d, b, c, false);
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
   public void c() {
      this.d.a(hog.e);
   }
}
