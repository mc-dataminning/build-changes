import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class md {
   private static final md a = new md(ImmutableList.of());
   private static final Comparator<diq.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<diq.a<?>> c;

   public md a(diq.a<?> $$0) {
      return new md(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public md a(md $$0) {
      return new md(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private md(List<diq.a<?>> $$0) {
      this.c = $$0;
   }

   public static md a() {
      return a;
   }

   public static md a(diq.a<?>... $$0) {
      return new md(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof md && this.c.equals(((md)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(diq.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
