import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class oa {
   private static final oa a = new oa(ImmutableList.of());
   private static final Comparator<dvv.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dvv.a<?>> c;

   public oa a(dvv.a<?> $$0) {
      return new oa(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public oa a(oa $$0) {
      return new oa(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private oa(List<dvv.a<?>> $$0) {
      this.c = $$0;
   }

   public static oa a() {
      return a;
   }

   public static oa a(dvv.a<?>... $$0) {
      return new oa(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof oa && this.c.equals(((oa)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dvv.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
