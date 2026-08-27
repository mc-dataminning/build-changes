import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gt {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<euk, List<? extends bru>> b = ($$0, $$1) -> {
   };
   private static final dvi<bru, ?> c = new dvi<bru, bru>() {
      public bru a(bru $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bru> a() {
         return bru.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bru> g;
   private final ct.c h;
   private final Function<euk, euk> i;
   @Nullable
   private final euf j;
   private final BiConsumer<euk, List<? extends bru>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dvi<bru, ?> o;
   private final boolean p;

   public gt(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bru> $$3,
      ct.c $$4,
      Function<euk, euk> $$5,
      @Nullable euf $$6,
      BiConsumer<euk, List<? extends bru>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bsa<?> $$11,
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
      this.o = (dvi<bru, ?>)($$11 == null ? c : $$11);
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

   private void e(ee $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw er.f.create();
      }
   }

   public bru a(ee $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bru> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw er.d.create();
      } else if ($$1.size() > 1) {
         throw er.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bru> b(ee $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ak().a($$0.w())).toList();
   }

   private List<? extends bru> f(ee $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aqn $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bru>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqn[]{$$1}));
      } else if (this.n != null) {
         for (aqm $$2 : $$0.l().K()) {
            bru $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bru[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         euk $$4 = this.i.apply($$0.d());
         Predicate<bru> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bru>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bru[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bru> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aqm $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bru> $$0, aqm $$1, euk $$2, Predicate<bru> $$3) {
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

   public aqn c(ee $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aqn> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw er.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aqn> d(ee $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aqn $$1 = $$0.l().ah().a(this.m);
         return (List<aqn>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqn[]{$$1}));
      } else if (this.n != null) {
         aqn $$2 = $$0.l().ah().a(this.n);
         return (List<aqn>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aqn[]{$$2}));
      } else {
         euk $$3 = this.i.apply($$0.d());
         Predicate<bru> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aqn $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aqn[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aqn> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aqn $$9 : $$0.l().ah().t()) {
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

   private Predicate<bru> a(euk $$0) {
      Predicate<bru> $$1 = this.g;
      if (this.j != null) {
         euf $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cK()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bru> List<T> a(euk $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wx a(List<? extends bru> $$0) {
      return xa.b($$0, bru::O_);
   }
}
