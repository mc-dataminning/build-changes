import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class nv {
   private static final nv a = new nv(ImmutableList.of());
   private static final Comparator<dud.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<dud.a<?>> c;

   public nv a(dud.a<?> $$0) {
      return new nv(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public nv a(nv $$0) {
      return new nv(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private nv(List<dud.a<?>> $$0) {
      this.c = $$0;
   }

   public static nv a() {
      return a;
   }

   public static nv a(dud.a<?>... $$0) {
      return new nv(ImmutableList.copyOf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof nv && this.c.equals(((nv)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return this.c.stream().sorted(b).map(dud.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.b();
   }
}
