import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xn(List<xs> d) {
   public static final Codec<xn> a = xs.a.listOf().xmap(xn::new, xn::b);
   public static xn b = new xn(List.of());
   public static final int c = 20;

   public void a(ban.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xs $$1 : this.d) {
         $$0.update($$1.c());
      }
   }

   public xn.a a(xt $$0) {
      return new xn.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public byte a() {
      int $$0 = 1;

      for (xs $$1 : this.d) {
         $$0 = 31 * $$0 + $$1.b();
      }

      byte $$2 = (byte)$$0;
      return $$2 == 0 ? 1 : $$2;
   }

   public List<xs> b() {
      return this.d;
   }

   public static record a(List<xs.a> b) {
      public static final xn.a a = new xn.a(List.of());

      public a(vy $$0) {
         this($$0.a(vy.a(ArrayList::new, 20), xs.a::a));
      }

      public void a(vy $$0) {
         $$0.a(this.b, xs.a::a);
      }

      public Optional<xn> a(xt $$0) {
         List<xs> $$1 = new ArrayList<>(this.b.size());

         for (xs.a $$2 : this.b) {
            Optional<xs> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xn($$1));
      }

      public List<xs.a> a() {
         return this.b;
      }
   }

   public static record b(int b, BitSet c, byte d) {
      public static final byte a = 0;

      public b(vy $$0) {
         this($$0.l(), $$0.e(20), $$0.readByte());
      }

      public void a(vy $$0) {
         $$0.c(this.b);
         $$0.a(this.c, 20);
         $$0.l(this.d);
      }

      public boolean a(xn $$0) {
         return this.d == 0 || this.d == $$0.a();
      }

      public int a() {
         return this.b;
      }

      public BitSet b() {
         return this.c;
      }

      public byte c() {
         return this.d;
      }
   }
}
