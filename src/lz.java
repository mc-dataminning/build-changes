import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class lz {
   private static final lz a = new lz(ImmutableList.of());
   private static final Comparator<dhz.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dhz.a<?>> c;

   public lz a(dhz.a<?> $$0) {
      return new lz(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public lz a(lz $$0) {
      return new lz(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private lz(List<dhz.a<?>> $$0) {
      this.c = $$0;
   }

   public static lz a() {
      return a;
   }

   public static lz a(dhz.a<?>... $$0) {
      return new lz(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof lz && this.c.equals(((lz)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dhz.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
