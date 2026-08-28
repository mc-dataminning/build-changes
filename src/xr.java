import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xr(List<xw> d) {
   public static final Codec<xr> a = xw.a.listOf().xmap(xr::new, xr::a);
   public static xr b = new xr(List.of());
   public static final int c = 20;

   public void a(bag.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xw $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xr.a a(xx $$0) {
      return new xr.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xw> a() {
      return this.d;
   }

   public static record a(List<xw.a> b) {
      public static final xr.a a = new xr.a(List.of());

      public a(wh $$0) {
         this($$0.a(wh.a(ArrayList::new, 20), xw.a::a));
      }

      public void a(wh $$0) {
         $$0.a(this.b, xw.a::a);
      }

      public Optional<xr> a(xx $$0) {
         List<xw> $$1 = new ArrayList<>(this.b.size());

         for (xw.a $$2 : this.b) {
            Optional<xw> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xr($$1));
      }

      public List<xw.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wh $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wh $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
