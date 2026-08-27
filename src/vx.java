import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record vx(List<wc> d) {
   public static final Codec<vx> a = wc.a.listOf().xmap(vx::new, vx::a);
   public static vx b = new vx(List.of());
   public static final int c = 20;

   public void a(awt.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (wc $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public vx.a a(wd $$0) {
      return new vx.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<wc> a() {
      return this.d;
   }

   public static record a(List<wc.a> b) {
      public static final vx.a a = new vx.a(List.of());

      public a(uq $$0) {
         this($$0.a(uq.a(ArrayList::new, 20), wc.a::a));
      }

      public void a(uq $$0) {
         $$0.a(this.b, wc.a::a);
      }

      public Optional<vx> a(wd $$0) {
         List<wc> $$1 = new ArrayList<>(this.b.size());

         for (wc.a $$2 : this.b) {
            Optional<wc> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new vx($$1));
      }

      public List<wc.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(uq $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(uq $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
