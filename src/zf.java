import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class zf implements ve<wx> {
   private final IntList a;

   public zf(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public zf(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public zf(so $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
