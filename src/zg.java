import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class zg implements vf<wy> {
   private final IntList a;

   public zg(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public zg(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public zg(sq $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
