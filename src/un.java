import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class un implements vi {
   private static final int c = 8;
   public static final vk<un> a = new vk<un>() {
      public un a(DataInput $$0, uu $$1) {
         $$1.b(8L);
         return un.b;
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, uu $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uu $$2) {
      }

      @Override
      public void b(DataInput $$0, uu $$1) {
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
   public static final un b = new un();

   private un() {
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
   public vk<un> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public un e() {
      return this;
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   @Override
   public vf.b a(vf $$0) {
      return $$0.a();
   }
}
