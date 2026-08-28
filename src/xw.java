import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xw(List<yb> d) {
   public static final Codec<xw> a = yb.a.listOf().xmap(xw::new, xw::a);
   public static xw b = new xw(List.of());
   public static final int c = 20;

   public void a(azl.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (yb $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xw.a a(yc $$0) {
      return new xw.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<yb> a() {
      return this.d;
   }

   public static record a(List<yb.a> b) {
      public static final xw.a a = new xw.a(List.of());

      public a(wm $$0) {
         this($$0.a(wm.a(ArrayList::new, 20), yb.a::a));
      }

      public void a(wm $$0) {
         $$0.a(this.b, yb.a::a);
      }

      public Optional<xw> a(yc $$0) {
         List<yb> $$1 = new ArrayList<>(this.b.size());

         for (yb.a $$2 : this.b) {
            Optional<yb> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xw($$1));
      }

      public List<yb.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wm $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wm $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
