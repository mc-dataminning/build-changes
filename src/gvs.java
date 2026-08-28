import java.util.BitSet;
import java.util.Set;

public class gvs {
   private static final int a = jb.values().length;
   private final BitSet b = new BitSet(a * a);

   public void a(Set<jb> $$0) {
      for (jb $$1 : $$0) {
         for (jb $$2 : $$0) {
            this.a($$1, $$2, true);
         }
      }
   }

   public void a(jb $$0, jb $$1, boolean $$2) {
      this.b.set($$0.ordinal() + $$1.ordinal() * a, $$2);
      this.b.set($$1.ordinal() + $$0.ordinal() * a, $$2);
   }

   public void a(boolean $$0) {
      this.b.set(0, this.b.size(), $$0);
   }

   public boolean a(jb $$0, jb $$1) {
      return this.b.get($$0.ordinal() + $$1.ordinal() * a);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append(' ');

      for (jb $$1 : jb.values()) {
         $$0.append(' ').append($$1.toString().toUpperCase().charAt(0));
      }

      $$0.append('\n');

      for (jb $$2 : jb.values()) {
         $$0.append($$2.toString().toUpperCase().charAt(0));

         for (jb $$3 : jb.values()) {
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
