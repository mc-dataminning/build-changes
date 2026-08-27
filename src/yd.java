import java.util.List;

public class yd implements uo<ur> {
   private final int a;
   private final int[] b;

   public yd(bfj $$0) {
      this.a = $$0.af();
      List<bfj> $$1 = $$0.cN();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).af();
      }
   }

   public yd(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.c();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int c() {
      return this.a;
   }
}
