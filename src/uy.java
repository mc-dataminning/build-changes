import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record uy(List<vd> d) {
   public static final Codec<uy> a = vd.a.listOf().xmap(uy::new, uy::a);
   public static uy b = new uy(List.of());
   public static final int c = 20;

   public void a(ats.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (vd $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public uy.a a(ve $$0) {
      return new uy.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<vd> a() {
      return this.d;
   }

   public static record a(List<vd.a> b) {
      public static final uy.a a = new uy.a(List.of());

      public a(tu $$0) {
         this($$0.a(tu.a(ArrayList::new, 20), vd.a::a));
      }

      public void a(tu $$0) {
         $$0.a(this.b, vd.a::a);
      }

      public Optional<uy> a(ve $$0) {
         List<vd> $$1 = new ArrayList<>(this.b.size());

         for (vd.a $$2 : this.b) {
            Optional<vd> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new uy($$1));
      }

      public List<vd.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(tu $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(tu $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
