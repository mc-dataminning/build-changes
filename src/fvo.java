import com.google.common.collect.Lists;
import java.util.List;

public class fvo extends flu {
   private static final all a = all.b("recipe_book/slot_many_craftable");
   private static final all b = all.b("recipe_book/slot_craftable");
   private static final all c = all.b("recipe_book/slot_many_uncraftable");
   private static final all d = all.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xl m = xl.c("gui.recipebook.moreRecipes");
   private fvp n;
   private List<dav<?>> o = List.of();
   private final fvs p;
   private float q;

   public fvo(fvs $$0) {
      super(0, 0, 25, 25, xk.a);
      this.p = $$0;
   }

   public void a(fvp $$0, boolean $$1, fvm $$2) {
      this.n = $$0;
      this.o = $$0.a($$1 ? fvp.a.b : fvp.a.a);

      for (dav<?> $$3 : this.o) {
         if ($$2.d().d($$3)) {
            $$2.a(this.o);
            this.q = 15.0F;
            break;
         }
      }
   }

   public fvp a() {
      return this.n;
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      all $$4;
      if (this.n.c()) {
         if (this.h()) {
            $$4 = a;
         } else {
            $$4 = b;
         }
      } else if (this.h()) {
         $$4 = c;
      } else {
         $$4 = d;
      }

      boolean $$8 = this.q > 0.0F;
      if ($$8) {
         float $$9 = 1.0F + 0.1F * (float)Math.sin((double)(this.q / 15.0F * (float) Math.PI));
         $$0.c().a();
         $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         this.q -= $$3;
      }

      $$0.a(gjh::B, $$4, this.D(), this.E(), this.g, this.h);
      cwf $$10 = this.e();
      int $$11 = 4;
      if (this.n.f() && this.h()) {
         $$0.a($$10, this.D() + $$11 + 1, this.E() + $$11 + 1, 0, 10);
         $$11--;
      }

      $$0.b($$10, this.D() + $$11, this.E() + $$11);
      if ($$8) {
         $$0.c().b();
      }
   }

   private boolean h() {
      return this.o.size() > 1;
   }

   public boolean b() {
      return this.o.size() == 1;
   }

   public dav<?> c() {
      int $$0 = this.p.currentIndex() % this.o.size();
      return this.o.get($$0);
   }

   public cwf e() {
      return this.c().b().a(this.n.a());
   }

   public List<xl> f() {
      List<xl> $$0 = Lists.newArrayList(frp.a(fjx.Q(), this.e()));
      if (this.h()) {
         $$0.add(m);
      }

      return $$0;
   }

   @Override
   public void a(fpu $$0) {
      cwf $$1 = this.e();
      $$0.a(fpt.a, xl.a("narration.recipe", $$1.y()));
      if (this.h()) {
         $$0.a(fpt.d, xl.c("narration.button.usage.hovered"), xl.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fpt.d, xl.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int y() {
      return 25;
   }

   @Override
   protected boolean j(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }
}
