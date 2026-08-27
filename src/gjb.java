import com.google.common.annotations.VisibleForTesting;
import java.util.Locale;
import javax.annotation.Nullable;

public class gjb extends aiy {
   @VisibleForTesting
   static final char f = '#';
   private final String g;

   private gjb(String $$0, String $$1, String $$2, @Nullable aiy.a $$3) {
      super($$0, $$1, $$3);
      this.g = $$2;
   }

   public gjb(String $$0, String $$1, String $$2) {
      super($$0, $$1);
      this.g = j($$2);
   }

   public gjb(aiy $$0, String $$1) {
      this($$0.b(), $$0.a(), j($$1), null);
   }

   public static gjb c(String $$0, String $$1) {
      return new gjb("minecraft", $$0, $$1);
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
      } else if ($$0 instanceof gjb && super.equals($$0)) {
         gjb $$1 = (gjb)$$0;
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
