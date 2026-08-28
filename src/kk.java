import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kk implements Predicate<ki> {
   public static final Codec<kk> a = kl.d
      .xmap(
         $$0 -> new kk($$0.entrySet().stream().map(ko::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(ko::a, ko::b))
      );
   public static final zj<ww, kk> b = ko.a.a(zh.a()).a(kk::new, $$0 -> $$0.d);
   public static final kk c = new kk(List.of());
   private final List<ko<?>> d;

   kk(List<ko<?>> $$0) {
      this.d = $$0;
   }

   public static kk.a a() {
      return new kk.a();
   }

   public static kk a(ki $$0) {
      return new kk(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kk $$1 && this.d.equals($$1.d)) {
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

   public boolean b(ki $$0) {
      for (ko<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(kh $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public kj c() {
      kj.a $$0 = kj.a();

      for (ko<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<ko<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kk.a a(kl<? super T> $$0, T $$1) {
         for (ko<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new ko<>($$0, $$1));
         return this;
      }

      public kk a() {
         return new kk(List.copyOf(this.a));
      }
   }
}
