import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class yy implements ux<wp> {
   private final IntList a;

   public yy(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public yy(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public yy(si $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
