import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kv implements Predicate<kr> {
   public static final Codec<kv> a = kw.d
      .xmap(
         $$0 -> new kv($$0.entrySet().stream().map(kz::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kz::a, kz::b))
      );
   public static final yt<wg, kv> b = kz.a.a(yr.a()).a(kv::new, $$0 -> $$0.d);
   public static final kv c = new kv(List.of());
   private final List<kz<?>> d;

   kv(List<kz<?>> $$0) {
      this.d = $$0;
   }

   public static kv.a a() {
      return new kv.a();
   }

   public static <T> kv a(kw<T> $$0, T $$1) {
      return new kv(List.of(new kz<>($$0, $$1)));
   }

   public static kv a(kt $$0) {
      return new kv(ImmutableList.copyOf($$0));
   }

   public static kv a(kt $$0, kw<?>... $$1) {
      kv.a $$2 = new kv.a();

      for (kw<?> $$3 : $$1) {
         kz<?> $$4 = $$0.b($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kv $$1 && this.d.equals($$1.d)) {
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

   public boolean a(kr $$0) {
      for (kz<?> $$1 : this.d) {
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

   public ku c() {
      ku.a $$0 = ku.a();

      for (kz<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kz<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kv.a a(kz<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> kv.a a(kw<? super T> $$0, T $$1) {
         for (kz<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kz<>($$0, $$1));
         return this;
      }

      public kv a() {
         return new kv(List.copyOf(this.a));
      }
   }
}
