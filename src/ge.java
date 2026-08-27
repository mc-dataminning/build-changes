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
   public static final BiConsumer<eif, List<? extends bjt>> b = ($$0, $$1) -> {
   };
   private static final djz<bjt, ?> c = new djz<bjt, bjt>() {
      public bjt a(bjt $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bjt> a() {
         return bjt.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bjt> g;
   private final cl.c h;
   private final Function<eif, eif> i;
   @Nullable
   private final eia j;
   private final BiConsumer<eif, List<? extends bjt>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final djz<bjt, ?> o;
   private final boolean p;

   public ge(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bjt> $$3,
      cl.c $$4,
      Function<eif, eif> $$5,
      @Nullable eia $$6,
      BiConsumer<eif, List<? extends bjt>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bjx<?> $$11,
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
      this.o = (djz<bjt, ?>)($$11 == null ? c : $$11);
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
         throw eg.f.create();
      }
   }

   public bjt a(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bjt> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eg.d.create();
      } else if ($$1.size() > 1) {
         throw eg.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bjt> b(du $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ag().a($$0.w())).toList();
   }

   private List<? extends bjt> f(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         alr $$1 = $$0.m().ac().a(this.m);
         return (List<? extends bjt>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new alr[]{$$1}));
      } else if (this.n != null) {
         for (alq $$2 : $$0.m().F()) {
            bjt $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bjt[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         eif $$4 = this.i.apply($$0.e());
         Predicate<bjt> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bjt>)($$0.g() != null && $$5.test($$0.g()) ? Lists.newArrayList(new bjt[]{$$0.g()}) : Collections.emptyList());
         } else {
            List<bjt> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.f(), $$4, $$5);
            } else {
               for (alq $$7 : $$0.m().F()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bjt> $$0, alq $$1, eif $$2, Predicate<bjt> $$3) {
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

   public alr c(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<alr> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eg.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<alr> d(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         alr $$1 = $$0.m().ac().a(this.m);
         return (List<alr>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new alr[]{$$1}));
      } else if (this.n != null) {
         alr $$2 = $$0.m().ac().a(this.n);
         return (List<alr>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new alr[]{$$2}));
      } else {
         eif $$3 = this.i.apply($$0.e());
         Predicate<bjt> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.g() instanceof alr $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new alr[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<alr> $$7;
            if (this.d()) {
               $$7 = $$0.f().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (alr $$9 : $$0.m().ac().t()) {
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

   private Predicate<bjt> a(eif $$0) {
      Predicate<bjt> $$1 = this.g;
      if (this.j != null) {
         eia $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cG()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.e($$0)));
      }

      return $$1;
   }

   private <T extends bjt> List<T> a(eif $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static ui a(List<? extends bjt> $$0) {
      return ul.b($$0, bjt::O_);
   }
}
