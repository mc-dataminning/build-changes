import java.util.ArrayList;
import java.util.List;

public class fxy extends fod {
   private static final alz a = alz.b("recipe_book/slot_many_craftable");
   private static final alz b = alz.b("recipe_book/slot_craftable");
   private static final alz c = alz.b("recipe_book/slot_many_uncraftable");
   private static final alz d = alz.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xv m = xv.c("gui.recipebook.moreRecipes");
   private fxz n;
   private List<fxy.a> o = List.of();
   private final fyc p;
   private float q;

   public fxy(fyc $$0) {
      super(0, 0, 25, 25, xu.a);
      this.p = $$0;
   }

   public void a(fxz $$0, boolean $$1, fxw $$2, bbp $$3) {
      this.n = $$0;
      List<ddk> $$4 = $$0.a($$1 ? fxz.a.b : fxz.a.a);
      this.o = $$4.stream().map($$1x -> new fxy.a($$1x.a(), $$1x.a($$3))).toList();
      List<ddl> $$5 = $$4.stream().map(ddk::a).filter($$2.d()::b).toList();
      if (!$$5.isEmpty()) {
         $$5.forEach($$2::a);
         this.q = 15.0F;
      }
   }

   public fxz a() {
      return this.n;
   }

   @Override
   public void b(fns $$0, int $$1, int $$2, float $$3) {
      alz $$4;
      if (this.n.a()) {
         if (this.g()) {
            $$4 = a;
         } else {
            $$4 = b;
         }
      } else if (this.g()) {
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

      $$0.a(glv::C, $$4, this.D(), this.E(), this.g, this.h);
      cxp $$10 = this.e();
      int $$11 = 4;
      if (this.n.d() && this.g()) {
         $$0.a($$10, this.D() + $$11 + 1, this.E() + $$11 + 1, 0, 10);
         $$11--;
      }

      $$0.b($$10, this.D() + $$11, this.E() + $$11);
      if ($$8) {
         $$0.c().b();
      }
   }

   private boolean g() {
      return this.o.size() > 1;
   }

   public boolean b() {
      return this.o.size() == 1;
   }

   public ddl c() {
      int $$0 = this.p.currentIndex() % this.o.size();
      return this.o.get($$0).a;
   }

   public cxp e() {
      int $$0 = this.p.currentIndex();
      int $$1 = this.o.size();
      int $$2 = $$0 / $$1;
      int $$3 = $$0 - $$1 * $$2;
      return this.o.get($$3).a($$2);
   }

   public List<xv> a(cxp $$0) {
      List<xv> $$1 = new ArrayList<>(fty.a(fmg.Q(), $$0));
      if (this.g()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(fsd $$0) {
      $$0.a(fsc.a, xv.a("narration.recipe", this.e().y()));
      if (this.g()) {
         $$0.a(fsc.d, xv.c("narration.button.usage.hovered"), xv.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fsc.d, xv.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int y() {
      return 25;
   }

   @Override
   protected boolean h(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   static record a(ddl a, List<cxp> b) {

      public cxp a(int $$0) {
         if (this.b.isEmpty()) {
            return cxp.j;
         } else {
            int $$1 = $$0 % this.b.size();
            return this.b.get($$1);
         }
      }
   }
}
