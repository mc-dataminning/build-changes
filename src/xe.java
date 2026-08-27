import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xe(List<xj> d) {
   public static final Codec<xe> a = xj.a.listOf().xmap(xe::new, xe::a);
   public static xe b = new xe(List.of());
   public static final int c = 20;

   public void a(ayq.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xj $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xe.a a(xk $$0) {
      return new xe.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xj> a() {
      return this.d;
   }

   public static record a(List<xj.a> b) {
      public static final xe.a a = new xe.a(List.of());

      public a(vx $$0) {
         this($$0.a(vx.a(ArrayList::new, 20), xj.a::a));
      }

      public void a(vx $$0) {
         $$0.a(this.b, xj.a::a);
      }

      public Optional<xe> a(xk $$0) {
         List<xj> $$1 = new ArrayList<>(this.b.size());

         for (xj.a $$2 : this.b) {
            Optional<xj> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xe($$1));
      }

      public List<xj.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vx $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vx $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
