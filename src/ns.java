import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class ns {
   private static final ns a = new ns(ImmutableList.of());
   private static final Comparator<dto.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dto.a<?>> c;

   public ns a(dto.a<?> $$0) {
      return new ns(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public ns a(ns $$0) {
      return new ns(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private ns(List<dto.a<?>> $$0) {
      this.c = $$0;
   }

   public static ns a() {
      return a;
   }

   public static ns a(dto.a<?>... $$0) {
      return new ns(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof ns && this.c.equals(((ns)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dto.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
