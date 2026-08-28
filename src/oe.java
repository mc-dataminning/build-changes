import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class oe {
   private static final oe a = new oe(ImmutableList.of());
   private static final Comparator<dwm.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dwm.a<?>> c;

   public oe a(dwm.a<?> $$0) {
      return new oe(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public oe a(oe $$0) {
      return new oe(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private oe(List<dwm.a<?>> $$0) {
      this.c = $$0;
   }

   public static oe a() {
      return a;
   }

   public static oe a(dwm.a<?>... $$0) {
      return new oe(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof oe && this.c.equals(((oe)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dwm.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
