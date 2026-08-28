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
   public static final BiConsumer<evp, List<? extends bss>> b = ($$0, $$1) -> {
   };
   private static final dwh<bss, ?> c = new dwh<bss, bss>() {
      public bss a(bss $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bss> a() {
         return bss.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bss> g;
   private final de.c h;
   private final Function<evp, evp> i;
   @Nullable
   private final evk j;
   private final BiConsumer<evp, List<? extends bss>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dwh<bss, ?> o;
   private final boolean p;

   public he(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bss> $$3,
      de.c $$4,
      Function<evp, evp> $$5,
      @Nullable evk $$6,
      BiConsumer<evp, List<? extends bss>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bsy<?> $$11,
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
      this.o = (dwh<bss, ?>)($$11 == null ? c : $$11);
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

   public bss a(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bss> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fc.d.create();
      } else if ($$1.size() > 1) {
         throw fc.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bss> b(ep $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ak().a($$0.w())).toList();
   }

   private List<? extends bss> f(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         arf $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bss>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new arf[]{$$1}));
      } else if (this.n != null) {
         for (are $$2 : $$0.l().K()) {
            bss $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bss[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         evp $$4 = this.i.apply($$0.d());
         Predicate<bss> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bss>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bss[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bss> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (are $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bss> $$0, are $$1, evp $$2, Predicate<bss> $$3) {
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

   public arf c(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      List<arf> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fc.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<arf> d(ep $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         arf $$1 = $$0.l().ah().a(this.m);
         return (List<arf>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new arf[]{$$1}));
      } else if (this.n != null) {
         arf $$2 = $$0.l().ah().a(this.n);
         return (List<arf>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new arf[]{$$2}));
      } else {
         evp $$3 = this.i.apply($$0.d());
         Predicate<bss> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof arf $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new arf[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<arf> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (arf $$9 : $$0.l().ah().t()) {
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

   private Predicate<bss> a(evp $$0) {
      Predicate<bss> $$1 = this.g;
      if (this.j != null) {
         evk $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cK()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bss> List<T> a(evp $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static xo a(List<? extends bss> $$0) {
      return xr.b($$0, bss::O_);
   }
}
