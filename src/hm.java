import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class hm {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<fba, List<? extends buk>> b = ($$0, $$1) -> {
   };
   private static final ebh<buk, ?> c = new ebh<buk, buk>() {
      public buk a(buk $$0) {
         return $$0;
      }

      @Override
      public Class<? extends buk> a() {
         return buk.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final List<Predicate<buk>> g;
   private final dk.c h;
   private final Function<fba, fba> i;
   @Nullable
   private final fav j;
   private final BiConsumer<fba, List<? extends buk>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final ebh<buk, ?> o;
   private final boolean p;

   public hm(
      int $$0,
      boolean $$1,
      boolean $$2,
      List<Predicate<buk>> $$3,
      dk.c $$4,
      Function<fba, fba> $$5,
      @Nullable fav $$6,
      BiConsumer<fba, List<? extends buk>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bur<?> $$11,
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
      this.o = (ebh<buk, ?>)($$11 == null ? c : $$11);
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

   private void e(ex $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw fk.f.create();
      }
   }

   public buk a(ex $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends buk> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw fk.d.create();
      } else if ($$1.size() > 1) {
         throw fk.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends buk> b(ex $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         ard $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         for (arc $$2 : $$0.l().L()) {
            buk $$3 = $$2.a(this.n);
            if ($$3 != null) {
               if ($$3.aq().a($$0.v())) {
                  return List.of($$3);
               }
               break;
            }
         }

         return List.of();
      } else {
         fba $$4 = this.i.apply($$0.d());
         fav $$5 = this.a($$4);
         if (this.l) {
            Predicate<buk> $$6 = this.a($$4, $$5, null);
            return $$0.f() != null && $$6.test($$0.f()) ? List.of($$0.f()) : List.of();
         } else {
            Predicate<buk> $$7 = this.a($$4, $$5, $$0.v());
            List<buk> $$8 = new ObjectArrayList();
            if (this.d()) {
               this.a($$8, $$0.e(), $$5, $$7);
            } else {
               for (arc $$9 : $$0.l().L()) {
                  this.a($$8, $$9, $$5, $$7);
               }
            }

            return this.a($$4, $$8);
         }
      }
   }

   private void a(List<buk> $$0, arc $$1, @Nullable fav $$2, Predicate<buk> $$3) {
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

   public ard c(ex $$0) throws CommandSyntaxException {
      this.e($$0);
      List<ard> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw fk.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<ard> d(ex $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         ard $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         ard $$2 = $$0.l().ag().a(this.n);
         return $$2 == null ? List.of() : List.of($$2);
      } else {
         fba $$3 = this.i.apply($$0.d());
         fav $$4 = this.a($$3);
         Predicate<buk> $$5 = this.a($$3, $$4, null);
         if (this.l) {
            if ($$0.f() instanceof ard $$6 && $$5.test($$6)) {
               return List.of($$6);
            }

            return List.of();
         } else {
            int $$7 = this.f();
            List<ard> $$8;
            if (this.d()) {
               $$8 = $$0.e().a($$5, $$7);
            } else {
               $$8 = new ObjectArrayList();

               for (ard $$10 : $$0.l().ag().t()) {
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
   private fav a(fba $$0) {
      return this.j != null ? this.j.c($$0) : null;
   }

   private Predicate<buk> a(fba $$0, @Nullable fav $$1, @Nullable crt $$2) {
      boolean $$3 = $$2 != null;
      boolean $$4 = $$1 != null;
      boolean $$5 = !this.h.c();
      int $$6 = ($$3 ? 1 : 0) + ($$4 ? 1 : 0) + ($$5 ? 1 : 0);
      List<Predicate<buk>> $$7;
      if ($$6 == 0) {
         $$7 = this.g;
      } else {
         List<Predicate<buk>> $$8 = new ObjectArrayList(this.g.size() + $$6);
         $$8.addAll(this.g);
         if ($$3) {
            $$8.add($$1x -> $$1x.aq().a($$2));
         }

         if ($$4) {
            $$8.add($$1x -> $$1.c($$1x.cR()));
         }

         if ($$5) {
            $$8.add($$1x -> this.h.e($$1x.f($$0)));
         }

         $$7 = $$8;
      }

      return af.a($$7);
   }

   private <T extends buk> List<T> a(fba $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wo a(List<? extends buk> $$0) {
      return wr.b($$0, buk::p_);
   }
}
