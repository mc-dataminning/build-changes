import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class od {
   private static final od a = new od(ImmutableList.of());
   private static final Comparator<dwg.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dwg.a<?>> c;

   public od a(dwg.a<?> $$0) {
      return new od(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public od a(od $$0) {
      return new od(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private od(List<dwg.a<?>> $$0) {
      this.c = $$0;
   }

   public static od a() {
      return a;
   }

   public static od a(dwg.a<?>... $$0) {
      return new od(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof od && this.c.equals(((od)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dwg.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
