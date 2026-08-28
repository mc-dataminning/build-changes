import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hi {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<exa, List<? extends bsr>> b = ($$0, $$1) -> {
   };
   private static final dxn<bsr, ?> c = new dxn<bsr, bsr>() {
      public bsr a(bsr $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bsr> a() {
         return bsr.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bsr> g;
   private final dh.c h;
   private final Function<exa, exa> i;
   @Nullable
   private final ewv j;
   private final BiConsumer<exa, List<? extends bsr>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dxn<bsr, ?> o;
   private final boolean p;

   public hi(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bsr> $$3,
      dh.c $$4,
      Function<exa, exa> $$5,
      @Nullable ewv $$6,
      BiConsumer<exa, List<? extends bsr>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bsx<?> $$11,
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
      this.o = (dxn<bsr, ?>)($$11 == null ? c : $$11);
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

   private void e(et $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw fg.f.create();
      }
   }

   public bsr a(et $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bsr> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fg.d.create();
      } else if ($$1.size() > 1) {
         throw fg.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bsr> b(et $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.am().a($$0.w())).toList();
   }

   private List<? extends bsr> f(et $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aqv $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bsr>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqv[]{$$1}));
      } else if (this.n != null) {
         for (aqu $$2 : $$0.l().K()) {
            bsr $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bsr[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         exa $$4 = this.i.apply($$0.d());
         Predicate<bsr> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bsr>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bsr[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bsr> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aqu $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bsr> $$0, aqu $$1, exa $$2, Predicate<bsr> $$3) {
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

   public aqv c(et $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aqv> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fg.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aqv> d(et $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aqv $$1 = $$0.l().ah().a(this.m);
         return (List<aqv>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqv[]{$$1}));
      } else if (this.n != null) {
         aqv $$2 = $$0.l().ah().a(this.n);
         return (List<aqv>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aqv[]{$$2}));
      } else {
         exa $$3 = this.i.apply($$0.d());
         Predicate<bsr> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aqv $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aqv[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aqv> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aqv $$9 : $$0.l().ah().t()) {
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

   private Predicate<bsr> a(exa $$0) {
      Predicate<bsr> $$1 = this.g;
      if (this.j != null) {
         ewv $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cL()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.g($$0)));
      }

      return $$1;
   }

   private <T extends bsr> List<T> a(exa $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wz a(List<? extends bsr> $$0) {
      return xc.b($$0, bsr::S_);
   }
}
