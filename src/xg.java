import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xg(List<xl> d) {
   public static final Codec<xg> a = xl.a.listOf().xmap(xg::new, xg::a);
   public static xg b = new xg(List.of());
   public static final int c = 20;

   public void a(aza.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xl $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xg.a a(xm $$0) {
      return new xg.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xl> a() {
      return this.d;
   }

   public static record a(List<xl.a> b) {
      public static final xg.a a = new xg.a(List.of());

      public a(vw $$0) {
         this($$0.a(vw.a(ArrayList::new, 20), xl.a::a));
      }

      public void a(vw $$0) {
         $$0.a(this.b, xl.a::a);
      }

      public Optional<xg> a(xm $$0) {
         List<xl> $$1 = new ArrayList<>(this.b.size());

         for (xl.a $$2 : this.b) {
            Optional<xl> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xg($$1));
      }

      public List<xl.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vw $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vw $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
