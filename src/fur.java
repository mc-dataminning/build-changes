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

public interface fur extends fus {
   List<? extends fus> aE_();

   default Optional<fus> d(double $$0, double $$1) {
      for (fus $$2 : this.aE_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<fus> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         fus $$4 = $$3.get();
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
      if ($$2 == 0 && this.aH_()) {
         this.b_(false);
         if (this.aI_() != null) {
            return this.aI_().b($$0, $$1, $$2);
         }
      }

      return false;
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return this.aI_() != null && this.aH_() && $$2 == 0 ? this.aI_().a($$0, $$1, $$2, $$3, $$4) : false;
   }

   boolean aH_();

   void b_(boolean var1);

   @Override
   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.d($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
   }

   @Override
   default boolean a(int $$0, int $$1, int $$2) {
      return this.aI_() != null && this.aI_().a($$0, $$1, $$2);
   }

   @Override
   default boolean c(int $$0, int $$1, int $$2) {
      return this.aI_() != null && this.aI_().c($$0, $$1, $$2);
   }

   @Override
   default boolean a(char $$0, int $$1) {
      return this.aI_() != null && this.aI_().a($$0, $$1);
   }

   @Nullable
   fus aI_();

   void a(@Nullable fus var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.aI_() != null;
   }

   @Nullable
   @Override
   default fse aK_() {
      fus $$0 = this.aI_();
      return $$0 != null ? fse.a(this, $$0.aK_()) : null;
   }

   @Nullable
   @Override
   default fse a(fwy $$0) {
      fus $$1 = this.aI_();
      if ($$1 != null) {
         fse $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fse.a(this, $$2);
         }
      }

      if ($$0 instanceof fwy.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fwy.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fse a(fwy.c $$0) {
      boolean $$1 = $$0.b();
      fus $$2 = this.aI_();
      List<? extends fus> $$3 = new ArrayList<>(this.aE_());
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

      ListIterator<? extends fus> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fus> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fus $$11 = $$10.get();
         fse $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fse.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fse a(fwy.a $$0) {
      fus $$1 = this.aI_();
      if ($$1 == null) {
         fxa $$2 = $$0.b();
         fxc $$3 = this.b($$2.b());
         return fse.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fxc $$4 = $$1.J();
         return fse.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fse a(fxc $$0, fxa $$1, @Nullable fus $$2, fwy $$3) {
      fwz $$4 = $$1.a();
      fwz $$5 = $$4.a();
      fxa $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fus> $$8 = new ArrayList<>();

      for (fus $$9 : this.aE_()) {
         if ($$9 != $$2) {
            fxc $$10 = $$9.J();
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

      Comparator<fus> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<fus> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fus $$14 : $$8) {
         fse $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fse b(fxc $$0, fxa $$1, @Nullable fus $$2, fwy $$3) {
      fwz $$4 = $$1.a();
      fwz $$5 = $$4.a();
      List<Pair<fus, Long>> $$6 = new ArrayList<>();
      fxb $$7 = fxb.a($$4, $$0.b($$1), $$0.b($$5));

      for (fus $$8 : this.aE_()) {
         if ($$8 != $$2) {
            fxc $$9 = $$8.J();
            fxb $$10 = fxb.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fus, Long> $$12 : $$6) {
         fse $$13 = ((fus)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
