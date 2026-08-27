import java.util.HashSet;
import java.util.Set;

public record wl(Set<hz> b, Set<hz> c) implements vw {
   public static final aex a = new aex("debug/village_sections");

   public wl(so $$0) {
      this($$0.a(HashSet::new, so::g), $$0.a(HashSet::new, so::g));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.b, so::a);
      $$0.a(this.c, so::a);
   }

   @Override
   public aex a() {
      return a;
   }
}
