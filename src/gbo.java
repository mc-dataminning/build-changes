import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class gbo extends aey {
   @VisibleForTesting
   static final char e = '#';
   private final String f;

   private gbo(String $$0, String $$1, String $$2, @Nullable aey.a $$3) {
      super($$0, $$1, $$3);
      this.f = $$2;
   }

   public gbo(String $$0, String $$1, String $$2) {
      super($$0, $$1);
      this.f = j($$2);
   }

   public gbo(aey $$0, String $$1) {
      this($$0.b(), $$0.a(), j($$1), null);
   }

   public static gbo c(String $$0, String $$1) {
      return new gbo("minecraft", $$0, $$1);
   }

   private static String j(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }

   public String f() {
      return this.f;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 instanceof gbo && super.equals($$0)) {
         gbo $$1 = (gbo)$$0;
         return this.f.equals($$1.f);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.f.hashCode();
   }

   @Override
   public String toString() {
      return super.toString() + "#" + this.f;
   }
}
