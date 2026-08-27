import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class nk {
   private static final nk a = new nk(ImmutableList.of());
   private static final Comparator<drb.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<drb.a<?>> c;

   public nk a(drb.a<?> $$0) {
      return new nk(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public nk a(nk $$0) {
      return new nk(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private nk(List<drb.a<?>> $$0) {
      this.c = $$0;
   }

   public static nk a() {
      return a;
   }

   public static nk a(drb.a<?>... $$0) {
      return new nk(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof nk && this.c.equals(((nk)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(drb.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
