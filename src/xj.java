import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xj(List<xo> d) {
   public static final Codec<xj> a = xo.a.listOf().xmap(xj::new, xj::a);
   public static xj b = new xj(List.of());
   public static final int c = 20;

   public void a(bae.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xo $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xj.a a(xp $$0) {
      return new xj.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xo> a() {
      return this.d;
   }

   public static record a(List<xo.a> b) {
      public static final xj.a a = new xj.a(List.of());

      public a(vy $$0) {
         this($$0.a(vy.a(ArrayList::new, 20), xo.a::a));
      }

      public void a(vy $$0) {
         $$0.a(this.b, xo.a::a);
      }

      public Optional<xj> a(xp $$0) {
         List<xo> $$1 = new ArrayList<>(this.b.size());

         for (xo.a $$2 : this.b) {
            Optional<xo> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xj($$1));
      }

      public List<xo.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vy $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vy $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
