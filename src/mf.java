import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class mf {
   private static final mf a = new mf(ImmutableList.of());
   private static final Comparator<dkd.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dkd.a<?>> c;

   public mf a(dkd.a<?> $$0) {
      return new mf(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public mf a(mf $$0) {
      return new mf(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private mf(List<dkd.a<?>> $$0) {
      this.c = $$0;
   }

   public static mf a() {
      return a;
   }

   public static mf a(dkd.a<?>... $$0) {
      return new mf(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof mf && this.c.equals(((mf)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dkd.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
