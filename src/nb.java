import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class nb {
   private static final nb a = new nb(ImmutableList.of());
   private static final Comparator<dql.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dql.a<?>> c;

   public nb a(dql.a<?> $$0) {
      return new nb(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public nb a(nb $$0) {
      return new nb(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private nb(List<dql.a<?>> $$0) {
      this.c = $$0;
   }

   public static nb a() {
      return a;
   }

   public static nb a(dql.a<?>... $$0) {
      return new nb(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof nb && this.c.equals(((nb)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dql.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
