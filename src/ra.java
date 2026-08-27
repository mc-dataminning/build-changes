import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ra implements rr {
   private static final int c = 8;
   public static final rt<ra> a = new rt<ra>() {
      public ra a(DataInput $$0, int $$1, rh $$2) {
         $$2.a(8L);
         return ra.b;
      }

      @Override
      public ro.b a(DataInput $$0, ro $$1) {
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1) {
      }

      @Override
      public void a(DataInput $$0) {
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
   public rt<ra> c() {
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
   public void a(rv $$0) {
      $$0.a(this);
   }

   @Override
   public ro.b a(ro $$0) {
      return $$0.a();
   }
}
