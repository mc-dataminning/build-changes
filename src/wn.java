import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record wn(List<ws> d) {
   public static final Codec<wn> a = ws.a.listOf().xmap(wn::new, wn::a);
   public static wn b = new wn(List.of());
   public static final int c = 20;

   public void a(axv.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (ws $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public wn.a a(wt $$0) {
      return new wn.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<ws> a() {
      return this.d;
   }

   public static record a(List<ws.a> b) {
      public static final wn.a a = new wn.a(List.of());

      public a(vg $$0) {
         this($$0.a(vg.a(ArrayList::new, 20), ws.a::a));
      }

      public void a(vg $$0) {
         $$0.a(this.b, ws.a::a);
      }

      public Optional<wn> a(wt $$0) {
         List<ws> $$1 = new ArrayList<>(this.b.size());

         for (ws.a $$2 : this.b) {
            Optional<ws> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new wn($$1));
      }

      public List<ws.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(vg $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(vg $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
