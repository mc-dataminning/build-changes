import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sn implements ti {
   private static final int c = 8;
   public static final tk<sn> a = new tk<sn>() {
      public sn a(DataInput $$0, su $$1) {
         $$1.b(8L);
         return sn.b;
      }

      @Override
      public tf.b a(DataInput $$0, tf $$1, su $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, su $$2) {
      }

      @Override
      public void b(DataInput $$0, su $$1) {
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
   public static final sn b = new sn();

   private sn() {
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
   public tk<sn> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public sn e() {
      return this;
   }

   @Override
   public void a(tm $$0) {
      $$0.a(this);
   }

   @Override
   public tf.b a(tf $$0) {
      return $$0.a();
   }
}
