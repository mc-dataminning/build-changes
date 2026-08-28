import java.util.List;

public class fxw extends fpl {
   private static final fps c = new fps(alz.b("recipe_book/tab"), alz.b("recipe_book/tab_selected"));
   private final fxu.a d;
   private static final float e = 15.0F;
   private float f;

   public fxw(fxu.a $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(flq $$0, boolean $$1) {
      fxy.a $$2 = $$1 ? fxy.a.b : fxy.a.a;

      for (fxy $$4 : $$0.a(this.d.c())) {
         for (ddj $$5 : $$4.a($$2)) {
            if ($$0.b($$5.a())) {
               this.f = 15.0F;
               return;
            }
         }
      }
   }

   @Override
   public void b(fnr $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         }

         alz $$5 = this.a.a(true, this.b);
         int $$6 = this.D();
         if (this.b) {
            $$6 -= 2;
         }

         $$0.a(glu::C, $$5, $$6, this.E(), this.g, this.h);
         this.a($$0);
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fnr $$0) {
      int $$1 = this.b ? -2 : 0;
      if (this.d.b().isPresent()) {
         $$0.b(this.d.a(), this.D() + 3 + $$1, this.E() + 5);
         $$0.b(this.d.b().get(), this.D() + 14 + $$1, this.E() + 5);
      } else {
         $$0.b(this.d.a(), this.D() + 9 + $$1, this.E() + 5);
      }
   }

   public dbv b() {
      return this.d.c();
   }

   public boolean a(flq $$0) {
      List<fxy> $$1 = $$0.a(this.d.c());
      this.k = false;

      for (fxy $$2 : $$1) {
         if ($$2.b()) {
            this.k = true;
            break;
         }
      }

      return this.k;
   }
}
