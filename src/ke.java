import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class ke implements Predicate<kf> {
   public static final Codec<ke> a = kj.d
      .xmap(
         $$0 -> new ke($$0.entrySet().stream().map(km::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(km::a, km::b))
      );
   public static final yy<wl, ke> b = km.a.a(yw.a()).a(ke::new, $$0 -> $$0.d);
   public static final ke c = new ke(List.of());
   private final List<km<?>> d;

   ke(List<km<?>> $$0) {
      this.d = $$0;
   }

   public static ke.a a() {
      return new ke.a();
   }

   public static <T> ke a(kj<T> $$0, T $$1) {
      return new ke(List.of(new km<>($$0, $$1)));
   }

   public static ke a(kh $$0) {
      return new ke(ImmutableList.copyOf($$0));
   }

   public static ke a(kh $$0, kj<?>... $$1) {
      ke.a $$2 = new ke.a();

      for (kj<?> $$3 : $$1) {
         km<?> $$4 = $$0.b($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof ke $$1 && this.d.equals($$1.d)) {
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

   public boolean a(kf $$0) {
      for (km<?> $$1 : this.d) {
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

   public ki c() {
      ki.a $$0 = ki.a();

      for (km<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<km<?>> a = new ArrayList<>();

      a() {
      }

      public <T> ke.a a(km<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> ke.a a(kj<? super T> $$0, T $$1) {
         for (km<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new km<>($$0, $$1));
         return this;
      }

      public ke a() {
         return new ke(List.copyOf(this.a));
      }
   }
}
