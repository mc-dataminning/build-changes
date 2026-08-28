import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fxt implements fpi, fqc {
   private static final alz b = alz.b("recipe_book/overlay_recipe");
   private static final int c = 4;
   private static final int d = 5;
   private static final float e = 0.375F;
   public static final int a = 25;
   private final List<fxt.b> f = Lists.newArrayList();
   private boolean g;
   private int h;
   private int i;
   private fxy j;
   @Nullable
   private ddk k;
   final fyb l;
   private final boolean m;

   public fxt(fyb $$0, boolean $$1) {
      this.l = $$0;
      this.m = $$1;
   }

   public void a(fxy $$0, bbp $$1, boolean $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      this.j = $$0;
      List<ddj> $$8 = $$0.a(fxy.a.b);
      List<ddj> $$9 = $$2 ? Collections.emptyList() : $$0.a(fxy.a.c);
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
         this.i = (int)((float)this.i - $$7 * (float)bae.f(($$16 - $$17) / $$7));
      }

      float $$18 = (float)this.i;
      float $$19 = (float)($$6 - 100);
      if ($$18 < $$19) {
         this.i = (int)((float)this.i - $$7 * (float)bae.f(($$18 - $$19) / $$7));
      }

      this.g = true;
      this.f.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         ddj $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.h + 4 + 25 * ($$20 % $$12);
         int $$24 = this.i + 5 + 25 * ($$20 / $$12);
         if (this.m) {
            this.f.add(new fxt.c($$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
         } else {
            this.f.add(new fxt.a($$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
         }
      }

      this.k = null;
   }

   public fxy a() {
      return this.j;
   }

   @Nullable
   public ddk b() {
      return this.k;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (fxt.b $$3 : this.f) {
            if ($$3.a($$0, $$1, $$2)) {
               this.k = $$3.b;
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      if (this.g) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.f.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.f.size(), $$4);
         int $$6 = bae.f((float)this.f.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(glu::C, b, this.h, this.i, $$5 * 25 + 8, $$6 * 25 + 8);

         for (fxt.b $$8 : this.f) {
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
   public boolean aN_() {
      return false;
   }

   class a extends fxt.b {
      private static final alz b = alz.b("recipe_book/crafting_overlay");
      private static final alz c = alz.b("recipe_book/crafting_overlay_highlighted");
      private static final alz d = alz.b("recipe_book/crafting_overlay_disabled");
      private static final alz e = alz.b("recipe_book/crafting_overlay_disabled_highlighted");
      private static final int f = 3;
      private static final int m = 3;

      public a(final int $$0, final int $$1, final ddk $$2, final ddi $$3, final bbp $$4, final boolean $$5) {
         super($$0, $$1, $$2, $$5, a($$3, $$4));
      }

      private static List<fxt.b.a> a(ddi $$0, bbp $$1) {
         List<fxt.b.a> $$2 = new ArrayList<>();
         Objects.requireNonNull($$0);
         switch ($$0) {
            case ddm $$3:
               alk.a(3, 3, $$3.b(), $$3.c(), $$3.f(), ($$2x, $$3x, $$4x, $$5x) -> {
                  List<cxo> $$6x = $$2x.a($$1);
                  if (!$$6x.isEmpty()) {
                     $$2.add(a($$4x, $$5x, $$6x));
                  }
               });
               break;
            case ddn $$4:
               label19: {
                  List<ddo> $$5 = $$4.b();

                  for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
                     List<cxo> $$7 = $$5.get($$6).a($$1);
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
      protected alz b(boolean $$0) {
         if ($$0) {
            return this.B() ? c : b;
         } else {
            return this.B() ? e : d;
         }
      }
   }

   abstract class b extends foc {
      final ddk b;
      private final boolean c;
      private final List<fxt.b.a> d;

      public b(final int $$0, final int $$1, final ddk $$2, final boolean $$3, final List<fxt.b.a> $$4) {
         super($$0, $$1, 24, 24, xu.a);
         this.d = $$4;
         this.b = $$2;
         this.c = $$3;
      }

      protected static fxt.b.a a(int $$0, int $$1, List<cxo> $$2) {
         return new fxt.b.a(3 + $$0 * 7, 3 + $$1 * 7, $$2);
      }

      protected abstract alz b(boolean var1);

      @Override
      public void a(fsc $$0) {
         this.c($$0);
      }

      @Override
      public void b(fnr $$0, int $$1, int $$2, float $$3) {
         $$0.a(glu::C, this.b(this.c), this.D(), this.E(), this.g, this.h);
         float $$4 = (float)(this.D() + 2);
         float $$5 = (float)(this.E() + 2);
         float $$6 = 150.0F;

         for (fxt.b.a $$7 : this.d) {
            $$0.c().a();
            $$0.c().a($$4 + (float)$$7.a, $$5 + (float)$$7.b, 150.0F);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0F, -8.0F, 0.0F);
            $$0.a($$7.a(fxt.this.l.currentIndex()), 0, 0);
            $$0.c().b();
         }
      }

      protected static record a(int a, int b, List<cxo> c) {

         public a(int a, int b, List<cxo> c) {
            if (c.isEmpty()) {
               throw new IllegalArgumentException("Ingredient list must be non-empty");
            } else {
               this.a = a;
               this.b = b;
               this.c = c;
            }
         }

         public cxo a(int $$0) {
            return this.c.get($$0 % this.c.size());
         }
      }
   }

   class c extends fxt.b {
      private static final alz b = alz.b("recipe_book/furnace_overlay");
      private static final alz c = alz.b("recipe_book/furnace_overlay_highlighted");
      private static final alz d = alz.b("recipe_book/furnace_overlay_disabled");
      private static final alz e = alz.b("recipe_book/furnace_overlay_disabled_highlighted");

      public c(final int $$0, final int $$1, final ddk $$2, final ddi $$3, final bbp $$4, final boolean $$5) {
         super($$0, $$1, $$2, $$5, a($$3, $$4));
      }

      private static List<fxt.b.a> a(ddi $$0, bbp $$1) {
         if ($$0 instanceof ddh $$2) {
            List<cxo> $$3 = $$2.b().a($$1);
            if (!$$3.isEmpty()) {
               return List.of(a(1, 1, $$3));
            }
         }

         return List.of();
      }

      @Override
      protected alz b(boolean $$0) {
         if ($$0) {
            return this.B() ? c : b;
         } else {
            return this.B() ? e : d;
         }
      }
   }
}
