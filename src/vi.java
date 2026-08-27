import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record vi(List<vn> d) {
   public static final Codec<vi> a = vn.a.listOf().xmap(vi::new, vi::a);
   public static vi b = new vi(List.of());
   public static final int c = 20;

   public void a(auk.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (vn $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public vi.a a(vo $$0) {
      return new vi.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<vn> a() {
      return this.d;
   }

   public static record a(List<vn.a> b) {
      public static final vi.a a = new vi.a(List.of());

      public a(ue $$0) {
         this($$0.a(ue.a(ArrayList::new, 20), vn.a::a));
      }

      public void a(ue $$0) {
         $$0.a(this.b, vn.a::a);
      }

      public Optional<vi> a(vo $$0) {
         List<vn> $$1 = new ArrayList<>(this.b.size());

         for (vn.a $$2 : this.b) {
            Optional<vn> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new vi($$1));
      }

      public List<vn.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(ue $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(ue $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
