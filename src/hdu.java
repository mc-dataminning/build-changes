import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hdu {
   public static final Comparator<hdu> a = Comparator.<hdu, alz>comparing(hdu::a).thenComparing(hdu::b);
   private final alz b;
   private final alz c;
   @Nullable
   private glv d;

   public hdu(alz $$0, alz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alz a() {
      return this.b;
   }

   public alz b() {
      return this.c;
   }

   public hbl c() {
      return fmg.Q().a(this.a()).apply(this.b());
   }

   public glv a(Function<alz, glv> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fgw a(gll $$0, Function<alz, glv> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fgw a(gll $$0, Function<alz, glv> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gso.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hdu $$1 = (hdu)$$0;
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
