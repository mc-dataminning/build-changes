import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class jz implements Predicate<jx> {
   public static final Codec<jz> a = ka.d
      .xmap(
         $$0 -> new jz($$0.entrySet().stream().map(kd::a).collect(Collectors.toList())),
         $$0 -> $$0.d.stream().filter($$0x -> !$$0x.a().d()).collect(Collectors.toMap(kd::a, kd::b))
      );
   public static final yv<wi, jz> b = kd.a.a(yt.a()).a(jz::new, $$0 -> $$0.d);
   public static final jz c = new jz(List.of());
   private final List<kd<?>> d;

   jz(List<kd<?>> $$0) {
      this.d = $$0;
   }

   public static jz.a a() {
      return new jz.a();
   }

   public static jz a(jx $$0) {
      return new jz(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof jz $$1 && this.d.equals($$1.d)) {
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

   public boolean b(jx $$0) {
      for (kd<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(jw $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public jy c() {
      jy.a $$0 = jy.a();

      for (kd<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kd<?>> a = new ArrayList<>();

      a() {
      }

      public <T> jz.a a(ka<? super T> $$0, T $$1) {
         for (kd<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kd<>($$0, $$1));
         return this;
      }

      public jz a() {
         return new jz(List.copyOf(this.a));
      }
   }
}
