import java.util.HashSet;
import java.util.Set;

public record we(Set<hx> b, Set<hx> c) implements vp {
   public static final aer a = new aer("debug/village_sections");

   public we(si $$0) {
      this($$0.a(HashSet::new, si::g), $$0.a(HashSet::new, si::g));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.b, si::a);
      $$0.a(this.c, si::a);
   }

   @Override
   public aer a() {
      return a;
   }
}
