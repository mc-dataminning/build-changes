import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record wb(List<wg> d) {
   public static final Codec<wb> a = wg.a.listOf().xmap(wb::new, wb::a);
   public static wb b = new wb(List.of());
   public static final int c = 20;

   public void a(axh.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (wg $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public wb.a a(wh $$0) {
      return new wb.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<wg> a() {
      return this.d;
   }

   public static record a(List<wg.a> b) {
      public static final wb.a a = new wb.a(List.of());

      public a(uu $$0) {
         this($$0.a(uu.a(ArrayList::new, 20), wg.a::a));
      }

      public void a(uu $$0) {
         $$0.a(this.b, wg.a::a);
      }

      public Optional<wb> a(wh $$0) {
         List<wg> $$1 = new ArrayList<>(this.b.size());

         for (wg.a $$2 : this.b) {
            Optional<wg> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new wb($$1));
      }

      public List<wg.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(uu $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(uu $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
