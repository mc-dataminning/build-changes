import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class ks implements Predicate<kq> {
   public static final Codec<ks> a = kt.d
      .xmap(
         $$0 -> new ks($$0.entrySet().stream().map(kw::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kw::a, kw::b))
      );
   public static final zj<ww, ks> b = kw.a.a(zh.a()).a(ks::new, $$0 -> $$0.d);
   public static final ks c = new ks(List.of());
   private final List<kw<?>> d;

   ks(List<kw<?>> $$0) {
      this.d = $$0;
   }

   public static ks.a a() {
      return new ks.a();
   }

   public static ks a(kq $$0) {
      return new ks(ImmutableList.copyOf($$0));
   }

   public static ks a(kq $$0, kt<?>... $$1) {
      ks.a $$2 = new ks.a();

      for (kt<?> $$3 : $$1) {
         kw<?> $$4 = $$0.c($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof ks $$1 && this.d.equals($$1.d)) {
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

   public boolean b(kq $$0) {
      for (kw<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(kp $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public kr c() {
      kr.a $$0 = kr.a();

      for (kw<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kw<?>> a = new ArrayList<>();

      a() {
      }

      public <T> ks.a a(kw<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> ks.a a(kt<? super T> $$0, T $$1) {
         for (kw<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kw<>($$0, $$1));
         return this;
      }

      public ks a() {
         return new ks(List.copyOf(this.a));
      }
   }
}
