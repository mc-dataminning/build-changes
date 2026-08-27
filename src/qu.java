import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qu implements rl {
   private static final int c = 8;
   public static final rn<qu> a = new rn<qu>() {
      public qu a(DataInput $$0, int $$1, rb $$2) {
         $$2.a(8L);
         return qu.b;
      }

      @Override
      public ri.b a(DataInput $$0, ri $$1) {
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
   public static final qu b = new qu();

   private qu() {
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
   public rn<qu> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.m_();
   }

   public qu e() {
      return this;
   }

   @Override
   public void a(rp $$0) {
      $$0.a(this);
   }

   @Override
   public ri.b a(ri $$0) {
      return $$0.a();
   }
}
