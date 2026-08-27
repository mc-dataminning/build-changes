import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record tr(List<tw> d) {
   public static final Codec<tr> a = tw.a.listOf().xmap(tr::new, tr::a);
   public static tr b = new tr(List.of());
   public static final int c = 20;

   public void a(asg.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (tw $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public tr.a a(tx $$0) {
      return new tr.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<tw> a() {
      return this.d;
   }

   public static record a(List<tw.a> b) {
      public static final tr.a a = new tr.a(List.of());

      public a(so $$0) {
         this($$0.a(so.a(ArrayList::new, 20), tw.a::a));
      }

      public void a(so $$0) {
         $$0.a(this.b, tw.a::a);
      }

      public Optional<tr> a(tx $$0) {
         List<tw> $$1 = new ArrayList<>(this.b.size());

         for (tw.a $$2 : this.b) {
            Optional<tw> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new tr($$1));
      }

      public List<tw.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(so $$0) {
         this($$0.m(), $$0.e(20));
      }

      public void a(so $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
