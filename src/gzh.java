import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gzh {
   public static final Comparator<gzh> a = Comparator.<gzh, alc>comparing(gzh::a).thenComparing(gzh::b);
   private final alc b;
   private final alc c;
   @Nullable
   private ghq d;

   public gzh(alc $$0, alc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alc a() {
      return this.b;
   }

   public alc b() {
      return this.c;
   }

   public gxb c() {
      return fil.Q().a(this.a()).apply(this.b());
   }

   public ghq a(Function<alc, ghq> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fdi a(ghg $$0, Function<alc, ghq> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fdi a(ghg $$0, Function<alc, ghq> $$1, boolean $$2, boolean $$3) {
      return this.c().a(goh.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gzh $$1 = (gzh)$$0;
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
