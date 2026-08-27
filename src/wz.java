import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record wz(List<xe> d) {
   public static final Codec<wz> a = xe.a.listOf().xmap(wz::new, wz::a);
   public static wz b = new wz(List.of());
   public static final int c = 20;

   public void a(ayh.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xe $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public wz.a a(xf $$0) {
      return new wz.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xe> a() {
      return this.d;
   }

   public static record a(List<xe.a> b) {
      public static final wz.a a = new wz.a(List.of());

      public a(vs $$0) {
         this($$0.a(vs.a(ArrayList::new, 20), xe.a::a));
      }

      public void a(vs $$0) {
         $$0.a(this.b, xe.a::a);
      }

      public Optional<wz> a(xf $$0) {
         List<xe> $$1 = new ArrayList<>(this.b.size());

         for (xe.a $$2 : this.b) {
            Optional<xe> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new wz($$1));
      }

      public List<xe.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vs $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vs $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
