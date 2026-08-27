import java.util.HashSet;
import java.util.Set;

public record wm(Set<hz> b, Set<hz> c) implements vx {
   public static final aex a = new aex("debug/village_sections");

   public wm(sp $$0) {
      this($$0.a(HashSet::new, sp::g), $$0.a(HashSet::new, sp::g));
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.b, sp::a);
      $$0.a(this.c, sp::a);
   }

   @Override
   public aex a() {
      return a;
   }
}
