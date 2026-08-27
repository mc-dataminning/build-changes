import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class kz {
   private static final kz a = new kz(ImmutableList.of());
   private static final Comparator<dgb.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dgb.a<?>> c;

   public kz a(dgb.a<?> $$0) {
      return new kz(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public kz a(kz $$0) {
      return new kz(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private kz(List<dgb.a<?>> $$0) {
      this.c = $$0;
   }

   public static kz a() {
      return a;
   }

   public static kz a(dgb.a<?>... $$0) {
      return new kz(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof kz && this.c.equals(((kz)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dgb.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
