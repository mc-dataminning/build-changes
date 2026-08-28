import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hj {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<eyw, List<? extends btr>> b = ($$0, $$1) -> {
   };
   private static final dzd<btr, ?> c = new dzd<btr, btr>() {
      public btr a(btr $$0) {
         return $$0;
      }

      @Override
      public Class<? extends btr> a() {
         return btr.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final List<Predicate<btr>> g;
   private final dh.c h;
   private final Function<eyw, eyw> i;
   @Nullable
   private final eyr j;
   private final BiConsumer<eyw, List<? extends btr>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dzd<btr, ?> o;
   private final boolean p;

   public hj(
      int $$0,
      boolean $$1,
      boolean $$2,
      List<Predicate<btr>> $$3,
      dh.c $$4,
      Function<eyw, eyw> $$5,
      @Nullable eyr $$6,
      BiConsumer<eyw, List<? extends btr>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bty<?> $$11,
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
      this.o = (dzd<btr, ?>)($$11 == null ? c : $$11);
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

   private void e(eu $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw fh.f.create();
      }
   }

   public btr a(eu $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends btr> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fh.d.create();
      } else if ($$1.size() > 1) {
         throw fh.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends btr> b(eu $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         ark $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         for (arj $$2 : $$0.l().L()) {
            btr $$3 = $$2.a(this.n);
            if ($$3 != null) {
               if ($$3.ao().a($$0.w())) {
                  return List.of($$3);
               }
               break;
            }
         }

         return List.of();
      } else {
         eyw $$4 = this.i.apply($$0.d());
         eyr $$5 = this.a($$4);
         if (this.l) {
            Predicate<btr> $$6 = this.a($$4, $$5, null);
            return $$0.f() != null && $$6.test($$0.f()) ? List.of($$0.f()) : List.of();
         } else {
            Predicate<btr> $$7 = this.a($$4, $$5, $$0.w());
            List<btr> $$8 = new ObjectArrayList();
            if (this.d()) {
               this.a($$8, $$0.e(), $$5, $$7);
            } else {
               for (arj $$9 : $$0.l().L()) {
                  this.a($$8, $$9, $$5, $$7);
               }
            }

            return this.a($$4, $$8);
         }
      }
   }

   private void a(List<btr> $$0, arj $$1, @Nullable eyr $$2, Predicate<btr> $$3) {
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

   public ark c(eu $$0) throws CommandSyntaxException {
      this.e($$0);
      List<ark> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fh.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<ark> d(eu $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         ark $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         ark $$2 = $$0.l().ag().a(this.n);
         return $$2 == null ? List.of() : List.of($$2);
      } else {
         eyw $$3 = this.i.apply($$0.d());
         eyr $$4 = this.a($$3);
         Predicate<btr> $$5 = this.a($$3, $$4, null);
         if (this.l) {
            if ($$0.f() instanceof ark $$6 && $$5.test($$6)) {
               return List.of($$6);
            }

            return List.of();
         } else {
            int $$7 = this.f();
            List<ark> $$8;
            if (this.d()) {
               $$8 = $$0.e().a($$5, $$7);
            } else {
               $$8 = new ObjectArrayList();

               for (ark $$10 : $$0.l().ag().t()) {
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
   private eyr a(eyw $$0) {
      return this.j != null ? this.j.c($$0) : null;
   }

   private Predicate<btr> a(eyw $$0, @Nullable eyr $$1, @Nullable cqq $$2) {
      boolean $$3 = $$2 != null;
      boolean $$4 = $$1 != null;
      boolean $$5 = !this.h.c();
      int $$6 = ($$3 ? 1 : 0) + ($$4 ? 1 : 0) + ($$5 ? 1 : 0);
      List<Predicate<btr>> $$7;
      if ($$6 == 0) {
         $$7 = this.g;
      } else {
         List<Predicate<btr>> $$8 = new ObjectArrayList(this.g.size() + $$6);
         $$8.addAll(this.g);
         if ($$3) {
            $$8.add($$1x -> $$1x.ao().a($$2));
         }

         if ($$4) {
            $$8.add($$1x -> $$1.c($$1x.cO()));
         }

         if ($$5) {
            $$8.add($$1x -> this.h.e($$1x.f($$0)));
         }

         $$7 = $$8;
      }

      return ad.a($$7);
   }

   private <T extends btr> List<T> a(eyw $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static xe a(List<? extends btr> $$0) {
      return xh.b($$0, btr::R_);
   }
}
