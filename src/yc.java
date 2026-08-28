import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record yc(List<yh> d) {
   public static final Codec<yc> a = yh.a.listOf().xmap(yc::new, yc::a);
   public static yc b = new yc(List.of());
   public static final int c = 20;

   public void a(baq.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (yh $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public yc.a a(yi $$0) {
      return new yc.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<yh> a() {
      return this.d;
   }

   public static record a(List<yh.a> b) {
      public static final yc.a a = new yc.a(List.of());

      public a(ws $$0) {
         this($$0.a(ws.a(ArrayList::new, 20), yh.a::a));
      }

      public void a(ws $$0) {
         $$0.a(this.b, yh.a::a);
      }

      public Optional<yc> a(yi $$0) {
         List<yh> $$1 = new ArrayList<>(this.b.size());

         for (yh.a $$2 : this.b) {
            Optional<yh> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new yc($$1));
      }

      public List<yh.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(ws $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(ws $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
