import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class og {
   private static final og a = new og(ImmutableList.of());
   private static final Comparator<dyq.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dyq.a<?>> c;

   public og a(dyq.a<?> $$0) {
      return new og(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public og a(og $$0) {
      return new og(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private og(List<dyq.a<?>> $$0) {
      this.c = $$0;
   }

   public static og a() {
      return a;
   }

   public static og a(dyq.a<?>... $$0) {
      return new og(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof og && this.c.equals(((og)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dyq.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
