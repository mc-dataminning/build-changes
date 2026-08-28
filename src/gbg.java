import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gbg implements fst, ftn {
   private static final ale b = ale.b("recipe_book/overlay_recipe");
   private static final int c = 4;
   private static final int d = 5;
   private static final float e = 0.375F;
   public static final int a = 25;
   private final List<gbg.b> f = Lists.newArrayList();
   private boolean g;
   private int h;
   private int i;
   private gbl j = gbl.a;
   @Nullable
   private der k;
   final gbo l;
   private final boolean m;

   public gbg(gbo $$0, boolean $$1) {
      this.l = $$0;
      this.m = $$1;
   }

   public void a(gbl $$0, bax $$1, boolean $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      this.j = $$0;
      List<deq> $$8 = $$0.a(gbl.a.b);
      List<deq> $$9 = $$2 ? Collections.emptyList() : $$0.a(gbl.a.c);
      int $$10 = $$8.size();
      int $$11 = $$10 + $$9.size();
      int $$12 = $$11 <= 16 ? 4 : 5;
      int $$13 = (int)Math.ceil((double)((float)$$11 / (float)$$12));
      this.h = $$3;
      this.i = $$4;
      float $$14 = (float)(this.h + Math.min($$11, $$12) * 25);
      float $$15 = (float)($$5 + 50);
      if ($$14 > $$15) {
         this.h = (int)((float)this.h - $$7 * (float)((int)(($$14 - $$15) / $$7)));
      }

      float $$16 = (float)(this.i + $$13 * 25);
      float $$17 = (float)($$6 + 50);
      if ($$16 > $$17) {
         this.i = (int)((float)this.i - $$7 * (float)azk.f(($$16 - $$17) / $$7));
      }

      float $$18 = (float)this.i;
      float $$19 = (float)($$6 - 100);
      if ($$18 < $$19) {
         this.i = (int)((float)this.i - $$7 * (float)azk.f(($$18 - $$19) / $$7));
      }

      this.g = true;
      this.f.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         deq $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.h + 4 + 25 * ($$20 % $$12);
         int $$24 = this.i + 5 + 25 * ($$20 / $$12);
         if (this.m) {
            this.f.add(new gbg.c($$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
         } else {
            this.f.add(new gbg.a($$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
         }
      }

      this.k = null;
   }

   public gbl a() {
      return this.j;
   }

   @Nullable
   public der b() {
      return this.k;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (gbg.b $$3 : this.f) {
            if ($$3.a($$0, $$1, $$2)) {
               this.k = $$3.b;
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      if (this.g) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.f.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.f.size(), $$4);
         int $$6 = azk.f((float)this.f.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(gpn::H, b, this.h, this.i, $$5 * 25 + 8, $$6 * 25 + 8);

         for (gbg.b $$8 : this.f) {
            $$8.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
      }
   }

   public void b(boolean $$0) {
      this.g = $$0;
   }

   public boolean c() {
      return this.g;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aI_() {
      return false;
   }

   class a extends gbg.b {
      private static final ale b = ale.b("recipe_book/crafting_overlay");
      private static final ale c = ale.b("recipe_book/crafting_overlay_highlighted");
      private static final ale d = ale.b("recipe_book/crafting_overlay_disabled");
      private static final ale e = ale.b("recipe_book/crafting_overlay_disabled_highlighted");
      private static final int f = 3;
      private static final int m = 3;

      public a(final int $$0, final int $$1, final der $$2, final dep $$3, final bax $$4, final boolean $$5) {
         super($$0, $$1, $$2, $$5, a($$3, $$4));
      }

      private static List<gbg.b.a> a(dep $$0, bax $$1) {
         List<gbg.b.a> $$2 = new ArrayList<>();
         Objects.requireNonNull($$0);
         switch ($$0) {
            case det $$3:
               akp.a(3, 3, $$3.b(), $$3.c(), $$3.f(), ($$2x, $$3x, $$4x, $$5x) -> {
                  List<cys> $$6x = $$2x.a($$1);
                  if (!$$6x.isEmpty()) {
                     $$2.add(a($$4x, $$5x, $$6x));
                  }
               });
               break;
            case deu $$4:
               label19: {
                  List<dev> $$5 = $$4.b();

                  for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
                     List<cys> $$7 = $$5.get($$6).a($$1);
                     if (!$$7.isEmpty()) {
                        $$2.add(a($$6 % 3, $$6 / 3, $$7));
                     }
                  }
                  break label19;
               }
         }

         return $$2;
      }

      @Override
      protected ale b(boolean $$0) {
         if ($$0) {
            return this.D() ? c : b;
         } else {
            return this.D() ? e : d;
         }
      }
   }

   abstract class b extends fro {
      final der b;
      private final boolean c;
      private final List<gbg.b.a> d;

      public b(final int $$0, final int $$1, final der $$2, final boolean $$3, final List<gbg.b.a> $$4) {
         super($$0, $$1, 24, 24, wv.a);
         this.d = $$4;
         this.b = $$2;
         this.c = $$3;
      }

      protected static gbg.b.a a(int $$0, int $$1, List<cys> $$2) {
         return new gbg.b.a(3 + $$0 * 7, 3 + $$1 * 7, $$2);
      }

      protected abstract ale b(boolean var1);

      @Override
      public void a(fvn $$0) {
         this.c($$0);
      }

      @Override
      public void b(frc $$0, int $$1, int $$2, float $$3) {
         $$0.a(gpn::H, this.b(this.c), this.F(), this.G(), this.g, this.h);
         float $$4 = (float)(this.F() + 2);
         float $$5 = (float)(this.G() + 2);
         float $$6 = 150.0F;

         for (gbg.b.a $$7 : this.d) {
            $$0.c().a();
            $$0.c().a($$4 + (float)$$7.a, $$5 + (float)$$7.b, 150.0F);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0F, -8.0F, 0.0F);
            $$0.a($$7.a(gbg.this.l.currentIndex()), 0, 0);
            $$0.c().b();
         }
      }

      protected static record a(int a, int b, List<cys> c) {

         public a(int a, int b, List<cys> c) {
            if (c.isEmpty()) {
               throw new IllegalArgumentException("Ingredient list must be non-empty");
            } else {
               this.a = a;
               this.b = b;
               this.c = c;
            }
         }

         public cys a(int $$0) {
            return this.c.get($$0 % this.c.size());
         }
      }
   }

   class c extends gbg.b {
      private static final ale b = ale.b("recipe_book/furnace_overlay");
      private static final ale c = ale.b("recipe_book/furnace_overlay_highlighted");
      private static final ale d = ale.b("recipe_book/furnace_overlay_disabled");
      private static final ale e = ale.b("recipe_book/furnace_overlay_disabled_highlighted");

      public c(final int $$0, final int $$1, final der $$2, final dep $$3, final bax $$4, final boolean $$5) {
         super($$0, $$1, $$2, $$5, a($$3, $$4));
      }

      private static List<gbg.b.a> a(dep $$0, bax $$1) {
         if ($$0 instanceof deo $$2) {
            List<cys> $$3 = $$2.b().a($$1);
            if (!$$3.isEmpty()) {
               return List.of(a(1, 1, $$3));
            }
         }

         return List.of();
      }

      @Override
      protected ale b(boolean $$0) {
         if ($$0) {
            return this.D() ? c : b;
         } else {
            return this.D() ? e : d;
         }
      }
   }
}
