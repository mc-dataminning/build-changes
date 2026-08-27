import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sy implements tt {
   private static final int c = 8;
   public static final tv<sy> a = new tv<sy>() {
      public sy a(DataInput $$0, tf $$1) {
         $$1.b(8L);
         return sy.b;
      }

      @Override
      public tq.b a(DataInput $$0, tq $$1, tf $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, tf $$2) {
      }

      @Override
      public void b(DataInput $$0, tf $$1) {
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
   public static final sy b = new sy();

   private sy() {
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
   public tv<sy> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public sy e() {
      return this;
   }

   @Override
   public void a(tx $$0) {
      $$0.a(this);
   }

   @Override
   public tq.b a(tq $$0) {
      return $$0.a();
   }
}
