import com.google.common.collect.Lists;
import java.util.List;

public class fuz extends flf {
   private static final ali a = ali.b("recipe_book/slot_many_craftable");
   private static final ali b = ali.b("recipe_book/slot_craftable");
   private static final ali c = ali.b("recipe_book/slot_many_uncraftable");
   private static final ali d = ali.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xi m = xi.c("gui.recipebook.moreRecipes");
   private fva n;
   private List<dar<?>> o = List.of();
   private final fvd p;
   private float q;

   public fuz(fvd $$0) {
      super(0, 0, 25, 25, xh.a);
      this.p = $$0;
   }

   public void a(fva $$0, boolean $$1, fux $$2) {
      this.n = $$0;
      this.o = $$0.a($$1 ? fva.a.b : fva.a.a);

      for (dar<?> $$3 : this.o) {
         if ($$2.d().d($$3)) {
            $$2.a(this.o);
            this.q = 15.0F;
            break;
         }
      }
   }

   public fva a() {
      return this.n;
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      ali $$4;
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

      $$0.a(gir::B, $$4, this.D(), this.E(), this.g, this.h);
      cwb $$10 = this.e();
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

   public dar<?> c() {
      int $$0 = this.p.currentIndex() % this.o.size();
      return this.o.get($$0);
   }

   public cwb e() {
      return this.c().b().a(this.n.a());
   }

   public List<xi> f() {
      List<xi> $$0 = Lists.newArrayList(fra.a(fji.Q(), this.e()));
      if (this.h()) {
         $$0.add(m);
      }

      return $$0;
   }

   @Override
   public void a(fpf $$0) {
      cwb $$1 = this.e();
      $$0.a(fpe.a, xi.a("narration.recipe", $$1.y()));
      if (this.h()) {
         $$0.a(fpe.d, xi.c("narration.button.usage.hovered"), xi.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fpe.d, xi.c("narration.button.usage.hovered"));
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
