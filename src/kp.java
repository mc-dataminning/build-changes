import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kp implements Predicate<kn> {
   public static final Codec<kp> a = kq.d
      .xmap(
         $$0 -> new kp($$0.entrySet().stream().map(kt::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kt::a, kt::b))
      );
   public static final zb<wo, kp> b = kt.a.a(yz.a()).a(kp::new, $$0 -> $$0.d);
   public static final kp c = new kp(List.of());
   private final List<kt<?>> d;

   kp(List<kt<?>> $$0) {
      this.d = $$0;
   }

   public static kp.a a() {
      return new kp.a();
   }

   public static kp a(kn $$0) {
      return new kp(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kp $$1 && this.d.equals($$1.d)) {
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

   public boolean b(kn $$0) {
      for (kt<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(km $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public ko c() {
      ko.a $$0 = ko.a();

      for (kt<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kt<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kp.a a(kq<? super T> $$0, T $$1) {
         for (kt<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kt<>($$0, $$1));
         return this;
      }

      public kp a() {
         return new kp(List.copyOf(this.a));
      }
   }
}
