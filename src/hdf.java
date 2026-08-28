import javax.annotation.Nullable;

public class hdf implements hdi {
   private static final int a = 600;
   private static final xe b = xe.c("tutorial.open_inventory.title");
   private static final xe c = xe.a("tutorial.open_inventory.description", hdh.a("inventory"));
   private final hdh d;
   @Nullable
   private fna e;
   private int f;

   public hdf(hdh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdj.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fna(fna.a.d, b, c, false);
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
      this.d.a(hdj.e);
   }
}
