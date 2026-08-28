import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kr implements Predicate<kp> {
   public static final Codec<kr> a = ks.d
      .xmap(
         $$0 -> new kr($$0.entrySet().stream().map(kv::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kv::a, kv::b))
      );
   public static final zf<ws, kr> b = kv.a.a(zd.a()).a(kr::new, $$0 -> $$0.d);
   public static final kr c = new kr(List.of());
   private final List<kv<?>> d;

   kr(List<kv<?>> $$0) {
      this.d = $$0;
   }

   public static kr.a a() {
      return new kr.a();
   }

   public static kr a(kp $$0) {
      return new kr(ImmutableList.copyOf($$0));
   }

   public static kr a(kp $$0, ks<?>... $$1) {
      kr.a $$2 = new kr.a();

      for (ks<?> $$3 : $$1) {
         kv<?> $$4 = $$0.c($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kr $$1 && this.d.equals($$1.d)) {
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

   public boolean b(kp $$0) {
      for (kv<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(ko $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public kq c() {
      kq.a $$0 = kq.a();

      for (kv<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kv<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kr.a a(kv<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> kr.a a(ks<? super T> $$0, T $$1) {
         for (kv<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kv<>($$0, $$1));
         return this;
      }

      public kr a() {
         return new kr(List.copyOf(this.a));
      }
   }
}
