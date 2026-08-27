import java.util.HashSet;
import java.util.Set;

public record yd(Set<ix> b, Set<ix> c) implements xo {
   public static final agt a = new agt("debug/village_sections");

   public yd(ue $$0) {
      this($$0.a(HashSet::new, ue::g), $$0.a(HashSet::new, ue::g));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.b, ue::a);
      $$0.a(this.c, ue::a);
   }

   @Override
   public agt a() {
      return a;
   }
}
