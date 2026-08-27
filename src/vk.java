import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record vk(List<vp> d) {
   public static final Codec<vk> a = vp.a.listOf().xmap(vk::new, vk::a);
   public static vk b = new vk(List.of());
   public static final int c = 20;

   public void a(auu.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (vp $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public vk.a a(vq $$0) {
      return new vk.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<vp> a() {
      return this.d;
   }

   public static record a(List<vp.a> b) {
      public static final vk.a a = new vk.a(List.of());

      public a(ug $$0) {
         this($$0.a(ug.a(ArrayList::new, 20), vp.a::a));
      }

      public void a(ug $$0) {
         $$0.a(this.b, vp.a::a);
      }

      public Optional<vk> a(vq $$0) {
         List<vp> $$1 = new ArrayList<>(this.b.size());

         for (vp.a $$2 : this.b) {
            Optional<vp> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new vk($$1));
      }

      public List<vp.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(ug $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(ug $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
