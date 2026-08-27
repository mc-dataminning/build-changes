import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class ml {
   private static final ml a = new ml(ImmutableList.of());
   private static final Comparator<dnh.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dnh.a<?>> c;

   public ml a(dnh.a<?> $$0) {
      return new ml(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public ml a(ml $$0) {
      return new ml(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private ml(List<dnh.a<?>> $$0) {
      this.c = $$0;
   }

   public static ml a() {
      return a;
   }

   public static ml a(dnh.a<?>... $$0) {
      return new ml(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof ml && this.c.equals(((ml)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dnh.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
