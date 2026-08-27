import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class jy implements Predicate<jw> {
   public static final Codec<jy> a = axh.c(jz.a, jz::c)
      .xmap($$0 -> new jy($$0.entrySet().stream().map(kc::a).collect(Collectors.toList())), $$0 -> $$0.d.stream().collect(Collectors.toMap(kc::a, kc::b)));
   public static final ys<wf, jy> b = kc.a.a(yq.a()).a(jy::new, $$0 -> $$0.d);
   public static final jy c = new jy(List.of());
   private final List<kc<?>> d;

   jy(List<kc<?>> $$0) {
      this.d = $$0;
   }

   public static jy.a a() {
      return new jy.a();
   }

   public static jy a(jw $$0) {
      return new jy(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof jy $$1 && this.d.equals($$1.d)) {
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

   public boolean b(jw $$0) {
      for (kc<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(jv $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public jx c() {
      jx.a $$0 = jx.a();

      for (kc<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kc<?>> a = new ArrayList<>();

      a() {
      }

      public <T> jy.a a(jz<? super T> $$0, T $$1) {
         for (kc<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kc<>($$0, $$1));
         return this;
      }

      public jy a() {
         return new jy(List.copyOf(this.a));
      }
   }
}
