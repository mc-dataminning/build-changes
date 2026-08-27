import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record vc(List<vh> d) {
   public static final Codec<vc> a = vh.a.listOf().xmap(vc::new, vc::a);
   public static vc b = new vc(List.of());
   public static final int c = 20;

   public void a(aub.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (vh $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public vc.a a(vi $$0) {
      return new vc.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<vh> a() {
      return this.d;
   }

   public static record a(List<vh.a> b) {
      public static final vc.a a = new vc.a(List.of());

      public a(ty $$0) {
         this($$0.a(ty.a(ArrayList::new, 20), vh.a::a));
      }

      public void a(ty $$0) {
         $$0.a(this.b, vh.a::a);
      }

      public Optional<vc> a(vi $$0) {
         List<vh> $$1 = new ArrayList<>(this.b.size());

         for (vh.a $$2 : this.b) {
            Optional<vh> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new vc($$1));
      }

      public List<vh.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(ty $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(ty $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
