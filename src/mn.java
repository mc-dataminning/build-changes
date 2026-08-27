import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class mn {
   private static final mn a = new mn(ImmutableList.of());
   private static final Comparator<doe.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<doe.a<?>> c;

   public mn a(doe.a<?> $$0) {
      return new mn(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public mn a(mn $$0) {
      return new mn(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private mn(List<doe.a<?>> $$0) {
      this.c = $$0;
   }

   public static mn a() {
      return a;
   }

   public static mn a(doe.a<?>... $$0) {
      return new mn(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof mn && this.c.equals(((mn)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(doe.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
