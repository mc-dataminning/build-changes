import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class la {
   private static final la a = new la(ImmutableList.of());
   private static final Comparator<dgg.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dgg.a<?>> c;

   public la a(dgg.a<?> $$0) {
      return new la(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public la a(la $$0) {
      return new la(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private la(List<dgg.a<?>> $$0) {
      this.c = $$0;
   }

   public static la a() {
      return a;
   }

   public static la a(dgg.a<?>... $$0) {
      return new la(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof la && this.c.equals(((la)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dgg.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
