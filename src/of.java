import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class of {
   private static final of a = new of(ImmutableList.of());
   private static final Comparator<dwq.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dwq.a<?>> c;

   public of a(dwq.a<?> $$0) {
      return new of(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public of a(of $$0) {
      return new of(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private of(List<dwq.a<?>> $$0) {
      this.c = $$0;
   }

   public static of a() {
      return a;
   }

   public static of a(dwq.a<?>... $$0) {
      return new of(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof of && this.c.equals(((of)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dwq.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
