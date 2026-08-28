import javax.annotation.Nullable;

public class hef implements hei {
   private static final int a = 600;
   private static final xi b = xi.c("tutorial.open_inventory.title");
   private static final xi c = xi.a("tutorial.open_inventory.description", heh.a("inventory"));
   private final heh d;
   @Nullable
   private fnt e;
   private int f;

   public hef(heh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hej.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fnt(fnt.a.d, b, c, false);
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
      this.d.a(hej.e);
   }
}
