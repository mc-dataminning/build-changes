import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record up(List<uu> d) {
   public static final Codec<up> a = uu.a.listOf().xmap(up::new, up::a);
   public static up b = new up(List.of());
   public static final int c = 20;

   public void a(ati.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (uu $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public up.a a(uv $$0) {
      return new up.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<uu> a() {
      return this.d;
   }

   public static record a(List<uu.a> b) {
      public static final up.a a = new up.a(List.of());

      public a(tl $$0) {
         this($$0.a(tl.a(ArrayList::new, 20), uu.a::a));
      }

      public void a(tl $$0) {
         $$0.a(this.b, uu.a::a);
      }

      public Optional<up> a(uv $$0) {
         List<uu> $$1 = new ArrayList<>(this.b.size());

         for (uu.a $$2 : this.b) {
            Optional<uu> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new up($$1));
      }

      public List<uu.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(tl $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(tl $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
