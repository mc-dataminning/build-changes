import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ut implements vo {
   private static final int c = 8;
   public static final vq<ut> a = new vq<ut>() {
      public ut a(DataInput $$0, va $$1) {
         $$1.b(8L);
         return ut.b;
      }

      @Override
      public vl.b a(DataInput $$0, vl $$1, va $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, va $$2) {
      }

      @Override
      public void b(DataInput $$0, va $$1) {
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
   public static final ut b = new ut();

   private ut() {
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
   public vq<ut> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public ut e() {
      return this;
   }

   @Override
   public void a(vs $$0) {
      $$0.a(this);
   }

   @Override
   public vl.b a(vl $$0) {
      return $$0.a();
   }
}
