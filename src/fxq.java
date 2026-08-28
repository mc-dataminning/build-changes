import java.util.List;

public class fxq extends fpf {
   private static final fpm c = new fpm(alp.b("recipe_book/tab"), alp.b("recipe_book/tab_selected"));
   private final fxo.a d;
   private static final float e = 15.0F;
   private float f;

   public fxq(fxo.a $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(flk $$0, boolean $$1) {
      fxs.a $$2 = $$1 ? fxs.a.b : fxs.a.a;

      for (fxs $$4 : $$0.a(this.d.c())) {
         for (ddb $$5 : $$4.a($$2)) {
            if ($$0.b($$5.a())) {
               this.f = 15.0F;
               return;
            }
         }
      }
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         }

         alp $$5 = this.a.a(true, this.b);
         int $$6 = this.D();
         if (this.b) {
            $$6 -= 2;
         }

         $$0.a(glq::H, $$5, $$6, this.E(), this.g, this.h);
         this.a($$0);
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fnl $$0) {
      int $$1 = this.b ? -2 : 0;
      if (this.d.b().isPresent()) {
         $$0.b(this.d.a(), this.D() + 3 + $$1, this.E() + 5);
         $$0.b(this.d.b().get(), this.D() + 14 + $$1, this.E() + 5);
      } else {
         $$0.b(this.d.a(), this.D() + 9 + $$1, this.E() + 5);
      }
   }

   public dbn b() {
      return this.d.c();
   }

   public boolean a(flk $$0) {
      List<fxs> $$1 = $$0.a(this.d.c());
      this.k = false;

      for (fxs $$2 : $$1) {
         if ($$2.b()) {
            this.k = true;
            break;
         }
      }

      return this.k;
   }
}
