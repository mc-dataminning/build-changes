import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hk {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<ezh, List<? extends btz>> b = ($$0, $$1) -> {
   };
   private static final dzo<btz, ?> c = new dzo<btz, btz>() {
      public btz a(btz $$0) {
         return $$0;
      }

      @Override
      public Class<? extends btz> a() {
         return btz.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final List<Predicate<btz>> g;
   private final di.c h;
   private final Function<ezh, ezh> i;
   @Nullable
   private final ezc j;
   private final BiConsumer<ezh, List<? extends btz>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final dzo<btz, ?> o;
   private final boolean p;

   public hk(
      int $$0,
      boolean $$1,
      boolean $$2,
      List<Predicate<btz>> $$3,
      di.c $$4,
      Function<ezh, ezh> $$5,
      @Nullable ezc $$6,
      BiConsumer<ezh, List<? extends btz>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bug<?> $$11,
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
      this.o = (dzo<btz, ?>)($$11 == null ? c : $$11);
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

   private void e(ev $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw fi.f.create();
      }
   }

   public btz a(ev $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends btz> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fi.d.create();
      } else if ($$1.size() > 1) {
         throw fi.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends btz> b(ev $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         arn $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         for (arm $$2 : $$0.l().L()) {
            btz $$3 = $$2.a(this.n);
            if ($$3 != null) {
               if ($$3.aq().a($$0.w())) {
                  return List.of($$3);
               }
               break;
            }
         }

         return List.of();
      } else {
         ezh $$4 = this.i.apply($$0.d());
         ezc $$5 = this.a($$4);
         if (this.l) {
            Predicate<btz> $$6 = this.a($$4, $$5, null);
            return $$0.f() != null && $$6.test($$0.f()) ? List.of($$0.f()) : List.of();
         } else {
            Predicate<btz> $$7 = this.a($$4, $$5, $$0.w());
            List<btz> $$8 = new ObjectArrayList();
            if (this.d()) {
               this.a($$8, $$0.e(), $$5, $$7);
            } else {
               for (arm $$9 : $$0.l().L()) {
                  this.a($$8, $$9, $$5, $$7);
               }
            }

            return this.a($$4, $$8);
         }
      }
   }

   private void a(List<btz> $$0, arm $$1, @Nullable ezc $$2, Predicate<btz> $$3) {
      int $$4 = this.f();
      if ($$0.size() < $$4) {
         if ($$2 != null) {
            $$1.a(this.o, $$2, $$3, $$0, $$4);
         } else {
            $$1.a(this.o, $$3, $$0, $$4);
         }
      }
   }

   private int f() {
      return this.k == b ? this.d : Integer.MAX_VALUE;
   }

   public arn c(ev $$0) throws CommandSyntaxException {
      this.e($$0);
      List<arn> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fi.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<arn> d(ev $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         arn $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         arn $$2 = $$0.l().ag().a(this.n);
         return $$2 == null ? List.of() : List.of($$2);
      } else {
         ezh $$3 = this.i.apply($$0.d());
         ezc $$4 = this.a($$3);
         Predicate<btz> $$5 = this.a($$3, $$4, null);
         if (this.l) {
            if ($$0.f() instanceof arn $$6 && $$5.test($$6)) {
               return List.of($$6);
            }

            return List.of();
         } else {
            int $$7 = this.f();
            List<arn> $$8;
            if (this.d()) {
               $$8 = $$0.e().a($$5, $$7);
            } else {
               $$8 = new ObjectArrayList();

               for (arn $$10 : $$0.l().ag().t()) {
                  if ($$5.test($$10)) {
                     $$8.add($$10);
                     if ($$8.size() >= $$7) {
                        return $$8;
                     }
                  }
               }
            }

            return this.a($$3, $$8);
         }
      }
   }

   @Nullable
   private ezc a(ezh $$0) {
      return this.j != null ? this.j.c($$0) : null;
   }

   private Predicate<btz> a(ezh $$0, @Nullable ezc $$1, @Nullable cra $$2) {
      boolean $$3 = $$2 != null;
      boolean $$4 = $$1 != null;
      boolean $$5 = !this.h.c();
      int $$6 = ($$3 ? 1 : 0) + ($$4 ? 1 : 0) + ($$5 ? 1 : 0);
      List<Predicate<btz>> $$7;
      if ($$6 == 0) {
         $$7 = this.g;
      } else {
         List<Predicate<btz>> $$8 = new ObjectArrayList(this.g.size() + $$6);
         $$8.addAll(this.g);
         if ($$3) {
            $$8.add($$1x -> $$1x.aq().a($$2));
         }

         if ($$4) {
            $$8.add($$1x -> $$1.c($$1x.cS()));
         }

         if ($$5) {
            $$8.add($$1x -> this.h.e($$1x.f($$0)));
         }

         $$7 = $$8;
      }

      return ad.a($$7);
   }

   private <T extends btz> List<T> a(ezh $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static xh a(List<? extends btz> $$0) {
      return xk.b($$0, btz::S_);
   }
}
