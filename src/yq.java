import java.util.HashSet;
import java.util.Set;

public record yq(Set<iz> b, Set<iz> c) implements yb {
   public static final ahh a = new ahh("debug/village_sections");

   public yq(uj $$0) {
      this($$0.a(HashSet::new, uj::g), $$0.a(HashSet::new, uj::g));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.b, uj::a);
      $$0.a(this.c, uj::a);
   }

   @Override
   public ahh a() {
      return a;
   }
}
