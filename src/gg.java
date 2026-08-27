import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gg {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<ens, List<? extends bno>> b = ($$0, $$1) -> {
   };
   private static final dpd<bno, ?> c = new dpd<bno, bno>() {
      public bno a(bno $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bno> a() {
         return bno.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bno> g;
   private final cm.c h;
   private final Function<ens, ens> i;
   @Nullable
   private final enn j;
   private final BiConsumer<ens, List<? extends bno>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dpd<bno, ?> o;
   private final boolean p;

   public gg(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bno> $$3,
      cm.c $$4,
      Function<ens, ens> $$5,
      @Nullable enn $$6,
      BiConsumer<ens, List<? extends bno>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bnu<?> $$11,
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
      this.o = (dpd<bno, ?>)($$11 == null ? c : $$11);
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

   public bno a(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bno> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eh.d.create();
      } else if ($$1.size() > 1) {
         throw eh.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bno> b(du $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends bno> f(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aow $$1 = $$0.l().ae().a(this.m);
         return (List<? extends bno>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aow[]{$$1}));
      } else if (this.n != null) {
         for (aov $$2 : $$0.l().H()) {
            bno $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bno[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         ens $$4 = this.i.apply($$0.d());
         Predicate<bno> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bno>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bno[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bno> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aov $$7 : $$0.l().H()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bno> $$0, aov $$1, ens $$2, Predicate<bno> $$3) {
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

   public aow c(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aow> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eh.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aow> d(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aow $$1 = $$0.l().ae().a(this.m);
         return (List<aow>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aow[]{$$1}));
      } else if (this.n != null) {
         aow $$2 = $$0.l().ae().a(this.n);
         return (List<aow>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aow[]{$$2}));
      } else {
         ens $$3 = this.i.apply($$0.d());
         Predicate<bno> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aow $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aow[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aow> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aow $$9 : $$0.l().ae().t()) {
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

   private Predicate<bno> a(ens $$0) {
      Predicate<bno> $$1 = this.g;
      if (this.j != null) {
         enn $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cH()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bno> List<T> a(ens $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static vq a(List<? extends bno> $$0) {
      return vt.b($$0, bno::Q_);
   }
}
