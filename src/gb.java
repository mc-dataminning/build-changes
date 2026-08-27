import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gb {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<ehf, List<? extends big>> b = ($$0, $$1) -> {
   };
   private static final diw<big, ?> c = new diw<big, big>() {
      public big a(big $$0) {
         return $$0;
      }

      @Override
      public Class<? extends big> a() {
         return big.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<big> g;
   private final cj.c h;
   private final Function<ehf, ehf> i;
   @Nullable
   private final eha j;
   private final BiConsumer<ehf, List<? extends big>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final diw<big, ?> o;
   private final boolean p;

   public gb(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<big> $$3,
      cj.c $$4,
      Function<ehf, ehf> $$5,
      @Nullable eha $$6,
      BiConsumer<ehf, List<? extends big>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bik<?> $$11,
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
      this.o = (diw<big, ?>)($$11 == null ? c : $$11);
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

   private void e(ds $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw ed.f.create();
      }
   }

   public big a(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends big> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ed.d.create();
      } else if ($$1.size() > 1) {
         throw ed.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends big> b(ds $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ag().a($$0.w())).toList();
   }

   private List<? extends big> f(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         akj $$1 = $$0.l().ac().a(this.m);
         return (List<? extends big>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new akj[]{$$1}));
      } else if (this.n != null) {
         for (aki $$2 : $$0.l().F()) {
            big $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new big[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         ehf $$4 = this.i.apply($$0.d());
         Predicate<big> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends big>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new big[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<big> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aki $$7 : $$0.l().F()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<big> $$0, aki $$1, ehf $$2, Predicate<big> $$3) {
      int $$4 = this.f();
      if ($$0.size() < $$4) {
         if (this.j != null) {
            $$1.a(this.o, this.j.c($$2), $$3, $$0, $$4);
         } else {
            $$1.a(this.o, $$3, $$0, $$4);
         }
      }
   }

   private int f() {
      return this.k == b ? this.d : Integer.MAX_VALUE;
   }

   public akj c(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      List<akj> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ed.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<akj> d(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         akj $$1 = $$0.l().ac().a(this.m);
         return (List<akj>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new akj[]{$$1}));
      } else if (this.n != null) {
         akj $$2 = $$0.l().ac().a(this.n);
         return (List<akj>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new akj[]{$$2}));
      } else {
         ehf $$3 = this.i.apply($$0.d());
         Predicate<big> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof akj) {
               akj $$5 = (akj)$$0.f();
               if ($$4.test($$5)) {
                  return Lists.newArrayList(new akj[]{$$5});
               }
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<akj> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (akj $$9 : $$0.l().ac().t()) {
                  if ($$4.test($$9)) {
                     $$7.add($$9);
                     if ($$7.size() >= $$6) {
                        return $$7;
                     }
                  }
               }
            }

            return this.a($$3, $$7);
         }
      }
   }

   private Predicate<big> a(ehf $$0) {
      Predicate<big> $$1 = this.g;
      if (this.j != null) {
         eha $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cG()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.e($$0)));
      }

      return $$1;
   }

   private <T extends big> List<T> a(ehf $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static te a(List<? extends big> $$0) {
      return tg.b($$0, big::H_);
   }
}
