import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record vm(List<vr> d) {
   public static final Codec<vm> a = vr.a.listOf().xmap(vm::new, vm::a);
   public static vm b = new vm(List.of());
   public static final int c = 20;

   public void a(avb.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (vr $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public vm.a a(vs $$0) {
      return new vm.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<vr> a() {
      return this.d;
   }

   public static record a(List<vr.a> b) {
      public static final vm.a a = new vm.a(List.of());

      public a(ui $$0) {
         this($$0.a(ui.a(ArrayList::new, 20), vr.a::a));
      }

      public void a(ui $$0) {
         $$0.a(this.b, vr.a::a);
      }

      public Optional<vm> a(vs $$0) {
         List<vr> $$1 = new ArrayList<>(this.b.size());

         for (vr.a $$2 : this.b) {
            Optional<vr> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new vm($$1));
      }

      public List<vr.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(ui $$0) {
         this($$0.n(), $$0.e(20));
      }

      public void a(ui $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
