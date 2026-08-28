import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gru {
   public static final Comparator<gru> a = Comparator.<gru, akk>comparing(gru::a).thenComparing(gru::b);
   private final akk b;
   private final akk c;
   @Nullable
   private gen d;

   public gru(akk $$0, akk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akk a() {
      return this.b;
   }

   public akk b() {
      return this.c;
   }

   public gpq c() {
      return ffw.Q().a(this.a()).apply(this.b());
   }

   public gen a(Function<akk, gen> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fas a(gef $$0, Function<akk, gen> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fas a(gef $$0, Function<akk, gen> $$1, boolean $$2) {
      return this.c().a(gkm.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gru $$1 = (gru)$$0;
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
