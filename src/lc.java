import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class lc {
   private static final lc a = new lc(ImmutableList.of());
   private static final Comparator<dgm.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dgm.a<?>> c;

   public lc a(dgm.a<?> $$0) {
      return new lc(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public lc a(lc $$0) {
      return new lc(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private lc(List<dgm.a<?>> $$0) {
      this.c = $$0;
   }

   public static lc a() {
      return a;
   }

   public static lc a(dgm.a<?>... $$0) {
      return new lc(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof lc && this.c.equals(((lc)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dgm.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
