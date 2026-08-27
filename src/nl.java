import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class nl {
   private static final nl a = new nl(ImmutableList.of());
   private static final Comparator<drk.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<drk.a<?>> c;

   public nl a(drk.a<?> $$0) {
      return new nl(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public nl a(nl $$0) {
      return new nl(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private nl(List<drk.a<?>> $$0) {
      this.c = $$0;
   }

   public static nl a() {
      return a;
   }

   public static nl a(drk.a<?>... $$0) {
      return new nl(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof nl && this.c.equals(((nl)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(drk.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
