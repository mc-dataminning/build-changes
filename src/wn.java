import java.util.HashSet;
import java.util.Set;

public record wn(Set<hz> b, Set<hz> c) implements vy {
   public static final aey a = new aey("debug/village_sections");

   public wn(sq $$0) {
      this($$0.a(HashSet::new, sq::g), $$0.a(HashSet::new, sq::g));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.b, sq::a);
      $$0.a(this.c, sq::a);
   }

   @Override
   public aey a() {
      return a;
   }
}
