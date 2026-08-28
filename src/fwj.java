import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector2i;

public interface fwj extends fwk {
   List<? extends fwk> aI_();

   default Optional<fwk> d(double $$0, double $$1) {
      for (fwk $$2 : this.aI_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<fwk> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         fwk $$4 = $$3.get();
         if ($$4.a($$0, $$1, $$2)) {
            this.a($$4);
            if ($$2 == 0) {
               this.b_(true);
            }
         }

         return true;
      }
   }

   @Override
   default boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0 && this.aL_()) {
         this.b_(false);
         if (this.aM_() != null) {
            return this.aM_().b($$0, $$1, $$2);
         }
      }

      return false;
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aM_() != null && this.aL_() && $$2 == 0 ? this.aM_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aL_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.d($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aM_() != null && this.aM_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aM_() != null && this.aM_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aM_() != null && this.aM_().a($$0, $$1);
   }

   @Nullable
   fwk aM_();

   void a(@Nullable fwk var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aN_() {
      return this.aM_() != null;
   }

   @Nullable
   @Override
   default ftw aO_() {
      fwk $$0 = this.aM_();
      return $$0 != null ? ftw.a(this, $$0.aO_()) : null;
   }

   @Nullable
   @Override
   default ftw a(fyq $$0) {
      fwk $$1 = this.aM_();
      if ($$1 != null) {
         ftw $$2 = $$1.a($$0);
         if ($$2 != null) {
            return ftw.a(this, $$2);
         }
      }

      if ($$0 instanceof fyq.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fyq.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private ftw a(fyq.c $$0) {
      boolean $$1 = $$0.b();
      fwk $$2 = this.aM_();
      List<? extends fwk> $$3 = new ArrayList<>(this.aI_());
      Collections.sort($$3, Comparator.comparingInt($$0x -> $$0x.K()));
      int $$4 = $$3.indexOf($$2);
      int $$5;
      if ($$2 != null && $$4 >= 0) {
         $$5 = $$4 + ($$1 ? 1 : 0);
      } else if ($$1) {
         $$5 = 0;
      } else {
         $$5 = $$3.size();
      }

      ListIterator<? extends fwk> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fwk> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fwk $$11 = $$10.get();
         ftw $$12 = $$11.a($$0);
         if ($$12 != null) {
            return ftw.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private ftw a(fyq.a $$0) {
      fwk $$1 = this.aM_();
      if ($$1 == null) {
         fys $$2 = $$0.b();
         fyu $$3 = this.b($$2.b());
         return ftw.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fyu $$4 = $$1.J();
         return ftw.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private ftw a(fyu $$0, fys $$1, @Nullable fwk $$2, fyq $$3) {
      fyr $$4 = $$1.a();
      fyr $$5 = $$4.a();
      fys $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fwk> $$8 = new ArrayList<>();

      for (fwk $$9 : this.aI_()) {
         if ($$9 != $$2) {
            fyu $$10 = $$9.J();
            if ($$10.a($$0, $$5)) {
               int $$11 = $$10.b($$1.b());
               if ($$1.a($$11, $$7)) {
                  $$8.add($$9);
               } else if ($$11 == $$7 && $$1.a($$10.b($$1), $$0.b($$1))) {
                  $$8.add($$9);
               }
            }
         }
      }

      Comparator<fwk> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<fwk> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fwk $$14 : $$8) {
         ftw $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private ftw b(fyu $$0, fys $$1, @Nullable fwk $$2, fyq $$3) {
      fyr $$4 = $$1.a();
      fyr $$5 = $$4.a();
      List<Pair<fwk, Long>> $$6 = new ArrayList<>();
      fyt $$7 = fyt.a($$4, $$0.b($$1), $$0.b($$5));

      for (fwk $$8 : this.aI_()) {
         if ($$8 != $$2) {
            fyu $$9 = $$8.J();
            fyt $$10 = fyt.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fwk, Long> $$12 : $$6) {
         ftw $$13 = ((fwk)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
