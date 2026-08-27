import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record vz(List<we> d) {
   public static final Codec<vz> a = we.a.listOf().xmap(vz::new, vz::a);
   public static vz b = new vz(List.of());
   public static final int c = 20;

   public void a(awx.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (we $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public vz.a a(wf $$0) {
      return new vz.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<we> a() {
      return this.d;
   }

   public static record a(List<we.a> b) {
      public static final vz.a a = new vz.a(List.of());

      public a(us $$0) {
         this($$0.a(us.a(ArrayList::new, 20), we.a::a));
      }

      public void a(us $$0) {
         $$0.a(this.b, we.a::a);
      }

      public Optional<vz> a(wf $$0) {
         List<we> $$1 = new ArrayList<>(this.b.size());

         for (we.a $$2 : this.b) {
            Optional<we> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new vz($$1));
      }

      public List<we.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(us $$0) {
         this($$0.l(), $$0.e(20));
      }

      public void a(us $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
