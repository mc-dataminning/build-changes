import javax.annotation.Nullable;

public class hhg implements hhj {
   private static final int a = 600;
   private static final xv b = xv.c("tutorial.open_inventory.title");
   private static final xv c = xv.a("tutorial.open_inventory.description", hhi.a("inventory"));
   private final hhi d;
   @Nullable
   private fql e;
   private int f;

   public hhg(hhi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhk.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fql(fql.a.d, b, c, false);
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
   public void c() {
      this.d.a(hhk.e);
   }
}
