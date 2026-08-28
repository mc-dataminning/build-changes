import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ha {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<fgc, List<? extends bxe>> b = ($$0, $$1) -> {
   };
   private static final egc<bxe, ?> c = new egc<bxe, bxe>() {
      public bxe a(bxe $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bxe> a() {
         return bxe.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final List<Predicate<bxe>> g;
   private final cx.c h;
   private final Function<fgc, fgc> i;
   @Nullable
   private final ffx j;
   private final BiConsumer<fgc, List<? extends bxe>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final egc<bxe, ?> o;
   private final boolean p;

   public ha(
      int $$0,
      boolean $$1,
      boolean $$2,
      List<Predicate<bxe>> $$3,
      cx.c $$4,
      Function<fgc, fgc> $$5,
      @Nullable ffx $$6,
      BiConsumer<fgc, List<? extends bxe>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bxn<?> $$11,
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
      this.o = (egc<bxe, ?>)($$11 == null ? c : $$11);
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

   private void e(ek $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw ex.f.create();
      }
   }

   public bxe a(ek $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bxe> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ex.d.create();
      } else if ($$1.size() > 1) {
         throw ex.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends bxe> b(ek $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         asc $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         for (asb $$2 : $$0.l().L()) {
            bxe $$3 = $$2.b(this.n);
            if ($$3 != null) {
               if ($$3.an().a($$0.v())) {
                  return List.of($$3);
               }
               break;
            }
         }

         return List.of();
      } else {
         fgc $$4 = this.i.apply($$0.d());
         ffx $$5 = this.a($$4);
         if (this.l) {
            Predicate<bxe> $$6 = this.a($$4, $$5, null);
            return $$0.f() != null && $$6.test($$0.f()) ? List.of($$0.f()) : List.of();
         } else {
            Predicate<bxe> $$7 = this.a($$4, $$5, $$0.v());
            List<bxe> $$8 = new ObjectArrayList();
            if (this.d()) {
               this.a($$8, $$0.e(), $$5, $$7);
            } else {
               for (asb $$9 : $$0.l().L()) {
                  this.a($$8, $$9, $$5, $$7);
               }
            }

            return this.a($$4, $$8);
         }
      }
   }

   private void a(List<bxe> $$0, asb $$1, @Nullable ffx $$2, Predicate<bxe> $$3) {
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

   public asc c(ek $$0) throws CommandSyntaxException {
      this.e($$0);
      List<asc> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ex.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<asc> d(ek $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         asc $$1 = $$0.l().ag().a(this.m);
         return $$1 == null ? List.of() : List.of($$1);
      } else if (this.n != null) {
         asc $$2 = $$0.l().ag().a(this.n);
         return $$2 == null ? List.of() : List.of($$2);
      } else {
         fgc $$3 = this.i.apply($$0.d());
         ffx $$4 = this.a($$3);
         Predicate<bxe> $$5 = this.a($$3, $$4, null);
         if (this.l) {
            if ($$0.f() instanceof asc $$6 && $$5.test($$6)) {
               return List.of($$6);
            }

            return List.of();
         } else {
            int $$7 = this.f();
            List<asc> $$8;
            if (this.d()) {
               $$8 = $$0.e().a($$5, $$7);
            } else {
               $$8 = new ObjectArrayList();

               for (asc $$10 : $$0.l().ag().t()) {
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
   private ffx a(fgc $$0) {
      return this.j != null ? this.j.c($$0) : null;
   }

   private Predicate<bxe> a(fgc $$0, @Nullable ffx $$1, @Nullable cvs $$2) {
      boolean $$3 = $$2 != null;
      boolean $$4 = $$1 != null;
      boolean $$5 = !this.h.c();
      int $$6 = ($$3 ? 1 : 0) + ($$4 ? 1 : 0) + ($$5 ? 1 : 0);
      List<Predicate<bxe>> $$7;
      if ($$6 == 0) {
         $$7 = this.g;
      } else {
         List<Predicate<bxe>> $$8 = new ObjectArrayList(this.g.size() + $$6);
         $$8.addAll(this.g);
         if ($$3) {
            $$8.add($$1x -> $$1x.an().a($$2));
         }

         if ($$4) {
            $$8.add($$1x -> $$1.c($$1x.cR()));
         }

         if ($$5) {
            $$8.add($$1x -> this.h.e($$1x.g($$0)));
         }

         $$7 = $$8;
      }

      return ag.a($$7);
   }

   private <T extends bxe> List<T> a(fgc $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static xg a(List<? extends bxe> $$0) {
      return xj.b($$0, bxe::m_);
   }
}
