import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gz {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<ffc, List<? extends bwi>> b = ($$0, $$1) -> {
   };
   private static final eff<bwi, ?> c = new eff<bwi, bwi>() {
      public bwi a(bwi $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bwi> a() {
         return bwi.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final List<Predicate<bwi>> g;
   private final cw.c h;
   private final Function<ffc, ffc> i;
   @Nullable
   private final fex j;
   private final BiConsumer<ffc, List<? extends bwi>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final eff<bwi, ?> o;
   private final boolean p;

   public gz(
      int $$0,
      boolean $$1,
      boolean $$2,
      List<Predicate<bwi>> $$3,
      cw.c $$4,
      Function<ffc, ffc> $$5,
      @Nullable fex $$6,
      BiConsumer<ffc, List<? extends bwi>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bwr<?> $$11,
      boolean $$12
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$8;
      this.m = $$9;
      this.n = $$10;
      this.o = (eff<bwi, ?>)($$11 == null ? c : $$11);
      this.p = $$12;
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }

   public boolean c() {
      return this.l;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.p;
   }

   private void e(ej $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw ew.f.create();
      }
   }

   public bwi a(ej $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bwi> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ew.d.create();
      } else if ($$1.size() > 1) {
         throw ew.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bwi> b(ej $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         arr $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         for (arq $$2 : $$0.l().L()) {
            bwi $$3 = $$2.b(this.n);
            if ($$3 != null) {
               if ($$3.an().a($$0.v())) {
                  return List.of($$3);
               }
               break;
            }
         }

         return List.of();
      } else {
         ffc $$4 = this.i.apply($$0.d());
         fex $$5 = this.a($$4);
         if (this.l) {
            Predicate<bwi> $$6 = this.a($$4, $$5, null);
            return $$0.f() != null && $$6.test($$0.f()) ? List.of($$0.f()) : List.of();
         } else {
            Predicate<bwi> $$7 = this.a($$4, $$5, $$0.v());
            List<bwi> $$8 = new ObjectArrayList();
            if (this.d()) {
               this.a($$8, $$0.e(), $$5, $$7);
            } else {
               for (arq $$9 : $$0.l().L()) {
                  this.a($$8, $$9, $$5, $$7);
               }
            }

            return this.a($$4, $$8);
         }
      }
   }

   private void a(List<bwi> $$0, arq $$1, @Nullable fex $$2, Predicate<bwi> $$3) {
      int $$4 = this.f();
      if ($$0.size() < $$4) {
         if ($$2 != null) {
            $$1.a(this.o, $$2, $$3, $$0, $$4);
         } else {
            $$1.a(this.o, $$3, $$0, $$4);
         }
      }
   }

   private int f() {
      return this.k == b ? this.d : Integer.MAX_VALUE;
   }

   public arr c(ej $$0) throws CommandSyntaxException {
      this.e($$0);
      List<arr> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ew.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<arr> d(ej $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         arr $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         arr $$2 = $$0.l().ag().a(this.n);
         return $$2 == null ? List.of() : List.of($$2);
      } else {
         ffc $$3 = this.i.apply($$0.d());
         fex $$4 = this.a($$3);
         Predicate<bwi> $$5 = this.a($$3, $$4, null);
         if (this.l) {
            if ($$0.f() instanceof arr $$6 && $$5.test($$6)) {
               return List.of($$6);
            }

            return List.of();
         } else {
            int $$7 = this.f();
            List<arr> $$8;
            if (this.d()) {
               $$8 = $$0.e().a($$5, $$7);
            } else {
               $$8 = new ObjectArrayList();

               for (arr $$10 : $$0.l().ag().t()) {
                  if ($$5.test($$10)) {
                     $$8.add($$10);
                     if ($$8.size() >= $$7) {
                        return $$8;
                     }
                  }
               }
            }

            return this.a($$3, $$8);
         }
      }
   }

   @Nullable
   private fex a(ffc $$0) {
      return this.j != null ? this.j.c($$0) : null;
   }

   private Predicate<bwi> a(ffc $$0, @Nullable fex $$1, @Nullable cuw $$2) {
      boolean $$3 = $$2 != null;
      boolean $$4 = $$1 != null;
      boolean $$5 = !this.h.c();
      int $$6 = ($$3 ? 1 : 0) + ($$4 ? 1 : 0) + ($$5 ? 1 : 0);
      List<Predicate<bwi>> $$7;
      if ($$6 == 0) {
         $$7 = this.g;
      } else {
         List<Predicate<bwi>> $$8 = new ObjectArrayList(this.g.size() + $$6);
         $$8.addAll(this.g);
         if ($$3) {
            $$8.add($$1x -> $$1x.an().a($$2));
         }

         if ($$4) {
            $$8.add($$1x -> $$1.c($$1x.cQ()));
         }

         if ($$5) {
            $$8.add($$1x -> this.h.e($$1x.g($$0)));
         }

         $$7 = $$8;
      }

      return ag.a($$7);
   }

   private <T extends bwi> List<T> a(ffc $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wy a(List<? extends bwi> $$0) {
      return xb.b($$0, bwi::m_);
   }
}
