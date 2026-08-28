import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class geh extends ful {
   private static final alk a = alk.b("recipe_book/slot_many_craftable");
   private static final alk b = alk.b("recipe_book/slot_craftable");
   private static final alk c = alk.b("recipe_book/slot_many_uncraftable");
   private static final alk d = alk.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xc m = xc.c("gui.recipebook.moreRecipes");
   private gei n = gei.a;
   private List<geh.a> o = List.of();
   private boolean p;
   private final gel q;
   private float r;

   public geh(gel $$0) {
      super(0, 0, 25, 25, xb.a);
      this.q = $$0;
   }

   public void a(gei $$0, boolean $$1, gef $$2, bbd $$3) {
      this.n = $$0;
      List<dfy> $$4 = $$0.a($$1 ? gei.a.b : gei.a.a);
      this.o = $$4.stream().map($$1x -> new geh.a($$1x.a(), $$1x.a($$3))).toList();
      this.p = a(this.o);
      List<dfz> $$5 = $$4.stream().map(dfy::a).filter($$2.d()::b).toList();
      if (!$$5.isEmpty()) {
         $$5.forEach($$2::a);
         this.r = 15.0F;
      }
   }

   private static boolean a(List<geh.a> $$0) {
      Iterator<daa> $$1 = $$0.stream().flatMap($$0x -> $$0x.b().stream()).iterator();
      if (!$$1.hasNext()) {
         return true;
      } else {
         daa $$2 = $$1.next();

         while ($$1.hasNext()) {
            daa $$3 = $$1.next();
            if (!daa.c($$2, $$3)) {
               return false;
            }
         }

         return true;
      }
   }

   public gei a() {
      return this.n;
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      alk $$4;
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

      $$0.a(gsn::H, $$4, this.F(), this.G(), this.g, this.h);
      daa $$10 = this.e();
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

   public dfz c() {
      int $$0 = this.q.currentIndex() % this.o.size();
      return this.o.get($$0).a;
   }

   public daa e() {
      int $$0 = this.q.currentIndex();
      int $$1 = this.o.size();
      int $$2 = $$0 / $$1;
      int $$3 = $$0 - $$1 * $$2;
      return this.o.get($$3).a($$2);
   }

   public List<xc> a(daa $$0) {
      List<xc> $$1 = new ArrayList<>(gaf.a(frf.Q(), $$0));
      if (this.g()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(fyk $$0) {
      $$0.a(fyj.a, xc.a("narration.recipe", this.e().y()));
      if (this.g()) {
         $$0.a(fyj.d, xc.c("narration.button.usage.hovered"), xc.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fyj.d, xc.c("narration.button.usage.hovered"));
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

   static record a(dfz a, List<daa> b) {

      public daa a(int $$0) {
         if (this.b.isEmpty()) {
            return daa.k;
         } else {
            int $$1 = $$0 % this.b.size();
            return this.b.get($$1);
         }
      }
   }
}
