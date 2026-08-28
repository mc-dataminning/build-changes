import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hi {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<exc, List<? extends bsr>> b = ($$0, $$1) -> {
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
   private final List<Predicate<bsr>> g;
   private final dh.c h;
   private final Function<exc, exc> i;
   @Nullable
   private final ewx j;
   private final BiConsumer<exc, List<? extends bsr>> k;
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
      List<Predicate<bsr>> $$3,
      dh.c $$4,
      Function<exc, exc> $$5,
      @Nullable ewx $$6,
      BiConsumer<exc, List<? extends bsr>> $$7,
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
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aqv $$1 = $$0.l().ah().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         for (aqu $$2 : $$0.l().K()) {
            bsr $$3 = $$2.a(this.n);
            if ($$3 != null) {
               if ($$3.am().a($$0.w())) {
                  return List.of($$3);
               }
               break;
            }
         }

         return List.of();
      } else {
         exc $$4 = this.i.apply($$0.d());
         ewx $$5 = this.a($$4);
         if (this.l) {
            Predicate<bsr> $$6 = this.a($$4, $$5, null);
            return $$0.f() != null && $$6.test($$0.f()) ? List.of($$0.f()) : List.of();
         } else {
            Predicate<bsr> $$7 = this.a($$4, $$5, $$0.w());
            List<bsr> $$8 = new ObjectArrayList();
            if (this.d()) {
               this.a($$8, $$0.e(), $$5, $$7);
            } else {
               for (aqu $$9 : $$0.l().K()) {
                  this.a($$8, $$9, $$5, $$7);
               }
            }

            return this.a($$4, $$8);
         }
      }
   }

   private void a(List<bsr> $$0, aqu $$1, @Nullable ewx $$2, Predicate<bsr> $$3) {
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
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         aqv $$2 = $$0.l().ah().a(this.n);
         return $$2 == null ? List.of() : List.of($$2);
      } else {
         exc $$3 = this.i.apply($$0.d());
         ewx $$4 = this.a($$3);
         Predicate<bsr> $$5 = this.a($$3, $$4, null);
         if (this.l) {
            if ($$0.f() instanceof aqv $$6 && $$5.test($$6)) {
               return List.of($$6);
            }

            return List.of();
         } else {
            int $$7 = this.f();
            List<aqv> $$8;
            if (this.d()) {
               $$8 = $$0.e().a($$5, $$7);
            } else {
               $$8 = new ObjectArrayList();

               for (aqv $$10 : $$0.l().ah().t()) {
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
   private ewx a(exc $$0) {
      return this.j != null ? this.j.c($$0) : null;
   }

   private Predicate<bsr> a(exc $$0, @Nullable ewx $$1, @Nullable cpl $$2) {
      boolean $$3 = $$2 != null;
      boolean $$4 = $$1 != null;
      boolean $$5 = !this.h.c();
      int $$6 = ($$3 ? 1 : 0) + ($$4 ? 1 : 0) + ($$5 ? 1 : 0);
      List<Predicate<bsr>> $$7;
      if ($$6 == 0) {
         $$7 = this.g;
      } else {
         List<Predicate<bsr>> $$8 = new ObjectArrayList(this.g.size() + $$6);
         $$8.addAll(this.g);
         if ($$3) {
            $$8.add($$1x -> $$1x.am().a($$2));
         }

         if ($$4) {
            $$8.add($$1x -> $$1.c($$1x.cK()));
         }

         if ($$5) {
            $$8.add($$1x -> this.h.e($$1x.g($$0)));
         }

         $$7 = $$8;
      }

      return ad.a($$7);
   }

   private <T extends bsr> List<T> a(exc $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wz a(List<? extends bsr> $$0) {
      return xc.b($$0, bsr::S_);
   }
}
