import com.google.common.collect.Lists;
import java.util.List;

public class fur extends fkx {
   private static final alh a = alh.b("recipe_book/slot_many_craftable");
   private static final alh b = alh.b("recipe_book/slot_craftable");
   private static final alh c = alh.b("recipe_book/slot_many_uncraftable");
   private static final alh d = alh.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xh m = xh.c("gui.recipebook.moreRecipes");
   private fus n;
   private List<dal<?>> o = List.of();
   private final fuv p;
   private float q;

   public fur(fuv $$0) {
      super(0, 0, 25, 25, xg.a);
      this.p = $$0;
   }

   public void a(fus $$0, boolean $$1, fup $$2) {
      this.n = $$0;
      this.o = $$0.a($$1 ? fus.a.b : fus.a.a);

      for (dal<?> $$3 : this.o) {
         if ($$2.d().d($$3)) {
            $$2.a(this.o);
            this.q = 15.0F;
            break;
         }
      }
   }

   public fus a() {
      return this.n;
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      alh $$4;
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

      $$0.a(gig::B, $$4, this.D(), this.E(), this.g, this.h);
      cvx $$10 = this.e();
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

   public dal<?> c() {
      int $$0 = this.p.currentIndex() % this.o.size();
      return this.o.get($$0);
   }

   public cvx e() {
      return this.c().b().a(this.n.a());
   }

   public List<xh> f() {
      List<xh> $$0 = Lists.newArrayList(fqs.a(fja.Q(), this.e()));
      if (this.h()) {
         $$0.add(m);
      }

      return $$0;
   }

   @Override
   public void a(fox $$0) {
      cvx $$1 = this.e();
      $$0.a(fow.a, xh.a("narration.recipe", $$1.y()));
      if (this.h()) {
         $$0.a(fow.d, xh.c("narration.button.usage.hovered"), xh.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fow.d, xh.c("narration.button.usage.hovered"));
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
