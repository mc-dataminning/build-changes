import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xp(List<xu> d) {
   public static final Codec<xp> a = xu.a.listOf().xmap(xp::new, xp::a);
   public static xp b = new xp(List.of());
   public static final int c = 20;

   public void a(azw.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (xu $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public xp.a a(xv $$0) {
      return new xp.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<xu> a() {
      return this.d;
   }

   public static record a(List<xu.a> b) {
      public static final xp.a a = new xp.a(List.of());

      public a(wf $$0) {
         this($$0.a(wf.a(ArrayList::new, 20), xu.a::a));
      }

      public void a(wf $$0) {
         $$0.a(this.b, xu.a::a);
      }

      public Optional<xp> a(xv $$0) {
         List<xu> $$1 = new ArrayList<>(this.b.size());

         for (xu.a $$2 : this.b) {
            Optional<xu> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xp($$1));
      }

      public List<xu.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(wf $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(wf $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
