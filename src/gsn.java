import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class gsn extends akq {
   @VisibleForTesting
   static final char g = '#';
   private final String h;

   private gsn(String $$0, String $$1, String $$2, @Nullable akq.a $$3) {
      super($$0, $$1, $$3);
      this.h = $$2;
   }

   public gsn(String $$0, String $$1, String $$2) {
      super($$0, $$1);
      this.h = l($$2);
   }

   public gsn(akq $$0, String $$1) {
      this($$0.b(), $$0.a(), l($$1), null);
   }

   public static gsn d(String $$0, String $$1) {
      return new gsn("minecraft", $$0, $$1);
   }

   private static String l(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }

   public String f() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 instanceof gsn && super.equals($$0)) {
         gsn $$1 = (gsn)$$0;
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
