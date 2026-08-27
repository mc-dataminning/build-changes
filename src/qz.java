import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qz implements rq {
   private static final int c = 8;
   public static final rs<qz> a = new rs<qz>() {
      public qz a(DataInput $$0, int $$1, rg $$2) {
         $$2.a(8L);
         return qz.b;
      }

      @Override
      public rn.b a(DataInput $$0, rn $$1) {
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
   public static final qz b = new qz();

   private qz() {
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
   public rs<qz> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.r_();
   }

   public qz e() {
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
