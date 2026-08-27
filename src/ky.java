import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class ky {
   private static final ky a = new ky(ImmutableList.of());
   private static final Comparator<dde.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dde.a<?>> c;

   public ky a(dde.a<?> $$0) {
      return new ky(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public ky a(ky $$0) {
      return new ky(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private ky(List<dde.a<?>> $$0) {
      this.c = $$0;
   }

   public static ky a() {
      return a;
   }

   public static ky a(dde.a<?>... $$0) {
      return new ky(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof ky && this.c.equals(((ky)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dde.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
