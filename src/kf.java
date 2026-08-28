import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kf implements Predicate<kg> {
   public static final Codec<kf> a = kk.d
      .xmap(
         $$0 -> new kf($$0.entrySet().stream().map(kn::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kn::a, kn::b))
      );
   public static final ze<wp, kf> b = kn.a.a(zc.a()).a(kf::new, $$0 -> $$0.d);
   public static final kf c = new kf(List.of());
   private final List<kn<?>> d;

   kf(List<kn<?>> $$0) {
      this.d = $$0;
   }

   public static kf.a a() {
      return new kf.a();
   }

   public static <T> kf a(kk<T> $$0, T $$1) {
      return new kf(List.of(new kn<>($$0, $$1)));
   }

   public static kf a(ki $$0) {
      return new kf(ImmutableList.copyOf($$0));
   }

   public static kf a(ki $$0, kk<?>... $$1) {
      kf.a $$2 = new kf.a();

      for (kk<?> $$3 : $$1) {
         kn<?> $$4 = $$0.b($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kf $$1 && this.d.equals($$1.d)) {
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

   public boolean a(kg $$0) {
      for (kn<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public kj d() {
      kj.a $$0 = kj.a();

      for (kn<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kn<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kf.a a(kn<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> kf.a a(kk<? super T> $$0, T $$1) {
         for (kn<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kn<>($$0, $$1));
         return this;
      }

      public kf a() {
         return new kf(List.copyOf(this.a));
      }
   }
}
