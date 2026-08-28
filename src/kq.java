import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kq implements Predicate<ko> {
   public static final Codec<kq> a = kr.d
      .xmap(
         $$0 -> new kq($$0.entrySet().stream().map(ku::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(ku::a, ku::b))
      );
   public static final zc<wp, kq> b = ku.a.a(za.a()).a(kq::new, $$0 -> $$0.d);
   public static final kq c = new kq(List.of());
   private final List<ku<?>> d;

   kq(List<ku<?>> $$0) {
      this.d = $$0;
   }

   public static kq.a a() {
      return new kq.a();
   }

   public static kq a(ko $$0) {
      return new kq(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kq $$1 && this.d.equals($$1.d)) {
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

   public boolean b(ko $$0) {
      for (ku<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(kn $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public kp c() {
      kp.a $$0 = kp.a();

      for (ku<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<ku<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kq.a a(kr<? super T> $$0, T $$1) {
         for (ku<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new ku<>($$0, $$1));
         return this;
      }

      public kq a() {
         return new kq(List.copyOf(this.a));
      }
   }
}
