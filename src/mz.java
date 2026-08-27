import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class mz {
   private static final mz a = new mz(ImmutableList.of());
   private static final Comparator<dqc.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dqc.a<?>> c;

   public mz a(dqc.a<?> $$0) {
      return new mz(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public mz a(mz $$0) {
      return new mz(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private mz(List<dqc.a<?>> $$0) {
      this.c = $$0;
   }

   public static mz a() {
      return a;
   }

   public static mz a(dqc.a<?>... $$0) {
      return new mz(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof mz && this.c.equals(((mz)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dqc.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
