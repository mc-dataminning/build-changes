import java.util.List;

public class gct extends fug {
   private static final fun c = new fun(alg.b("recipe_book/tab"), alg.b("recipe_book/tab_selected"));
   private final gcr.a d;
   private static final float e = 15.0F;
   private float f;

   public gct(gcr.a $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(fpe $$0, boolean $$1) {
      gcv.a $$2 = $$1 ? gcv.a.b : gcv.a.a;

      for (gcv $$4 : $$0.a(this.d.c())) {
         for (dfl $$5 : $$4.a($$2)) {
            if ($$0.b($$5.a())) {
               this.f = 15.0F;
               return;
            }
         }
      }
   }

   @Override
   public void b(fsm $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.F() + 8), (float)(this.G() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.F() + 8)), (float)(-(this.G() + 12)), 0.0F);
         }

         alg $$5 = this.a.a(true, this.b);
         int $$6 = this.F();
         if (this.b) {
            $$6 -= 2;
         }

         $$0.a(grc::H, $$5, $$6, this.G(), this.g, this.h);
         this.a($$0);
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fsm $$0) {
      int $$1 = this.b ? -2 : 0;
      if (this.d.b().isPresent()) {
         $$0.b(this.d.a(), this.F() + 3 + $$1, this.G() + 5);
         $$0.b(this.d.b().get(), this.F() + 14 + $$1, this.G() + 5);
      } else {
         $$0.b(this.d.a(), this.F() + 9 + $$1, this.G() + 5);
      }
   }

   public ddw b() {
      return this.d.c();
   }

   public boolean a(fpe $$0) {
      List<gcv> $$1 = $$0.a(this.d.c());
      this.k = false;

      for (gcv $$2 : $$1) {
         if ($$2.b()) {
            this.k = true;
            break;
         }
      }

      return this.k;
   }
}
