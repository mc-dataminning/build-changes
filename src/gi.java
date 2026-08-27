import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gi {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<epr, List<? extends bow>> b = ($$0, $$1) -> {
   };
   private static final drb<bow, ?> c = new drb<bow, bow>() {
      public bow a(bow $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bow> a() {
         return bow.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bow> g;
   private final cm.c h;
   private final Function<epr, epr> i;
   @Nullable
   private final epm j;
   private final BiConsumer<epr, List<? extends bow>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final drb<bow, ?> o;
   private final boolean p;

   public gi(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bow> $$3,
      cm.c $$4,
      Function<epr, epr> $$5,
      @Nullable epm $$6,
      BiConsumer<epr, List<? extends bow>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bpc<?> $$11,
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
      this.o = (drb<bow, ?>)($$11 == null ? c : $$11);
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

   private void e(du $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw eh.f.create();
      }
   }

   public bow a(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bow> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eh.d.create();
      } else if ($$1.size() > 1) {
         throw eh.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bow> b(du $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends bow> f(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         apg $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bow>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new apg[]{$$1}));
      } else if (this.n != null) {
         for (apf $$2 : $$0.l().K()) {
            bow $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bow[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         epr $$4 = this.i.apply($$0.d());
         Predicate<bow> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bow>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bow[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bow> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (apf $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bow> $$0, apf $$1, epr $$2, Predicate<bow> $$3) {
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

   public apg c(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<apg> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eh.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<apg> d(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         apg $$1 = $$0.l().ah().a(this.m);
         return (List<apg>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new apg[]{$$1}));
      } else if (this.n != null) {
         apg $$2 = $$0.l().ah().a(this.n);
         return (List<apg>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new apg[]{$$2}));
      } else {
         epr $$3 = this.i.apply($$0.d());
         Predicate<bow> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof apg $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new apg[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<apg> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (apg $$9 : $$0.l().ah().t()) {
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

   private Predicate<bow> a(epr $$0) {
      Predicate<bow> $$1 = this.g;
      if (this.j != null) {
         epm $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cH()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bow> List<T> a(epr $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static vu a(List<? extends bow> $$0) {
      return vx.b($$0, bow::O_);
   }
}
