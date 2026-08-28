import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class he {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<evr, List<? extends bsu>> b = ($$0, $$1) -> {
   };
   private static final dwj<bsu, ?> c = new dwj<bsu, bsu>() {
      public bsu a(bsu $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bsu> a() {
         return bsu.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bsu> g;
   private final de.c h;
   private final Function<evr, evr> i;
   @Nullable
   private final evm j;
   private final BiConsumer<evr, List<? extends bsu>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dwj<bsu, ?> o;
   private final boolean p;

   public he(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bsu> $$3,
      de.c $$4,
      Function<evr, evr> $$5,
      @Nullable evm $$6,
      BiConsumer<evr, List<? extends bsu>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bta<?> $$11,
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
      this.o = (dwj<bsu, ?>)($$11 == null ? c : $$11);
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

   private void e(ep $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw fc.f.create();
      }
   }

   public bsu a(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bsu> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fc.d.create();
      } else if ($$1.size() > 1) {
         throw fc.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bsu> b(ep $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ak().a($$0.w())).toList();
   }

   private List<? extends bsu> f(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         arg $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bsu>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new arg[]{$$1}));
      } else if (this.n != null) {
         for (arf $$2 : $$0.l().K()) {
            bsu $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bsu[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         evr $$4 = this.i.apply($$0.d());
         Predicate<bsu> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bsu>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bsu[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bsu> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (arf $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bsu> $$0, arf $$1, evr $$2, Predicate<bsu> $$3) {
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

   public arg c(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      List<arg> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fc.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<arg> d(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         arg $$1 = $$0.l().ah().a(this.m);
         return (List<arg>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new arg[]{$$1}));
      } else if (this.n != null) {
         arg $$2 = $$0.l().ah().a(this.n);
         return (List<arg>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new arg[]{$$2}));
      } else {
         evr $$3 = this.i.apply($$0.d());
         Predicate<bsu> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof arg $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new arg[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<arg> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (arg $$9 : $$0.l().ah().t()) {
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

   private Predicate<bsu> a(evr $$0) {
      Predicate<bsu> $$1 = this.g;
      if (this.j != null) {
         evm $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cK()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bsu> List<T> a(evr $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static xp a(List<? extends bsu> $$0) {
      return xs.b($$0, bsu::O_);
   }
}
