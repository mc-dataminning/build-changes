import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class mj {
   private static final mj a = new mj(ImmutableList.of());
   private static final Comparator<dmm.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dmm.a<?>> c;

   public mj a(dmm.a<?> $$0) {
      return new mj(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public mj a(mj $$0) {
      return new mj(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private mj(List<dmm.a<?>> $$0) {
      this.c = $$0;
   }

   public static mj a() {
      return a;
   }

   public static mj a(dmm.a<?>... $$0) {
      return new mj(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof mj && this.c.equals(((mj)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dmm.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
