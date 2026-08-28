import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uz implements vu {
   private static final int c = 8;
   public static final vw<uz> a = new vw<uz>() {
      public uz a(DataInput $$0, vg $$1) {
         $$1.b(8L);
         return uz.b;
      }

      @Override
      public vr.b a(DataInput $$0, vr $$1, vg $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, vg $$2) {
      }

      @Override
      public void b(DataInput $$0, vg $$1) {
      }

      @Override
      public String a() {
         return "END";
      }

      @Override
      public String b() {
         return "TAG_End";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   public static final uz b = new uz();

   private uz() {
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
   }

   @Override
   public int a() {
      return 8;
   }

   @Override
   public byte b() {
      return 0;
   }

   @Override
   public vw<uz> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.u_();
   }

   public uz e() {
      return this;
   }

   @Override
   public void a(vy $$0) {
      $$0.a(this);
   }

   @Override
   public vr.b a(vr $$0) {
      return $$0.a();
   }
}
