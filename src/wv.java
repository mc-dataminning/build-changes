import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record wv(List<xa> d) {
   public static final Codec<wv> a = xa.a.listOf().xmap(wv::new, wv::a);
   public static wv b = new wv(List.of());
   public static final int c = 20;

   public void a(azk.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xa $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public wv.a a(xb $$0) {
      return new wv.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xa> a() {
      return this.d;
   }

   public static record a(List<xa.a> b) {
      public static final wv.a a = new wv.a(List.of());

      public a(vl $$0) {
         this($$0.a(vl.a(ArrayList::new, 20), xa.a::a));
      }

      public void a(vl $$0) {
         $$0.a(this.b, xa.a::a);
      }

      public Optional<wv> a(xb $$0) {
         List<xa> $$1 = new ArrayList<>(this.b.size());

         for (xa.a $$2 : this.b) {
            Optional<xa> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new wv($$1));
      }

      public List<xa.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vl $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vl $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
