import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xd(List<xi> d) {
   public static final Codec<xd> a = xi.a.listOf().xmap(xd::new, xd::a);
   public static xd b = new xd(List.of());
   public static final int c = 20;

   public void a(azy.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xi $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xd.a a(xj $$0) {
      return new xd.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xi> a() {
      return this.d;
   }

   public static record a(List<xi.a> b) {
      public static final xd.a a = new xd.a(List.of());

      public a(vs $$0) {
         this($$0.a(vs.a(ArrayList::new, 20), xi.a::a));
      }

      public void a(vs $$0) {
         $$0.a(this.b, xi.a::a);
      }

      public Optional<xd> a(xj $$0) {
         List<xi> $$1 = new ArrayList<>(this.b.size());

         for (xi.a $$2 : this.b) {
            Optional<xi> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xd($$1));
      }

      public List<xi.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vs $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vs $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
