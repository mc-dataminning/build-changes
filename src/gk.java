import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gk {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<esj, List<? extends bqa>> b = ($$0, $$1) -> {
   };
   private static final dtp<bqa, ?> c = new dtp<bqa, bqa>() {
      public bqa a(bqa $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bqa> a() {
         return bqa.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bqa> g;
   private final cm.c h;
   private final Function<esj, esj> i;
   @Nullable
   private final ese j;
   private final BiConsumer<esj, List<? extends bqa>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dtp<bqa, ?> o;
   private final boolean p;

   public gk(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bqa> $$3,
      cm.c $$4,
      Function<esj, esj> $$5,
      @Nullable ese $$6,
      BiConsumer<esj, List<? extends bqa>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bqg<?> $$11,
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
      this.o = (dtp<bqa, ?>)($$11 == null ? c : $$11);
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

   private void e(dv $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw ei.f.create();
      }
   }

   public bqa a(dv $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bqa> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ei.d.create();
      } else if ($$1.size() > 1) {
         throw ei.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bqa> b(dv $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends bqa> f(dv $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         apv $$1 = $$0.l().ah().a(this.m);
         return (List<? extends bqa>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new apv[]{$$1}));
      } else if (this.n != null) {
         for (apu $$2 : $$0.l().K()) {
            bqa $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bqa[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         esj $$4 = this.i.apply($$0.d());
         Predicate<bqa> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bqa>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new bqa[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<bqa> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (apu $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bqa> $$0, apu $$1, esj $$2, Predicate<bqa> $$3) {
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

   public apv c(dv $$0) throws CommandSyntaxException {
      this.e($$0);
      List<apv> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ei.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<apv> d(dv $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         apv $$1 = $$0.l().ah().a(this.m);
         return (List<apv>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new apv[]{$$1}));
      } else if (this.n != null) {
         apv $$2 = $$0.l().ah().a(this.n);
         return (List<apv>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new apv[]{$$2}));
      } else {
         esj $$3 = this.i.apply($$0.d());
         Predicate<bqa> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof apv $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new apv[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<apv> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (apv $$9 : $$0.l().ah().t()) {
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

   private Predicate<bqa> a(esj $$0) {
      Predicate<bqa> $$1 = this.g;
      if (this.j != null) {
         ese $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cH()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends bqa> List<T> a(esj $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wi a(List<? extends bqa> $$0) {
      return wl.b($$0, bqa::O_);
   }
}
