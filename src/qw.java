import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qw implements rn {
   private static final int c = 8;
   public static final rp<qw> a = new rp<qw>() {
      public qw a(DataInput $$0, int $$1, rd $$2) {
         $$2.a(8L);
         return qw.b;
      }

      @Override
      public rk.b a(DataInput $$0, rk $$1) {
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
   public static final qw b = new qw();

   private qw() {
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
   public rp<qw> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.m_();
   }

   public qw e() {
      return this;
   }

   @Override
   public void a(rr $$0) {
      $$0.a(this);
   }

   @Override
   public rk.b a(rk $$0) {
      return $$0.a();
   }
}
