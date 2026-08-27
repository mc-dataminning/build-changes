import java.util.HashSet;
import java.util.Set;

public record ym(Set<iz> b, Set<iz> c) implements xx {
   public static final ahd a = new ahd("debug/village_sections");

   public ym(ug $$0) {
      this($$0.a(HashSet::new, ug::g), $$0.a(HashSet::new, ug::g));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.b, ug::a);
      $$0.a(this.c, ug::a);
   }

   @Override
   public ahd a() {
      return a;
   }
}
