import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class yx implements uw<wo> {
   private final IntList a;

   public yx(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public yx(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public yx(sh $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
