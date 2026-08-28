import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class gri extends alf {
   @VisibleForTesting
   static final char g = '#';
   private final String h;

   private gri(String $$0, String $$1, String $$2, @Nullable alf.a $$3) {
      super($$0, $$1, $$3);
      this.h = $$2;
   }

   public gri(String $$0, String $$1, String $$2) {
      super($$0, $$1);
      this.h = j($$2);
   }

   public gri(alf $$0, String $$1) {
      this($$0.b(), $$0.a(), j($$1), null);
   }

   public static gri c(String $$0, String $$1) {
      return new gri("minecraft", $$0, $$1);
   }

   private static String j(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }

   public String f() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 instanceof gri && super.equals($$0)) {
         gri $$1 = (gri)$$0;
         return this.h.equals($$1.h);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.h.hashCode();
   }

   @Override
   public String toString() {
      return super.toString() + "#" + this.h;
   }
}
