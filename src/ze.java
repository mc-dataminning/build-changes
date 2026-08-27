import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ze implements vd<ww> {
   private final IntList a;

   public ze(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public ze(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public ze(so $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
