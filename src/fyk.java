import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fyk extends fop {
   private static final akv a = akv.b("recipe_book/slot_many_craftable");
   private static final akv b = akv.b("recipe_book/slot_craftable");
   private static final akv c = akv.b("recipe_book/slot_many_uncraftable");
   private static final akv d = akv.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final wp m = wp.c("gui.recipebook.moreRecipes");
   private fyl n = fyl.a;
   private List<fyk.a> o = List.of();
   private boolean p;
   private final fyo q;
   private float r;

   public fyk(fyo $$0) {
      super(0, 0, 25, 25, wo.a);
      this.q = $$0;
   }

   public void a(fyl $$0, boolean $$1, fyi $$2, bak $$3) {
      this.n = $$0;
      List<dcj> $$4 = $$0.a($$1 ? fyl.a.b : fyl.a.a);
      this.o = $$4.stream().map($$1x -> new fyk.a($$1x.a(), $$1x.a($$3))).toList();
      this.p = a(this.o);
      List<dck> $$5 = $$4.stream().map(dcj::a).filter($$2.d()::b).toList();
      if (!$$5.isEmpty()) {
         $$5.forEach($$2::a);
         this.r = 15.0F;
      }
   }

   private static boolean a(List<fyk.a> $$0) {
      Iterator<cwo> $$1 = $$0.stream().flatMap($$0x -> $$0x.b().stream()).iterator();
      if (!$$1.hasNext()) {
         return true;
      } else {
         cwo $$2 = $$1.next();

         while ($$1.hasNext()) {
            cwo $$3 = $$1.next();
            if (!cwo.c($$2, $$3)) {
               return false;
            }
         }

         return true;
      }
   }

   public fyl a() {
      return this.n;
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      akv $$4;
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

      boolean $$8 = this.r > 0.0F;
      if ($$8) {
         float $$9 = 1.0F + 0.1F * (float)Math.sin((double)(this.r / 15.0F * (float) Math.PI));
         $$0.c().a();
         $$0.c().a((float)(this.F() + 8), (float)(this.G() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.F() + 8)), (float)(-(this.G() + 12)), 0.0F);
         this.r -= $$3;
      }

      $$0.a(gmh::H, $$4, this.F(), this.G(), this.g, this.h);
      cwo $$10 = this.e();
      int $$11 = 4;
      if (this.g() && this.p) {
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

   public dck c() {
      int $$0 = this.q.currentIndex() % this.o.size();
      return this.o.get($$0).a;
   }

   public cwo e() {
      int $$0 = this.q.currentIndex();
      int $$1 = this.o.size();
      int $$2 = $$0 / $$1;
      int $$3 = $$0 - $$1 * $$2;
      return this.o.get($$3).a($$2);
   }

   public List<wp> a(cwo $$0) {
      List<wp> $$1 = new ArrayList<>(fuk.a(fli.Q(), $$0));
      if (this.g()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(fsp $$0) {
      $$0.a(fso.a, wp.a("narration.recipe", this.e().y()));
      if (this.g()) {
         $$0.a(fso.d, wp.c("narration.button.usage.hovered"), wp.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fso.d, wp.c("narration.button.usage.hovered"));
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

   static record a(dck a, List<cwo> b) {

      public cwo a(int $$0) {
         if (this.b.isEmpty()) {
            return cwo.j;
         } else {
            int $$1 = $$0 % this.b.size();
            return this.b.get($$1);
         }
      }
   }
}
