import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class jx implements Predicate<jv> {
   public static final Codec<jx> a = axe.c(jy.a, jy::c)
      .xmap($$0 -> new jx($$0.entrySet().stream().map(kb::a).collect(Collectors.toList())), $$0 -> $$0.d.stream().collect(Collectors.toMap(kb::a, kb::b)));
   public static final yq<wd, jx> b = kb.a.a(yo.a()).a(jx::new, $$0 -> $$0.d);
   public static final jx c = new jx(List.of());
   private final List<kb<?>> d;

   jx(List<kb<?>> $$0) {
      this.d = $$0;
   }

   public static jx.a a() {
      return new jx.a();
   }

   public static jx a(jv $$0) {
      return new jx(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof jx $$1 && this.d.equals($$1.d)) {
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

   public boolean b(jv $$0) {
      for (kb<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(ju $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public jw c() {
      jw.a $$0 = jw.a();

      for (kb<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<kb<?>> a = new ArrayList<>();

      a() {
      }

      public <T> jx.a a(jy<? super T> $$0, T $$1) {
         for (kb<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new kb<>($$0, $$1));
         return this;
      }

      public jx a() {
         return new jx(List.copyOf(this.a));
      }
   }
}
