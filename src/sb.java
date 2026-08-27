import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sb implements sw {
   private static final int c = 8;
   public static final sy<sb> a = new sy<sb>() {
      public sb a(DataInput $$0, si $$1) {
         $$1.b(8L);
         return sb.b;
      }

      @Override
      public st.b a(DataInput $$0, st $$1, si $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, si $$2) {
      }

      @Override
      public void b(DataInput $$0, si $$1) {
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
   public static final sb b = new sb();

   private sb() {
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
   public sy<sb> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public sb e() {
      return this;
   }

   @Override
   public void a(ta $$0) {
      $$0.a(this);
   }

   @Override
   public st.b a(st $$0) {
      return $$0.a();
   }
}
