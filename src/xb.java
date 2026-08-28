import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xb(List<xg> d) {
   public static final Codec<xb> a = xg.a.listOf().xmap(xb::new, xb::a);
   public static xb b = new xb(List.of());
   public static final int c = 20;

   public void a(ayq.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xg $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xb.a a(xh $$0) {
      return new xb.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xg> a() {
      return this.d;
   }

   public static record a(List<xg.a> b) {
      public static final xb.a a = new xb.a(List.of());

      public a(vr $$0) {
         this($$0.a(vr.a(ArrayList::new, 20), xg.a::a));
      }

      public void a(vr $$0) {
         $$0.a(this.b, xg.a::a);
      }

      public Optional<xb> a(xh $$0) {
         List<xg> $$1 = new ArrayList<>(this.b.size());

         for (xg.a $$2 : this.b) {
            Optional<xg> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xb($$1));
      }

      public List<xg.a> a() {
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
