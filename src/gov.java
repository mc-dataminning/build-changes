import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class gov extends akf {
   @VisibleForTesting
   static final char f = '#';
   private final String g;

   private gov(String $$0, String $$1, String $$2, @Nullable akf.a $$3) {
      super($$0, $$1, $$3);
      this.g = $$2;
   }

   public gov(String $$0, String $$1, String $$2) {
      super($$0, $$1);
      this.g = j($$2);
   }

   public gov(akf $$0, String $$1) {
      this($$0.b(), $$0.a(), j($$1), null);
   }

   public static gov c(String $$0, String $$1) {
      return new gov("minecraft", $$0, $$1);
   }

   private static String j(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }

   public String f() {
      return this.g;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 instanceof gov && super.equals($$0)) {
         gov $$1 = (gov)$$0;
         return this.g.equals($$1.g);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.g.hashCode();
   }

   @Override
   public String toString() {
      return super.toString() + "#" + this.g;
   }
}
