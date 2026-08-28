import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class ko implements Predicate<km> {
   public static final Codec<ko> a = kp.d
      .xmap(
         $$0 -> new ko($$0.entrySet().stream().map(ks::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(ks::a, ks::b))
      );
   public static final yx<wk, ko> b = ks.a.a(yv.a()).a(ko::new, $$0 -> $$0.d);
   public static final ko c = new ko(List.of());
   private final List<ks<?>> d;

   ko(List<ks<?>> $$0) {
      this.d = $$0;
   }

   public static ko.a a() {
      return new ko.a();
   }

   public static ko a(km $$0) {
      return new ko(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof ko $$1 && this.d.equals($$1.d)) {
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

   public boolean b(km $$0) {
      for (ks<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(kl $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public kn c() {
      kn.a $$0 = kn.a();

      for (ks<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<ks<?>> a = new ArrayList<>();

      a() {
      }

      public <T> ko.a a(kp<? super T> $$0, T $$1) {
         for (ks<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new ks<>($$0, $$1));
         return this;
      }

      public ko a() {
         return new ko(List.copyOf(this.a));
      }
   }
}
