import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class grf extends ale {
   @VisibleForTesting
   static final char g = '#';
   private final String h;

   private grf(String $$0, String $$1, String $$2, @Nullable ale.a $$3) {
      super($$0, $$1, $$3);
      this.h = $$2;
   }

   public grf(String $$0, String $$1, String $$2) {
      super($$0, $$1);
      this.h = j($$2);
   }

   public grf(ale $$0, String $$1) {
      this($$0.b(), $$0.a(), j($$1), null);
   }

   public static grf c(String $$0, String $$1) {
      return new grf("minecraft", $$0, $$1);
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
      } else if ($$0 instanceof grf && super.equals($$0)) {
         grf $$1 = (grf)$$0;
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
