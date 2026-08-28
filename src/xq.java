import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xq(List<xv> d) {
   public static final Codec<xq> a = xv.a.listOf().xmap(xq::new, xq::a);
   public static xq b = new xq(List.of());
   public static final int c = 20;

   public void a(azy.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xv $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xq.a a(xw $$0) {
      return new xq.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xv> a() {
      return this.d;
   }

   public static record a(List<xv.a> b) {
      public static final xq.a a = new xq.a(List.of());

      public a(wg $$0) {
         this($$0.a(wg.a(ArrayList::new, 20), xv.a::a));
      }

      public void a(wg $$0) {
         $$0.a(this.b, xv.a::a);
      }

      public Optional<xq> a(xw $$0) {
         List<xv> $$1 = new ArrayList<>(this.b.size());

         for (xv.a $$2 : this.b) {
            Optional<xv> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xq($$1));
      }

      public List<xv.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wg $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wg $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
