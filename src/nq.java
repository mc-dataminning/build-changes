import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class nq {
   private static final nq a = new nq(ImmutableList.of());
   private static final Comparator<duf.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<duf.a<?>> c;

   public nq a(duf.a<?> $$0) {
      return new nq(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public nq a(nq $$0) {
      return new nq(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private nq(List<duf.a<?>> $$0) {
      this.c = $$0;
   }

   public static nq a() {
      return a;
   }

   public static nq a(duf.a<?>... $$0) {
      return new nq(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof nq && this.c.equals(((nq)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(duf.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
