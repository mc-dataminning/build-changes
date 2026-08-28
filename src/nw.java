import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class nw {
   private static final nw a = new nw(ImmutableList.of());
   private static final Comparator<duf.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<duf.a<?>> c;

   public nw a(duf.a<?> $$0) {
      return new nw(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public nw a(nw $$0) {
      return new nw(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private nw(List<duf.a<?>> $$0) {
      this.c = $$0;
   }

   public static nw a() {
      return a;
   }

   public static nw a(duf.a<?>... $$0) {
      return new nw(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof nw && this.c.equals(((nw)$$0).c);
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
