import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record tl(List<tq> d) {
   public static final Codec<tl> a = tq.a.listOf().xmap(tl::new, tl::a);
   public static tl b = new tl(List.of());
   public static final int c = 20;

   public void a(ary.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (tq $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public tl.a a(tr $$0) {
      return new tl.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<tq> a() {
      return this.d;
   }

   public static record a(List<tq.a> b) {
      public static final tl.a a = new tl.a(List.of());

      public a(si $$0) {
         this($$0.a(si.a(ArrayList::new, 20), tq.a::a));
      }

      public void a(si $$0) {
         $$0.a(this.b, tq.a::a);
      }

      public Optional<tl> a(tr $$0) {
         List<tq> $$1 = new ArrayList<>(this.b.size());

         for (tq.a $$2 : this.b) {
            Optional<tq> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new tl($$1));
      }

      public List<tq.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(si $$0) {
         this($$0.m(), $$0.e(20));
      }

      public void a(si $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
