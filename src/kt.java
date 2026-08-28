import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kt implements Predicate<kr> {
   public static final Codec<kt> a = ku.d
      .xmap(
         $$0 -> new kt($$0.entrySet().stream().map(kx::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kx::a, kx::b))
      );
   public static final ym<vz, kt> b = kx.a.a(yk.a()).a(kt::new, $$0 -> $$0.d);
   public static final kt c = new kt(List.of());
   private final List<kx<?>> d;

   kt(List<kx<?>> $$0) {
      this.d = $$0;
   }

   public static kt.a a() {
      return new kt.a();
   }

   public static kt a(kr $$0) {
      return new kt(ImmutableList.copyOf($$0));
   }

   public static kt a(kr $$0, ku<?>... $$1) {
      kt.a $$2 = new kt.a();

      for (ku<?> $$3 : $$1) {
         kx<?> $$4 = $$0.c($$3);
         if ($$4 != null) {
            $$2.a($$4);
         }
      }

      return $$2.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof kt $$1 && this.d.equals($$1.d)) {
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

   public boolean b(kr $$0) {
      for (kx<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(kq $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public ks c() {
      ks.a $$0 = ks.a();

      for (kx<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kx<?>> a = new ArrayList<>();

      a() {
      }

      public <T> kt.a a(kx<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public <T> kt.a a(ku<? super T> $$0, T $$1) {
         for (kx<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kx<>($$0, $$1));
         return this;
      }

      public kt a() {
         return new kt(List.copyOf(this.a));
      }
   }
}
