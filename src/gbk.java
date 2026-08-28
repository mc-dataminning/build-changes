import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gbk extends fro {
   private static final ale a = ale.b("recipe_book/slot_many_craftable");
   private static final ale b = ale.b("recipe_book/slot_craftable");
   private static final ale c = ale.b("recipe_book/slot_many_uncraftable");
   private static final ale d = ale.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final ww m = ww.c("gui.recipebook.moreRecipes");
   private gbl n = gbl.a;
   private List<gbk.a> o = List.of();
   private boolean p;
   private final gbo q;
   private float r;

   public gbk(gbo $$0) {
      super(0, 0, 25, 25, wv.a);
      this.q = $$0;
   }

   public void a(gbl $$0, boolean $$1, gbi $$2, bax $$3) {
      this.n = $$0;
      List<deq> $$4 = $$0.a($$1 ? gbl.a.b : gbl.a.a);
      this.o = $$4.stream().map($$1x -> new gbk.a($$1x.a(), $$1x.a($$3))).toList();
      this.p = a(this.o);
      List<der> $$5 = $$4.stream().map(deq::a).filter($$2.d()::b).toList();
      if (!$$5.isEmpty()) {
         $$5.forEach($$2::a);
         this.r = 15.0F;
      }
   }

   private static boolean a(List<gbk.a> $$0) {
      Iterator<cys> $$1 = $$0.stream().flatMap($$0x -> $$0x.b().stream()).iterator();
      if (!$$1.hasNext()) {
         return true;
      } else {
         cys $$2 = $$1.next();

         while ($$1.hasNext()) {
            cys $$3 = $$1.next();
            if (!cys.c($$2, $$3)) {
               return false;
            }
         }

         return true;
      }
   }

   public gbl a() {
      return this.n;
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      ale $$4;
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

      $$0.a(gpn::H, $$4, this.F(), this.G(), this.g, this.h);
      cys $$10 = this.e();
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

   public der c() {
      int $$0 = this.q.currentIndex() % this.o.size();
      return this.o.get($$0).a;
   }

   public cys e() {
      int $$0 = this.q.currentIndex();
      int $$1 = this.o.size();
      int $$2 = $$0 / $$1;
      int $$3 = $$0 - $$1 * $$2;
      return this.o.get($$3).a($$2);
   }

   public List<ww> a(cys $$0) {
      List<ww> $$1 = new ArrayList<>(fxi.a(fof.Q(), $$0));
      if (this.g()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(fvn $$0) {
      $$0.a(fvm.a, ww.a("narration.recipe", this.e().y()));
      if (this.g()) {
         $$0.a(fvm.d, ww.c("narration.button.usage.hovered"), ww.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fvm.d, ww.c("narration.button.usage.hovered"));
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

   static record a(der a, List<cys> b) {

      public cys a(int $$0) {
         if (this.b.isEmpty()) {
            return cys.k;
         } else {
            int $$1 = $$0 % this.b.size();
            return this.b.get($$1);
         }
      }
   }
}
