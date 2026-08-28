import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xl(List<xq> d) {
   public static final Codec<xl> a = xq.a.listOf().xmap(xl::new, xl::a);
   public static xl b = new xl(List.of());
   public static final int c = 20;

   public void a(azr.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xq $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xl.a a(xr $$0) {
      return new xl.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xq> a() {
      return this.d;
   }

   public static record a(List<xq.a> b) {
      public static final xl.a a = new xl.a(List.of());

      public a(wb $$0) {
         this($$0.a(wb.a(ArrayList::new, 20), xq.a::a));
      }

      public void a(wb $$0) {
         $$0.a(this.b, xq.a::a);
      }

      public Optional<xl> a(xr $$0) {
         List<xq> $$1 = new ArrayList<>(this.b.size());

         for (xq.a $$2 : this.b) {
            Optional<xq> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xl($$1));
      }

      public List<xq.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wb $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wb $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
