import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record vn(List<vs> d) {
   public static final Codec<vn> a = vs.a.listOf().xmap(vn::new, vn::a);
   public static vn b = new vn(List.of());
   public static final int c = 20;

   public void a(avc.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (vs $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public vn.a a(vt $$0) {
      return new vn.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<vs> a() {
      return this.d;
   }

   public static record a(List<vs.a> b) {
      public static final vn.a a = new vn.a(List.of());

      public a(uj $$0) {
         this($$0.a(uj.a(ArrayList::new, 20), vs.a::a));
      }

      public void a(uj $$0) {
         $$0.a(this.b, vs.a::a);
      }

      public Optional<vn> a(vt $$0) {
         List<vs> $$1 = new ArrayList<>(this.b.size());

         for (vs.a $$2 : this.b) {
            Optional<vs> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new vn($$1));
      }

      public List<vs.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(uj $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(uj $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
