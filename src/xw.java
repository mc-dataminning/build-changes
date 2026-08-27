import java.util.HashSet;
import java.util.Set;

public record xw(Set<iy> b, Set<iy> c) implements xh {
   public static final agm a = new agm("debug/village_sections");

   public xw(ty $$0) {
      this($$0.a(HashSet::new, ty::g), $$0.a(HashSet::new, ty::g));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.b, ty::a);
      $$0.a(this.c, ty::a);
   }

   @Override
   public agm a() {
      return a;
   }
}
