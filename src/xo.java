import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xo(List<xt> d) {
   public static final Codec<xo> a = xt.a.listOf().xmap(xo::new, xo::a);
   public static xo b = new xo(List.of());
   public static final int c = 20;

   public void a(azv.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xt $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xo.a a(xu $$0) {
      return new xo.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xt> a() {
      return this.d;
   }

   public static record a(List<xt.a> b) {
      public static final xo.a a = new xo.a(List.of());

      public a(we $$0) {
         this($$0.a(we.a(ArrayList::new, 20), xt.a::a));
      }

      public void a(we $$0) {
         $$0.a(this.b, xt.a::a);
      }

      public Optional<xo> a(xu $$0) {
         List<xt> $$1 = new ArrayList<>(this.b.size());

         for (xt.a $$2 : this.b) {
            Optional<xt> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xo($$1));
      }

      public List<xt.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(we $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(we $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
