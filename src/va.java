import java.io.DataOutput;
import java.io.IOException;
import java.util.Optional;

public sealed interface va permits ua, tz, ur, uc {
   int d = 8;
   int e = 12;
   int f = 4;
   int g = 28;
   byte h = 0;
   byte i = 1;
   byte j = 2;
   byte k = 3;
   byte l = 4;
   byte m = 5;
   byte n = 6;
   byte o = 7;
   byte p = 8;
   byte q = 9;
   byte r = 10;
   byte s = 11;
   byte t = 12;
   int u = 512;

   void a(DataOutput var1) throws IOException;

   @Override
   String toString();

   byte b();

   vc<?> c();

   va d();

   int a();

   void a(ve var1);

   ux.b a(ux var1);

   default void b(ux $$0) {
      ux.b $$1 = $$0.b(this.c());
      if ($$1 == ux.b.a) {
         this.a($$0);
      }
   }

   default Optional<String> p_() {
      return Optional.empty();
   }

   default Optional<Number> o() {
      return Optional.empty();
   }

   default Optional<Byte> p() {
      return this.o().map(Number::byteValue);
   }

   default Optional<Short> q() {
      return this.o().map(Number::shortValue);
   }

   default Optional<Integer> r() {
      return this.o().map(Number::intValue);
   }

   default Optional<Long> s() {
      return this.o().map(Number::longValue);
   }

   default Optional<Float> t() {
      return this.o().map(Number::floatValue);
   }

   default Optional<Double> u() {
      return this.o().map(Number::doubleValue);
   }

   default Optional<Boolean> v() {
      return this.p().map($$0 -> $$0 != 0);
   }

   default Optional<byte[]> f() {
      return Optional.empty();
   }

   default Optional<int[]> q_() {
      return Optional.empty();
   }

   default Optional<long[]> r_() {
      return Optional.empty();
   }

   default Optional<ua> s_() {
      return Optional.empty();
   }

   default Optional<ug> t_() {
      return Optional.empty();
   }
}
