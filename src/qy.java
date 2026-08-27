import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qy implements rq {
   private static final int c = 8;
   public static final rs<qy> a = new rs<qy>() {
      public qy a(DataInput $$0, rf $$1) {
         $$1.b(8L);
         return qy.b;
      }

      @Override
      public rn.b a(DataInput $$0, rn $$1, rf $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, rf $$2) {
      }

      @Override
      public void b(DataInput $$0, rf $$1) {
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
   public static final qy b = new qy();

   private qy() {
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
   public rs<qy> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.r_();
   }

   public qy e() {
      return this;
   }

   @Override
   public void a(ru $$0) {
      $$0.a(this);
   }

   @Override
   public rn.b a(rn $$0) {
      return $$0.a();
   }
}
