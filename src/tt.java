import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record tt(List<ty> d) {
   public static final Codec<tt> a = ty.a.listOf().xmap(tt::new, tt::a);
   public static tt b = new tt(List.of());
   public static final int c = 20;

   public void a(asi.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (ty $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public tt.a a(tz $$0) {
      return new tt.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<ty> a() {
      return this.d;
   }

   public static record a(List<ty.a> b) {
      public static final tt.a a = new tt.a(List.of());

      public a(sq $$0) {
         this($$0.a(sq.a(ArrayList::new, 20), ty.a::a));
      }

      public void a(sq $$0) {
         $$0.a(this.b, ty.a::a);
      }

      public Optional<tt> a(tz $$0) {
         List<ty> $$1 = new ArrayList<>(this.b.size());

         for (ty.a $$2 : this.b) {
            Optional<ty> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new tt($$1));
      }

      public List<ty.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(sq $$0) {
         this($$0.m(), $$0.e(20));
      }

      public void a(sq $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
