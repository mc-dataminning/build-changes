import java.util.HashSet;
import java.util.Set;

public record wh(Set<hz> b, Set<hz> c) implements vs {
   public static final aeu a = new aeu("debug/village_sections");

   public wh(sl $$0) {
      this($$0.a(HashSet::new, sl::g), $$0.a(HashSet::new, sl::g));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.b, sl::a);
      $$0.a(this.c, sl::a);
   }

   @Override
   public aeu a() {
      return a;
   }
}
