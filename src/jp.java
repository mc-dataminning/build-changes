import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class jp implements Predicate<jn> {
   public static final Codec<jp> a = awu.c(jq.a, jq::c)
      .xmap($$0 -> new jp($$0.entrySet().stream().map(jt::a).collect(Collectors.toList())), $$0 -> $$0.d.stream().collect(Collectors.toMap(jt::a, jt::b)));
   public static final yg<vt, jp> b = jt.a.a(ye.a()).a(jp::new, $$0 -> $$0.d);
   public static final jp c = new jp(List.of());
   private final List<jt<?>> d;

   jp(List<jt<?>> $$0) {
      this.d = $$0;
   }

   public static jp.a a() {
      return new jp.a();
   }

   public static jp a(jn $$0) {
      return new jp(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof jp $$1 && this.d.equals($$1.d)) {
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

   public boolean b(jn $$0) {
      for (jt<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(jm $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public jo c() {
      jo.a $$0 = jo.a();

      for (jt<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<jt<?>> a = new ArrayList<>();

      a() {
      }

      public <T> jp.a a(jq<? super T> $$0, T $$1) {
         for (jt<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new jt<>($$0, $$1));
         return this;
      }

      public jp a() {
         return new jp(List.copyOf(this.a));
      }
   }
}
