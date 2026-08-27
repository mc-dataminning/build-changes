import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record ts(List<tx> d) {
   public static final Codec<ts> a = tx.a.listOf().xmap(ts::new, ts::a);
   public static ts b = new ts(List.of());
   public static final int c = 20;

   public void a(asg.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (tx $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public ts.a a(ty $$0) {
      return new ts.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<tx> a() {
      return this.d;
   }

   public static record a(List<tx.a> b) {
      public static final ts.a a = new ts.a(List.of());

      public a(sp $$0) {
         this($$0.a(sp.a(ArrayList::new, 20), tx.a::a));
      }

      public void a(sp $$0) {
         $$0.a(this.b, tx.a::a);
      }

      public Optional<ts> a(ty $$0) {
         List<tx> $$1 = new ArrayList<>(this.b.size());

         for (tx.a $$2 : this.b) {
            Optional<tx> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new ts($$1));
      }

      public List<tx.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(sp $$0) {
         this($$0.m(), $$0.e(20));
      }

      public void a(sp $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
