import java.util.ArrayList;
import java.util.List;

public class fyk extends fop {
   private static final aku a = aku.b("recipe_book/slot_many_craftable");
   private static final aku b = aku.b("recipe_book/slot_craftable");
   private static final aku c = aku.b("recipe_book/slot_many_uncraftable");
   private static final aku d = aku.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final wo m = wo.c("gui.recipebook.moreRecipes");
   private fyl n;
   private List<fyk.a> o = List.of();
   private final fyo p;
   private float q;

   public fyk(fyo $$0) {
      super(0, 0, 25, 25, wn.a);
      this.p = $$0;
   }

   public void a(fyl $$0, boolean $$1, fyi $$2, bak $$3) {
      this.n = $$0;
      List<dck> $$4 = $$0.a($$1 ? fyl.a.b : fyl.a.a);
      this.o = $$4.stream().map($$1x -> new fyk.a($$1x.a(), $$1x.a($$3))).toList();
      List<dcl> $$5 = $$4.stream().map(dck::a).filter($$2.d()::b).toList();
      if (!$$5.isEmpty()) {
         $$5.forEach($$2::a);
         this.q = 15.0F;
      }
   }

   public fyl a() {
      return this.n;
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      aku $$4;
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
         $$0.c().a((float)(this.F() + 8), (float)(this.G() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.F() + 8)), (float)(-(this.G() + 12)), 0.0F);
         this.q -= $$3;
      }

      $$0.a(gmh::H, $$4, this.F(), this.G(), this.g, this.h);
      cwp $$10 = this.e();
      int $$11 = 4;
      if (this.n.d() && this.g()) {
         $$0.a($$10, this.F() + $$11 + 1, this.G() + $$11 + 1, 0, 10);
         $$11--;
      }

      $$0.b($$10, this.F() + $$11, this.G() + $$11);
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

   public dcl c() {
      int $$0 = this.p.currentIndex() % this.o.size();
      return this.o.get($$0).a;
   }

   public cwp e() {
      int $$0 = this.p.currentIndex();
      int $$1 = this.o.size();
      int $$2 = $$0 / $$1;
      int $$3 = $$0 - $$1 * $$2;
      return this.o.get($$3).a($$2);
   }

   public List<wo> a(cwp $$0) {
      List<wo> $$1 = new ArrayList<>(fuk.a(flj.Q(), $$0));
      if (this.g()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(fsp $$0) {
      $$0.a(fso.a, wo.a("narration.recipe", this.e().y()));
      if (this.g()) {
         $$0.a(fso.d, wo.c("narration.button.usage.hovered"), wo.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fso.d, wo.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int A() {
      return 25;
   }

   @Override
   protected boolean g(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   static record a(dcl a, List<cwp> b) {

      public cwp a(int $$0) {
         if (this.b.isEmpty()) {
            return cwp.j;
         } else {
            int $$1 = $$0 % this.b.size();
            return this.b.get($$1);
         }
      }
   }
}
