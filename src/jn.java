import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class jn implements Predicate<jl> {
   public static final Codec<jn> a = aws.c(jo.a, jo::c)
      .xmap($$0 -> new jn($$0.entrySet().stream().map(jr::a).collect(Collectors.toList())), $$0 -> $$0.d.stream().collect(Collectors.toMap(jr::a, jr::b)));
   public static final ye<vr, jn> b = jr.a.a(yc.a()).a(jn::new, $$0 -> $$0.d);
   public static final jn c = new jn(List.of());
   private final List<jr<?>> d;

   jn(List<jr<?>> $$0) {
      this.d = $$0;
   }

   public static jn.a a() {
      return new jn.a();
   }

   public static jn a(jl $$0) {
      return new jn(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof jn $$1 && this.d.equals($$1.d)) {
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

   public boolean b(jl $$0) {
      for (jr<?> $$1 : this.d) {
         Object $$2 = $$0.a($$1.a());
         if (!Objects.equals($$1.b(), $$2)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(jk $$0) {
      return this.b($$0.a());
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public jm c() {
      jm.a $$0 = jm.a();

      for (jr<?> $$1 : this.d) {
         $$0.a($$1);
      }

      return $$0.a();
   }

   public static class a {
      private final List<jr<?>> a = new ArrayList<>();

      a() {
      }

      public <T> jn.a a(jo<? super T> $$0, T $$1) {
         for (jr<?> $$2 : this.a) {
            if ($$2.a() == $$0) {
               throw new IllegalArgumentException("Predicate already has component of type: '" + $$0 + "'");
            }
         }

         this.a.add(new jr<>($$0, $$1));
         return this;
      }

      public jn a() {
         return new jn(List.copyOf(this.a));
      }
   }
}
