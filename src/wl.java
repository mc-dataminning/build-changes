import java.util.HashSet;
import java.util.Set;

public record wl(Set<hw> b, Set<hw> c) implements vw {
   public static final aew a = new aew("debug/village_sections");

   public wl(so $$0) {
      this($$0.a(HashSet::new, so::g), $$0.a(HashSet::new, so::g));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.b, so::a);
      $$0.a(this.c, so::a);
   }

   @Override
   public aew a() {
      return a;
   }
}
