import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class mh {
   private static final mh a = new mh(ImmutableList.of());
   private static final Comparator<dkj.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dkj.a<?>> c;

   public mh a(dkj.a<?> $$0) {
      return new mh(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public mh a(mh $$0) {
      return new mh(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private mh(List<dkj.a<?>> $$0) {
      this.c = $$0;
   }

   public static mh a() {
      return a;
   }

   public static mh a(dkj.a<?>... $$0) {
      return new mh(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof mh && this.c.equals(((mh)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dkj.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
