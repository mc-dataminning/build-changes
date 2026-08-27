import java.util.HashSet;
import java.util.Set;

public record wm(Set<hw> b, Set<hw> c) implements vx {
   public static final aez a = new aez("debug/village_sections");

   public wm(so $$0) {
      this($$0.a(HashSet::new, so::g), $$0.a(HashSet::new, so::g));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.b, so::a);
      $$0.a(this.c, so::a);
   }

   @Override
   public aez a() {
      return a;
   }
}
