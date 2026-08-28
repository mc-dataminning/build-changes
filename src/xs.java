import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xs(List<xx> d) {
   public static final Codec<xs> a = xx.a.listOf().xmap(xs::new, xs::a);
   public static xs b = new xs(List.of());
   public static final int c = 20;

   public void a(azz.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xx $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xs.a a(xy $$0) {
      return new xs.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xx> a() {
      return this.d;
   }

   public static record a(List<xx.a> b) {
      public static final xs.a a = new xs.a(List.of());

      public a(wi $$0) {
         this($$0.a(wi.a(ArrayList::new, 20), xx.a::a));
      }

      public void a(wi $$0) {
         $$0.a(this.b, xx.a::a);
      }

      public Optional<xs> a(xy $$0) {
         List<xx> $$1 = new ArrayList<>(this.b.size());

         for (xx.a $$2 : this.b) {
            Optional<xx> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xs($$1));
      }

      public List<xx.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wi $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wi $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
