import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kl implements Predicate<kj> {
   public static final Codec<kl> a = km.d
      .xmap(
         $$0 -> new kl($$0.entrySet().stream().map(kp::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kp::a, kp::b))
      );
   public static final ys<wf, kl> b = kp.a.a(yq.a()).a(kl::new, $$0 -> $$0.d);
   public static final kl c = new kl(List.of());
   private final List<kp<?>> d;

   kl(List<kp<?>> $$0) {
      this.d = $$0;
   }

   public static kl.a a() {
      return new kl.a();
   }

   public static kl a(kj $$0) {
      return new kl(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kl $$1 && this.d.equals($$1.d)) {
         return true;
      }

      return false;
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   @Override
   public String toString() {
      return this.d.toString();
   }

   public boolean b(kj $$0) {
      for (kp<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(ki $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public kk c() {
      kk.a $$0 = kk.a();

      for (kp<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kp<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kl.a a(km<? super T> $$0, T $$1) {
         for (kp<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kp<>($$0, $$1));
         return this;
      }

      public kl a() {
         return new kl(List.copyOf(this.a));
      }
   }
}
