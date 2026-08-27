import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ra implements rs {
   private static final int c = 8;
   public static final ru<ra> a = new ru<ra>() {
      public ra a(DataInput $$0, rh $$1) {
         $$1.b(8L);
         return ra.b;
      }

      @Override
      public rp.b a(DataInput $$0, rp $$1, rh $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, rh $$2) {
      }

      @Override
      public void b(DataInput $$0, rh $$1) {
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
   public static final ra b = new ra();

   private ra() {
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
   public ru<ra> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.r_();
   }

   public ra e() {
      return this;
   }

   @Override
   public void a(rw $$0) {
      $$0.a(this);
   }

   @Override
   public rp.b a(rp $$0) {
      return $$0.a();
   }
}
