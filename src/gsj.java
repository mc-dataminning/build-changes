import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gsj {
   public static final Comparator<gsj> a = Comparator.<gsj, akq>comparing(gsj::a).thenComparing(gsj::b);
   private final akq b;
   private final akq c;
   @Nullable
   private gfb d;

   public gsj(akq $$0, akq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akq a() {
      return this.b;
   }

   public akq b() {
      return this.c;
   }

   public gqf c() {
      return fgi.Q().a(this.a()).apply(this.b());
   }

   public gfb a(Function<akq, gfb> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fbg a(get $$0, Function<akq, gfb> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fbg a(get $$0, Function<akq, gfb> $$1, boolean $$2) {
      return this.c().a(glb.b($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gsj $$1 = (gsj)$$0;
         return this.b.equals($$1.b) && this.c.equals($$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c);
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.b + ", texture=" + this.c + "}";
   }
}
