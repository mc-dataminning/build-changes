import java.util.HashSet;
import java.util.Set;

public record yp(Set<iz> b, Set<iz> c) implements ya {
   public static final ahg a = new ahg("debug/village_sections");

   public yp(ui $$0) {
      this($$0.a(HashSet::new, ui::g), $$0.a(HashSet::new, ui::g));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.b, ui::a);
      $$0.a(this.c, ui::a);
   }

   @Override
   public ahg a() {
      return a;
   }
}
