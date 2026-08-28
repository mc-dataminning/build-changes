import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class grm {
   public static final Comparator<grm> a = Comparator.<grm, akk>comparing(grm::a).thenComparing(grm::b);
   private final akk b;
   private final akk c;
   @Nullable
   private gef d;

   public grm(akk $$0, akk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akk a() {
      return this.b;
   }

   public akk b() {
      return this.c;
   }

   public gpi c() {
      return ffn.Q().a(this.a()).apply(this.b());
   }

   public gef a(Function<akk, gef> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fak a(gdx $$0, Function<akk, gef> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fak a(gdx $$0, Function<akk, gef> $$1, boolean $$2) {
      return this.c().a(gke.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         grm $$1 = (grm)$$0;
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
