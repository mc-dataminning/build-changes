import java.util.HashSet;
import java.util.Set;

public record xs(Set<iu> b, Set<iu> c) implements xd {
   public static final agi a = new agi("debug/village_sections");

   public xs(tu $$0) {
      this($$0.a(HashSet::new, tu::g), $$0.a(HashSet::new, tu::g));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.b, tu::a);
      $$0.a(this.c, tu::a);
   }

   @Override
   public agi a() {
      return a;
   }
}
