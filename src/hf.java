import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hf {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<evz, List<? extends bsd>> b = ($$0, $$1) -> {
   };
   private static final dwo<bsd, ?> c = new dwo<bsd, bsd>() {
      public bsd a(bsd $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bsd> a() {
         return bsd.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bsd> g;
   private final de.c h;
   private final Function<evz, evz> i;
   @Nullable
   private final evu j;
   private final BiConsumer<evz, List<? extends bsd>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dwo<bsd, ?> o;
   private final boolean p;

   public hf(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bsd> $$3,
      de.c $$4,
      Function<evz, evz> $$5,
      @Nullable evu $$6,
      BiConsumer<evz, List<? extends bsd>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bsj<?> $$11,
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
      this.o = (dwo<bsd, ?>)($$11 == null ? c : $$11);
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

   private void e(eq $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw fd.f.create();
      }
   }

   public bsd a(eq $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bsd> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fd.d.create();
      } else if ($$1.size() > 1) {
         throw fd.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bsd> b(eq $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ak().a($$0.w())).toList();
   }

   private List<? extends bsd> f(eq $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aql $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bsd>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aql[]{$$1}));
      } else if (this.n != null) {
         for (aqk $$2 : $$0.l().K()) {
            bsd $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bsd[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         evz $$4 = this.i.apply($$0.d());
         Predicate<bsd> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bsd>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bsd[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bsd> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aqk $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bsd> $$0, aqk $$1, evz $$2, Predicate<bsd> $$3) {
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

   public aql c(eq $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aql> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fd.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aql> d(eq $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aql $$1 = $$0.l().ah().a(this.m);
         return (List<aql>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aql[]{$$1}));
      } else if (this.n != null) {
         aql $$2 = $$0.l().ah().a(this.n);
         return (List<aql>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aql[]{$$2}));
      } else {
         evz $$3 = this.i.apply($$0.d());
         Predicate<bsd> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aql $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aql[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aql> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aql $$9 : $$0.l().ah().t()) {
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

   private Predicate<bsd> a(evz $$0) {
      Predicate<bsd> $$1 = this.g;
      if (this.j != null) {
         evu $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cK()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bsd> List<T> a(evz $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wu a(List<? extends bsd> $$0) {
      return wx.b($$0, bsd::O_);
   }
}
