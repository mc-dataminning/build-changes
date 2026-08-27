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
   public static final BiConsumer<eji, List<? extends bki>> b = ($$0, $$1) -> {
   };
   private static final dku<bki, ?> c = new dku<bki, bki>() {
      public bki a(bki $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bki> a() {
         return bki.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<bki> g;
   private final cl.c h;
   private final Function<eji, eji> i;
   @Nullable
   private final ejd j;
   private final BiConsumer<eji, List<? extends bki>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dku<bki, ?> o;
   private final boolean p;

   public ge(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bki> $$3,
      cl.c $$4,
      Function<eji, eji> $$5,
      @Nullable ejd $$6,
      BiConsumer<eji, List<? extends bki>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bkm<?> $$11,
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
      this.o = (dku<bki, ?>)($$11 == null ? c : $$11);
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

   public bki a(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bki> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eg.d.create();
      } else if ($$1.size() > 1) {
         throw eg.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bki> b(du $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ag().a($$0.w())).toList();
   }

   private List<? extends bki> f(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         amb $$1 = $$0.m().ac().a(this.m);
         return (List<? extends bki>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new amb[]{$$1}));
      } else if (this.n != null) {
         for (ama $$2 : $$0.m().F()) {
            bki $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new bki[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         eji $$4 = this.i.apply($$0.e());
         Predicate<bki> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends bki>)($$0.g() != null && $$5.test($$0.g()) ? Lists.newArrayList(new bki[]{$$0.g()}) : Collections.emptyList());
         } else {
            List<bki> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.f(), $$4, $$5);
            } else {
               for (ama $$7 : $$0.m().F()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bki> $$0, ama $$1, eji $$2, Predicate<bki> $$3) {
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

   public amb c(du $$0) throws CommandSyntaxException {
      this.e($$0);
      List<amb> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eg.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<amb> d(du $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         amb $$1 = $$0.m().ac().a(this.m);
         return (List<amb>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new amb[]{$$1}));
      } else if (this.n != null) {
         amb $$2 = $$0.m().ac().a(this.n);
         return (List<amb>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new amb[]{$$2}));
      } else {
         eji $$3 = this.i.apply($$0.e());
         Predicate<bki> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.g() instanceof amb $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new amb[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<amb> $$7;
            if (this.d()) {
               $$7 = $$0.f().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (amb $$9 : $$0.m().ac().t()) {
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

   private Predicate<bki> a(eji $$0) {
      Predicate<bki> $$1 = this.g;
      if (this.j != null) {
         ejd $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cG()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.e($$0)));
      }

      return $$1;
   }

   private <T extends bki> List<T> a(eji $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static ur a(List<? extends bki> $$0) {
      return uu.b($$0, bki::O_);
   }
}
