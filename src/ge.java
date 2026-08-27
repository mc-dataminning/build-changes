import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ge {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<elm, List<? extends blp>> b = ($$0, $$1) -> {
   };
   private static final dmy<blp, ?> c = new dmy<blp, blp>() {
      public blp a(blp $$0) {
         return $$0;
      }

      @Override
      public Class<? extends blp> a() {
         return blp.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<blp> g;
   private final ck.c h;
   private final Function<elm, elm> i;
   @Nullable
   private final elh j;
   private final BiConsumer<elm, List<? extends blp>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dmy<blp, ?> o;
   private final boolean p;

   public ge(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<blp> $$3,
      ck.c $$4,
      Function<elm, elm> $$5,
      @Nullable elh $$6,
      BiConsumer<elm, List<? extends blp>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable blt<?> $$11,
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
      this.o = (dmy<blp, ?>)($$11 == null ? c : $$11);
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
         throw ef.f.create();
      }
   }

   public blp a(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends blp> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ef.d.create();
      } else if ($$1.size() > 1) {
         throw ef.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends blp> b(ds $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends blp> f(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         ana $$1 = $$0.l().ae().a(this.m);
         return (List<? extends blp>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new ana[]{$$1}));
      } else if (this.n != null) {
         for (amz $$2 : $$0.l().H()) {
            blp $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new blp[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         elm $$4 = this.i.apply($$0.d());
         Predicate<blp> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends blp>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new blp[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<blp> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (amz $$7 : $$0.l().H()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<blp> $$0, amz $$1, elm $$2, Predicate<blp> $$3) {
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

   public ana c(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      List<ana> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ef.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<ana> d(ds $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         ana $$1 = $$0.l().ae().a(this.m);
         return (List<ana>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new ana[]{$$1}));
      } else if (this.n != null) {
         ana $$2 = $$0.l().ae().a(this.n);
         return (List<ana>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new ana[]{$$2}));
      } else {
         elm $$3 = this.i.apply($$0.d());
         Predicate<blp> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof ana $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new ana[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<ana> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (ana $$9 : $$0.l().ae().t()) {
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

   private Predicate<blp> a(elm $$0) {
      Predicate<blp> $$1 = this.g;
      if (this.j != null) {
         elh $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cH()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends blp> List<T> a(elm $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static vd a(List<? extends blp> $$0) {
      return vg.b($$0, blp::Q_);
   }
}
