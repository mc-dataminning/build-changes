import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class gbh extends aeu {
   @VisibleForTesting
   static final char e = '#';
   private final String f;

   private gbh(String $$0, String $$1, String $$2, @Nullable aeu.a $$3) {
      super($$0, $$1, $$3);
      this.f = $$2;
   }

   public gbh(String $$0, String $$1, String $$2) {
      super($$0, $$1);
      this.f = j($$2);
   }

   public gbh(aeu $$0, String $$1) {
      this($$0.b(), $$0.a(), j($$1), null);
   }

   public static gbh c(String $$0, String $$1) {
      return new gbh("minecraft", $$0, $$1);
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
      } else if ($$0 instanceof gbh && super.equals($$0)) {
         gbh $$1 = (gbh)$$0;
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
