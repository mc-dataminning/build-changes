import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class tc implements tx {
   private static final int c = 8;
   public static final tz<tc> a = new tz<tc>() {
      public tc a(DataInput $$0, tj $$1) {
         $$1.b(8L);
         return tc.b;
      }

      @Override
      public tu.b a(DataInput $$0, tu $$1, tj $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, tj $$2) {
      }

      @Override
      public void b(DataInput $$0, tj $$1) {
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
   public static final tc b = new tc();

   private tc() {
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
   public tz<tc> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public tc e() {
      return this;
   }

   @Override
   public void a(ub $$0) {
      $$0.a(this);
   }

   @Override
   public tu.b a(tu $$0) {
      return $$0.a();
   }
}
