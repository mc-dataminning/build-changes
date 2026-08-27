import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gc {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<ehn, List<? extends biq>> b = ($$0, $$1) -> {
   };
   private static final djh<biq, ?> c = new djh<biq, biq>() {
      public biq a(biq $$0) {
         return $$0;
      }

      @Override
      public Class<? extends biq> a() {
         return biq.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<biq> g;
   private final cl.c h;
   private final Function<ehn, ehn> i;
   @Nullable
   private final ehi j;
   private final BiConsumer<ehn, List<? extends biq>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final djh<biq, ?> o;
   private final boolean p;

   public gc(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<biq> $$3,
      cl.c $$4,
      Function<ehn, ehn> $$5,
      @Nullable ehi $$6,
      BiConsumer<ehn, List<? extends biq>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable biu<?> $$11,
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
      this.o = (djh<biq, ?>)($$11 == null ? c : $$11);
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

   private void e(dt $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw ee.f.create();
      }
   }

   public biq a(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends biq> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ee.d.create();
      } else if ($$1.size() > 1) {
         throw ee.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends biq> b(dt $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ag().a($$0.w())).toList();
   }

   private List<? extends biq> f(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aks $$1 = $$0.l().ac().a(this.m);
         return (List<? extends biq>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aks[]{$$1}));
      } else if (this.n != null) {
         for (akr $$2 : $$0.l().F()) {
            biq $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new biq[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         ehn $$4 = this.i.apply($$0.d());
         Predicate<biq> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends biq>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new biq[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<biq> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (akr $$7 : $$0.l().F()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<biq> $$0, akr $$1, ehn $$2, Predicate<biq> $$3) {
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

   public aks c(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aks> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ee.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aks> d(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aks $$1 = $$0.l().ac().a(this.m);
         return (List<aks>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aks[]{$$1}));
      } else if (this.n != null) {
         aks $$2 = $$0.l().ac().a(this.n);
         return (List<aks>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aks[]{$$2}));
      } else {
         ehn $$3 = this.i.apply($$0.d());
         Predicate<biq> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aks $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aks[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aks> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aks $$9 : $$0.l().ac().t()) {
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

   private Predicate<biq> a(ehn $$0) {
      Predicate<biq> $$1 = this.g;
      if (this.j != null) {
         ehi $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cG()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.e($$0)));
      }

      return $$1;
   }

   private <T extends biq> List<T> a(ehn $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static tm a(List<? extends biq> $$0) {
      return to.b($$0, biq::N_);
   }
}
