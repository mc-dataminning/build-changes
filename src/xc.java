import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xc(List<xh> d) {
   public static final Codec<xc> a = xh.a.listOf().xmap(xc::new, xc::a);
   public static xc b = new xc(List.of());
   public static final int c = 20;

   public void a(azw.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xh $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xc.a a(xi $$0) {
      return new xc.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xh> a() {
      return this.d;
   }

   public static record a(List<xh.a> b) {
      public static final xc.a a = new xc.a(List.of());

      public a(vr $$0) {
         this($$0.a(vr.a(ArrayList::new, 20), xh.a::a));
      }

      public void a(vr $$0) {
         $$0.a(this.b, xh.a::a);
      }

      public Optional<xc> a(xi $$0) {
         List<xh> $$1 = new ArrayList<>(this.b.size());

         for (xh.a $$2 : this.b) {
            Optional<xh> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xc($$1));
      }

      public List<xh.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vr $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vr $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
