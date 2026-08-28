import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xk(List<xp> d) {
   public static final Codec<xk> a = xp.a.listOf().xmap(xk::new, xk::a);
   public static xk b = new xk(List.of());
   public static final int c = 20;

   public void a(azp.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xp $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xk.a a(xq $$0) {
      return new xk.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xp> a() {
      return this.d;
   }

   public static record a(List<xp.a> b) {
      public static final xk.a a = new xk.a(List.of());

      public a(wa $$0) {
         this($$0.a(wa.a(ArrayList::new, 20), xp.a::a));
      }

      public void a(wa $$0) {
         $$0.a(this.b, xp.a::a);
      }

      public Optional<xk> a(xq $$0) {
         List<xp> $$1 = new ArrayList<>(this.b.size());

         for (xp.a $$2 : this.b) {
            Optional<xp> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xk($$1));
      }

      public List<xp.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wa $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wa $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
