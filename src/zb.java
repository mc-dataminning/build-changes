import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class zb implements va<ws> {
   private final IntList a;

   public zb(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public zb(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public zb(sl $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public IntList a() {
      return this.a;
   }
}
