import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gr {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<etf, List<? extends bql>> b = ($$0, $$1) -> {
   };
   private static final duf<bql, ?> c = new duf<bql, bql>() {
      public bql a(bql $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bql> a() {
         return bql.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bql> g;
   private final cs.c h;
   private final Function<etf, etf> i;
   @Nullable
   private final eta j;
   private final BiConsumer<etf, List<? extends bql>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final duf<bql, ?> o;
   private final boolean p;

   public gr(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bql> $$3,
      cs.c $$4,
      Function<etf, etf> $$5,
      @Nullable eta $$6,
      BiConsumer<etf, List<? extends bql>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bqr<?> $$11,
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
      this.o = (duf<bql, ?>)($$11 == null ? c : $$11);
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

   private void e(ec $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw ep.f.create();
      }
   }

   public bql a(ec $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bql> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ep.d.create();
      } else if ($$1.size() > 1) {
         throw ep.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bql> b(ec $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends bql> f(ec $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aqf $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bql>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqf[]{$$1}));
      } else if (this.n != null) {
         for (aqe $$2 : $$0.l().K()) {
            bql $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bql[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         etf $$4 = this.i.apply($$0.d());
         Predicate<bql> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bql>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bql[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bql> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aqe $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bql> $$0, aqe $$1, etf $$2, Predicate<bql> $$3) {
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

   public aqf c(ec $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aqf> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ep.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aqf> d(ec $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aqf $$1 = $$0.l().ah().a(this.m);
         return (List<aqf>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqf[]{$$1}));
      } else if (this.n != null) {
         aqf $$2 = $$0.l().ah().a(this.n);
         return (List<aqf>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aqf[]{$$2}));
      } else {
         etf $$3 = this.i.apply($$0.d());
         Predicate<bql> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aqf $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aqf[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aqf> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aqf $$9 : $$0.l().ah().t()) {
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

   private Predicate<bql> a(etf $$0) {
      Predicate<bql> $$1 = this.g;
      if (this.j != null) {
         eta $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cI()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bql> List<T> a(etf $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static ws a(List<? extends bql> $$0) {
      return wv.b($$0, bql::O_);
   }
}
