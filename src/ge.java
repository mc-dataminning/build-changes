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
   public static final BiConsumer<ejz, List<? extends bkv>> b = ($$0, $$1) -> {
   };
   private static final dll<bkv, ?> c = new dll<bkv, bkv>() {
      public bkv a(bkv $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bkv> a() {
         return bkv.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bkv> g;
   private final cl.c h;
   private final Function<ejz, ejz> i;
   @Nullable
   private final eju j;
   private final BiConsumer<ejz, List<? extends bkv>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dll<bkv, ?> o;
   private final boolean p;

   public ge(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bkv> $$3,
      cl.c $$4,
      Function<ejz, ejz> $$5,
      @Nullable eju $$6,
      BiConsumer<ejz, List<? extends bkv>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bkz<?> $$11,
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
      this.o = (dll<bkv, ?>)($$11 == null ? c : $$11);
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

   public bkv a(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bkv> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eg.d.create();
      } else if ($$1.size() > 1) {
         throw eg.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bkv> b(du $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends bkv> f(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         amj $$1 = $$0.l().ae().a(this.m);
         return (List<? extends bkv>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new amj[]{$$1}));
      } else if (this.n != null) {
         for (ami $$2 : $$0.l().H()) {
            bkv $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bkv[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         ejz $$4 = this.i.apply($$0.d());
         Predicate<bkv> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bkv>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bkv[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bkv> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (ami $$7 : $$0.l().H()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bkv> $$0, ami $$1, ejz $$2, Predicate<bkv> $$3) {
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

   public amj c(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<amj> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eg.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<amj> d(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         amj $$1 = $$0.l().ae().a(this.m);
         return (List<amj>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new amj[]{$$1}));
      } else if (this.n != null) {
         amj $$2 = $$0.l().ae().a(this.n);
         return (List<amj>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new amj[]{$$2}));
      } else {
         ejz $$3 = this.i.apply($$0.d());
         Predicate<bkv> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof amj $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new amj[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<amj> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (amj $$9 : $$0.l().ae().t()) {
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

   private Predicate<bkv> a(ejz $$0) {
      Predicate<bkv> $$1 = this.g;
      if (this.j != null) {
         eju $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cH()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bkv> List<T> a(ejz $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static uv a(List<? extends bkv> $$0) {
      return uy.b($$0, bkv::Q_);
   }
}
