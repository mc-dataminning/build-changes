import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xv(List<ya> d) {
   public static final Codec<xv> a = ya.a.listOf().xmap(xv::new, xv::a);
   public static xv b = new xv(List.of());
   public static final int c = 20;

   public void a(azj.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (ya $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xv.a a(yb $$0) {
      return new xv.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<ya> a() {
      return this.d;
   }

   public static record a(List<ya.a> b) {
      public static final xv.a a = new xv.a(List.of());

      public a(wl $$0) {
         this($$0.a(wl.a(ArrayList::new, 20), ya.a::a));
      }

      public void a(wl $$0) {
         $$0.a(this.b, ya.a::a);
      }

      public Optional<xv> a(yb $$0) {
         List<ya> $$1 = new ArrayList<>(this.b.size());

         for (ya.a $$2 : this.b) {
            Optional<ya> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xv($$1));
      }

      public List<ya.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wl $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wl $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
