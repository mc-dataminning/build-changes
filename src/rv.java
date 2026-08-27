import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class rv implements sn {
   private static final int c = 8;
   public static final sp<rv> a = new sp<rv>() {
      public rv a(DataInput $$0, sc $$1) {
         $$1.b(8L);
         return rv.b;
      }

      @Override
      public sk.b a(DataInput $$0, sk $$1, sc $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, sc $$2) {
      }

      @Override
      public void b(DataInput $$0, sc $$1) {
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
   public static final rv b = new rv();

   private rv() {
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
   public sp<rv> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public rv e() {
      return this;
   }

   @Override
   public void a(sr $$0) {
      $$0.a(this);
   }

   @Override
   public sk.b a(sk $$0) {
      return $$0.a();
   }
}
