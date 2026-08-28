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

public interface fuw extends fux {
   List<? extends fux> aE_();

   default Optional<fux> d(double $$0, double $$1) {
      for (fux $$2 : this.aE_()) {
         if ($$2.a_($$0, $$1)) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean a(double $$0, double $$1, int $$2) {
      Optional<fux> $$3 = this.d($$0, $$1);
      if ($$3.isEmpty()) {
         return false;
      } else {
         fux $$4 = $$3.get();
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
   fux aI_();

   void a(@Nullable fux var1);

   @Override
   default void a(boolean $$0) {
   }

   @Override
   default boolean aJ_() {
      return this.aI_() != null;
   }

   @Nullable
   @Override
   default fsj aK_() {
      fux $$0 = this.aI_();
      return $$0 != null ? fsj.a(this, $$0.aK_()) : null;
   }

   @Nullable
   @Override
   default fsj a(fxd $$0) {
      fux $$1 = this.aI_();
      if ($$1 != null) {
         fsj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return fsj.a(this, $$2);
         }
      }

      if ($$0 instanceof fxd.c $$3) {
         return this.a($$3);
      } else {
         return $$0 instanceof fxd.a $$4 ? this.a($$4) : null;
      }
   }

   @Nullable
   private fsj a(fxd.c $$0) {
      boolean $$1 = $$0.b();
      fux $$2 = this.aI_();
      List<? extends fux> $$3 = new ArrayList<>(this.aE_());
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

      ListIterator<? extends fux> $$8 = $$3.listIterator($$5);
      BooleanSupplier $$9 = $$1 ? $$8::hasNext : $$8::hasPrevious;
      Supplier<? extends fux> $$10 = $$1 ? $$8::next : $$8::previous;

      while ($$9.getAsBoolean()) {
         fux $$11 = $$10.get();
         fsj $$12 = $$11.a($$0);
         if ($$12 != null) {
            return fsj.a(this, $$12);
         }
      }

      return null;
   }

   @Nullable
   private fsj a(fxd.a $$0) {
      fux $$1 = this.aI_();
      if ($$1 == null) {
         fxf $$2 = $$0.b();
         fxh $$3 = this.b($$2.b());
         return fsj.a(this, this.a($$3, $$2, null, $$0));
      } else {
         fxh $$4 = $$1.J();
         return fsj.a(this, this.a($$4, $$0.b(), $$1, $$0));
      }
   }

   @Nullable
   private fsj a(fxh $$0, fxf $$1, @Nullable fux $$2, fxd $$3) {
      fxe $$4 = $$1.a();
      fxe $$5 = $$4.a();
      fxf $$6 = $$5.b();
      int $$7 = $$0.b($$1.b());
      List<fux> $$8 = new ArrayList<>();

      for (fux $$9 : this.aE_()) {
         if ($$9 != $$2) {
            fxh $$10 = $$9.J();
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

      Comparator<fux> $$12 = Comparator.comparing($$1x -> $$1x.J().b($$1.b()), $$1.d());
      Comparator<fux> $$13 = Comparator.comparing($$1x -> $$1x.J().b($$6.b()), $$6.d());
      $$8.sort($$12.thenComparing($$13));

      for (fux $$14 : $$8) {
         fsj $$15 = $$14.a($$3);
         if ($$15 != null) {
            return $$15;
         }
      }

      return this.b($$0, $$1, $$2, $$3);
   }

   @Nullable
   private fsj b(fxh $$0, fxf $$1, @Nullable fux $$2, fxd $$3) {
      fxe $$4 = $$1.a();
      fxe $$5 = $$4.a();
      List<Pair<fux, Long>> $$6 = new ArrayList<>();
      fxg $$7 = fxg.a($$4, $$0.b($$1), $$0.b($$5));

      for (fux $$8 : this.aE_()) {
         if ($$8 != $$2) {
            fxh $$9 = $$8.J();
            fxg $$10 = fxg.a($$4, $$9.b($$1.b()), $$9.b($$5));
            if ($$1.a($$10.a($$4), $$7.a($$4))) {
               long $$11 = Vector2i.distanceSquared($$7.a(), $$7.b(), $$10.a(), $$10.b());
               $$6.add(Pair.of($$8, $$11));
            }
         }
      }

      $$6.sort(Comparator.comparingDouble(Pair::getSecond));

      for (Pair<fux, Long> $$12 : $$6) {
         fsj $$13 = ((fux)$$12.getFirst()).a($$3);
         if ($$13 != null) {
            return $$13;
         }
      }

      return null;
   }
}
