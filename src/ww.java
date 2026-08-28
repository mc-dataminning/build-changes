import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record ww(List<xb> d) {
   public static final Codec<ww> a = xb.a.listOf().xmap(ww::new, ww::a);
   public static ww b = new ww(List.of());
   public static final int c = 20;

   public void a(azl.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xb $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public ww.a a(xc $$0) {
      return new ww.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xb> a() {
      return this.d;
   }

   public static record a(List<xb.a> b) {
      public static final ww.a a = new ww.a(List.of());

      public a(vl $$0) {
         this($$0.a(vl.a(ArrayList::new, 20), xb.a::a));
      }

      public void a(vl $$0) {
         $$0.a(this.b, xb.a::a);
      }

      public Optional<ww> a(xc $$0) {
         List<xb> $$1 = new ArrayList<>(this.b.size());

         for (xb.a $$2 : this.b) {
            Optional<xb> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new ww($$1));
      }

      public List<xb.a> a() {
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
