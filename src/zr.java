import java.util.HashSet;
import java.util.Set;

public record zr(Set<je> c, Set<je> d) implements zc {
   public static final xs<uu, zr> a = zc.a(zr::a, zr::new);
   public static final zc.b<zr> b = zc.a("debug/village_sections");

   private zr(uu $$0) {
      this($$0.a(HashSet::new, uu::g), $$0.a(HashSet::new, uu::g));
   }

   private void a(uu $$0) {
      $$0.a(this.c, uu::a);
      $$0.a(this.d, uu::a);
   }

   @Override
   public zc.b<zr> a() {
      return b;
   }

   public Set<je> b() {
      return this.c;
   }

   public Set<je> c() {
      return this.d;
   }
}
