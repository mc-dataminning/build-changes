import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record wp(List<wu> d) {
   public static final Codec<wp> a = wu.a.listOf().xmap(wp::new, wp::a);
   public static wp b = new wp(List.of());
   public static final int c = 20;

   public void a(axx.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (wu $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public wp.a a(wv $$0) {
      return new wp.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<wu> a() {
      return this.d;
   }

   public static record a(List<wu.a> b) {
      public static final wp.a a = new wp.a(List.of());

      public a(vi $$0) {
         this($$0.a(vi.a(ArrayList::new, 20), wu.a::a));
      }

      public void a(vi $$0) {
         $$0.a(this.b, wu.a::a);
      }

      public Optional<wp> a(wv $$0) {
         List<wu> $$1 = new ArrayList<>(this.b.size());

         for (wu.a $$2 : this.b) {
            Optional<wu> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new wp($$1));
      }

      public List<wu.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vi $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vi $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
