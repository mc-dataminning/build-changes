import java.util.HashSet;
import java.util.Set;

public record xj(Set<iu> b, Set<iu> c) implements wu {
   public static final afw a = new afw("debug/village_sections");

   public xj(tl $$0) {
      this($$0.a(HashSet::new, tl::g), $$0.a(HashSet::new, tl::g));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.b, tl::a);
      $$0.a(this.c, tl::a);
   }

   @Override
   public afw a() {
      return a;
   }
}
