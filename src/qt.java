import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qt implements rk {
   private static final int c = 8;
   public static final rm<qt> a = new rm<qt>() {
      public qt a(DataInput $$0, int $$1, ra $$2) {
         $$2.a(8L);
         return qt.b;
      }

      @Override
      public rh.b a(DataInput $$0, rh $$1) {
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
   public static final qt b = new qt();

   private qt() {
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
   public rm<qt> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.m_();
   }

   public qt e() {
      return this;
   }

   @Override
   public void a(ro $$0) {
      $$0.a(this);
   }

   @Override
   public rh.b a(rh $$0) {
      return $$0.a();
   }
}
