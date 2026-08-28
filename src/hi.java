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
   public static final BiConsumer<eww, List<? extends bsq>> b = ($$0, $$1) -> {
   };
   private static final dxk<bsq, ?> c = new dxk<bsq, bsq>() {
      public bsq a(bsq $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bsq> a() {
         return bsq.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bsq> g;
   private final dh.c h;
   private final Function<eww, eww> i;
   @Nullable
   private final ewr j;
   private final BiConsumer<eww, List<? extends bsq>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dxk<bsq, ?> o;
   private final boolean p;

   public hi(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bsq> $$3,
      dh.c $$4,
      Function<eww, eww> $$5,
      @Nullable ewr $$6,
      BiConsumer<eww, List<? extends bsq>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bsw<?> $$11,
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
      this.o = (dxk<bsq, ?>)($$11 == null ? c : $$11);
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

   public bsq a(et $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bsq> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fg.d.create();
      } else if ($$1.size() > 1) {
         throw fg.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bsq> b(et $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.am().a($$0.w())).toList();
   }

   private List<? extends bsq> f(et $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aqu $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bsq>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqu[]{$$1}));
      } else if (this.n != null) {
         for (aqt $$2 : $$0.l().K()) {
            bsq $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bsq[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         eww $$4 = this.i.apply($$0.d());
         Predicate<bsq> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bsq>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bsq[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bsq> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aqt $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bsq> $$0, aqt $$1, eww $$2, Predicate<bsq> $$3) {
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

   public aqu c(et $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aqu> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fg.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aqu> d(et $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aqu $$1 = $$0.l().ah().a(this.m);
         return (List<aqu>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqu[]{$$1}));
      } else if (this.n != null) {
         aqu $$2 = $$0.l().ah().a(this.n);
         return (List<aqu>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aqu[]{$$2}));
      } else {
         eww $$3 = this.i.apply($$0.d());
         Predicate<bsq> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aqu $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aqu[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aqu> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aqu $$9 : $$0.l().ah().t()) {
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

   private Predicate<bsq> a(eww $$0) {
      Predicate<bsq> $$1 = this.g;
      if (this.j != null) {
         ewr $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cL()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.g($$0)));
      }

      return $$1;
   }

   private <T extends bsq> List<T> a(eww $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wy a(List<? extends bsq> $$0) {
      return xb.b($$0, bsq::O_);
   }
}
