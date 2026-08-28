import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xf(List<xk> d) {
   public static final Codec<xf> a = xk.a.listOf().xmap(xf::new, xf::a);
   public static xf b = new xf(List.of());
   public static final int c = 20;

   public void a(baa.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xk $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xf.a a(xl $$0) {
      return new xf.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xk> a() {
      return this.d;
   }

   public static record a(List<xk.a> b) {
      public static final xf.a a = new xf.a(List.of());

      public a(vu $$0) {
         this($$0.a(vu.a(ArrayList::new, 20), xk.a::a));
      }

      public void a(vu $$0) {
         $$0.a(this.b, xk.a::a);
      }

      public Optional<xf> a(xl $$0) {
         List<xk> $$1 = new ArrayList<>(this.b.size());

         for (xk.a $$2 : this.b) {
            Optional<xk> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xf($$1));
      }

      public List<xk.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vu $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vu $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
