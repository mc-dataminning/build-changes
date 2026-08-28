import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class ok {
   private static final ok a = new ok(ImmutableList.of());
   private static final Comparator<dyx.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dyx.a<?>> c;

   public ok a(dyx.a<?> $$0) {
      return new ok(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public ok a(ok $$0) {
      return new ok(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private ok(List<dyx.a<?>> $$0) {
      this.c = $$0;
   }

   public static ok a() {
      return a;
   }

   public static ok a(dyx.a<?>... $$0) {
      return new ok(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof ok && this.c.equals(((ok)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dyx.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
