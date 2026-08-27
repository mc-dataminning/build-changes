import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record tc(List<th> d) {
   public static final Codec<tc> a = th.a.listOf().xmap(tc::new, tc::a);
   public static tc b = new tc(List.of());
   public static final int c = 20;

   public void a(api.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (th $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public tc.a a(ti $$0) {
      return new tc.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<th> a() {
      return this.d;
   }

   public static record a(List<th.a> b) {
      public static final tc.a a = new tc.a(List.of());

      public a(sf $$0) {
         this($$0.a(sf.a(ArrayList::new, 20), th.a::a));
      }

      public void a(sf $$0) {
         $$0.a(this.b, th.a::a);
      }

      public Optional<tc> a(ti $$0) {
         List<th> $$1 = new ArrayList<>(this.b.size());

         for (th.a $$2 : this.b) {
            Optional<th> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new tc($$1));
      }

      public List<th.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(sf $$0) {
         this($$0.m(), $$0.f(20));
      }

      public void a(sf $$0) {
         $$0.d(this.a);
         $$0.a(this.b, 20);
      }
   }
}
