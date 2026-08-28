import java.util.Optional;

public sealed interface up extends uq permits tx, us, ue, uh, uc, ua {
   byte j();

   short i();

   int h();

   long g();

   float l();

   double k();

   Number m();

   @Override
   default Optional<Number> o() {
      return Optional.of(this.m());
   }

   @Override
   default Optional<Byte> p() {
      return Optional.of(this.j());
   }

   @Override
   default Optional<Short> q() {
      return Optional.of(this.i());
   }

   @Override
   default Optional<Integer> r() {
      return Optional.of(this.h());
   }

   @Override
   default Optional<Long> s() {
      return Optional.of(this.g());
   }

   @Override
   default Optional<Float> t() {
      return Optional.of(this.l());
   }

   @Override
   default Optional<Double> u() {
      return Optional.of(this.k());
   }

   @Override
   default Optional<Boolean> v() {
      return Optional.of(this.j() != 0);
   }
}
