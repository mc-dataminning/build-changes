import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record to(List<tt> d) {
   public static final Codec<to> a = tt.a.listOf().xmap(to::new, to::a);
   public static to b = new to(List.of());
   public static final int c = 20;

   public void a(asb.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (tt $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public to.a a(tu $$0) {
      return new to.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<tt> a() {
      return this.d;
   }

   public static record a(List<tt.a> b) {
      public static final to.a a = new to.a(List.of());

      public a(sl $$0) {
         this($$0.a(sl.a(ArrayList::new, 20), tt.a::a));
      }

      public void a(sl $$0) {
         $$0.a(this.b, tt.a::a);
      }

      public Optional<to> a(tu $$0) {
         List<tt> $$1 = new ArrayList<>(this.b.size());

         for (tt.a $$2 : this.b) {
            Optional<tt> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new to($$1));
      }

      public List<tt.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(sl $$0) {
         this($$0.m(), $$0.e(20));
      }

      public void a(sl $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
