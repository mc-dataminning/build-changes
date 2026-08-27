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
   public static final BiConsumer<esa, List<? extends bpv>> b = ($$0, $$1) -> {
   };
   private static final dtg<bpv, ?> c = new dtg<bpv, bpv>() {
      public bpv a(bpv $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bpv> a() {
         return bpv.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bpv> g;
   private final cm.c h;
   private final Function<esa, esa> i;
   @Nullable
   private final erv j;
   private final BiConsumer<esa, List<? extends bpv>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dtg<bpv, ?> o;
   private final boolean p;

   public gi(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bpv> $$3,
      cm.c $$4,
      Function<esa, esa> $$5,
      @Nullable erv $$6,
      BiConsumer<esa, List<? extends bpv>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bqb<?> $$11,
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
      this.o = (dtg<bpv, ?>)($$11 == null ? c : $$11);
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

   public bpv a(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bpv> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eh.d.create();
      } else if ($$1.size() > 1) {
         throw eh.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bpv> b(du $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends bpv> f(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         apt $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bpv>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new apt[]{$$1}));
      } else if (this.n != null) {
         for (aps $$2 : $$0.l().K()) {
            bpv $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bpv[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         esa $$4 = this.i.apply($$0.d());
         Predicate<bpv> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bpv>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bpv[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bpv> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aps $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bpv> $$0, aps $$1, esa $$2, Predicate<bpv> $$3) {
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

   public apt c(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<apt> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eh.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<apt> d(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         apt $$1 = $$0.l().ah().a(this.m);
         return (List<apt>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new apt[]{$$1}));
      } else if (this.n != null) {
         apt $$2 = $$0.l().ah().a(this.n);
         return (List<apt>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new apt[]{$$2}));
      } else {
         esa $$3 = this.i.apply($$0.d());
         Predicate<bpv> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof apt $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new apt[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<apt> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (apt $$9 : $$0.l().ah().t()) {
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

   private Predicate<bpv> a(esa $$0) {
      Predicate<bpv> $$1 = this.g;
      if (this.j != null) {
         erv $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cH()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bpv> List<T> a(esa $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wg a(List<? extends bpv> $$0) {
      return wj.b($$0, bpv::O_);
   }
}
