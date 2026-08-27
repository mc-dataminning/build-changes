import java.util.BitSet;
import java.util.Set;

public class geq {
   private static final int a = is.values().length;
   private final BitSet b = new BitSet(a * a);

   public void a(Set<is> $$0) {
      for (is $$1 : $$0) {
         for (is $$2 : $$0) {
            this.a($$1, $$2, true);
         }
      }
   }

   public void a(is $$0, is $$1, boolean $$2) {
      this.b.set($$0.ordinal() + $$1.ordinal() * a, $$2);
      this.b.set($$1.ordinal() + $$0.ordinal() * a, $$2);
   }

   public void a(boolean $$0) {
      this.b.set(0, this.b.size(), $$0);
   }

   public boolean a(is $$0, is $$1) {
      return this.b.get($$0.ordinal() + $$1.ordinal() * a);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append(' ');

      for (is $$1 : is.values()) {
         $$0.append(' ').append($$1.toString().toUpperCase().charAt(0));
      }

      $$0.append('\n');

      for (is $$2 : is.values()) {
         $$0.append($$2.toString().toUpperCase().charAt(0));

         for (is $$3 : is.values()) {
            if ($$2 == $$3) {
               $$0.append("  ");
            } else {
               boolean $$4 = this.a($$2, $$3);
               $$0.append(' ').append((char)($$4 ? 'Y' : 'n'));
            }
         }

         $$0.append('\n');
      }

      return $$0.toString();
   }
}
