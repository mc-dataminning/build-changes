import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class no {
   private static final no a = new no(ImmutableList.of());
   private static final Comparator<dse.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dse.a<?>> c;

   public no a(dse.a<?> $$0) {
      return new no(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public no a(no $$0) {
      return new no(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private no(List<dse.a<?>> $$0) {
      this.c = $$0;
   }

   public static no a() {
      return a;
   }

   public static no a(dse.a<?>... $$0) {
      return new no(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof no && this.c.equals(((no)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dse.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
