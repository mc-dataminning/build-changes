import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kd implements Predicate<ke> {
   public static final Codec<kd> a = ki.d
      .xmap(
         $$0 -> new kd($$0.entrySet().stream().map(kl::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kl::a, kl::b))
      );
   public static final yu<wh, kd> b = kl.a.a(ys.a()).a(kd::new, $$0 -> $$0.d);
   public static final kd c = new kd(List.of());
   private final List<kl<?>> d;

   kd(List<kl<?>> $$0) {
      this.d = $$0;
   }

   public static kd.a a() {
      return new kd.a();
   }

   public static <T> kd a(ki<T> $$0, T $$1) {
      return new kd(List.of(new kl<>($$0, $$1)));
   }

   public static kd a(kg $$0) {
      return new kd(ImmutableList.copyOf($$0));
   }

   public static kd a(kg $$0, ki<?>... $$1) {
      kd.a $$2 = new kd.a();

      for (ki<?> $$3 : $$1) {
         kl<?> $$4 = $$0.b($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kd $$1 && this.d.equals($$1.d)) {
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

   public boolean a(ke $$0) {
      for (kl<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public kh c() {
      kh.a $$0 = kh.a();

      for (kl<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kl<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kd.a a(kl<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> kd.a a(ki<? super T> $$0, T $$1) {
         for (kl<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kl<>($$0, $$1));
         return this;
      }

      public kd a() {
         return new kd(List.copyOf(this.a));
      }
   }
}
