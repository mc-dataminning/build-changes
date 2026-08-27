import java.util.HashSet;
import java.util.Set;

public record wd(Set<hy> b, Set<hy> c) implements vo {
   public static final aep a = new aep("debug/village_sections");

   public wd(sh $$0) {
      this($$0.a(HashSet::new, sh::g), $$0.a(HashSet::new, sh::g));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b, sh::a);
      $$0.a(this.c, sh::a);
   }

   @Override
   public aep a() {
      return a;
   }
}
