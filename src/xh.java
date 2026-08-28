import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xh(List<xm> d) {
   public static final Codec<xh> a = xm.a.listOf().xmap(xh::new, xh::a);
   public static xh b = new xh(List.of());
   public static final int c = 20;

   public void a(bac.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xm $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xh.a a(xn $$0) {
      return new xh.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xm> a() {
      return this.d;
   }

   public static record a(List<xm.a> b) {
      public static final xh.a a = new xh.a(List.of());

      public a(vw $$0) {
         this($$0.a(vw.a(ArrayList::new, 20), xm.a::a));
      }

      public void a(vw $$0) {
         $$0.a(this.b, xm.a::a);
      }

      public Optional<xh> a(xn $$0) {
         List<xm> $$1 = new ArrayList<>(this.b.size());

         for (xm.a $$2 : this.b) {
            Optional<xm> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xh($$1));
      }

      public List<xm.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vw $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vw $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
