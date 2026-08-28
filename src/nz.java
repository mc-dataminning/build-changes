import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class nz {
   private static final nz a = new nz(ImmutableList.of());
   private static final Comparator<dte.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dte.a<?>> c;

   public nz a(dte.a<?> $$0) {
      return new nz(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public nz a(nz $$0) {
      return new nz(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private nz(List<dte.a<?>> $$0) {
      this.c = $$0;
   }

   public static nz a() {
      return a;
   }

   public static nz a(dte.a<?>... $$0) {
      return new nz(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof nz && this.c.equals(((nz)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dte.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
