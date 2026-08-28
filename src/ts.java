import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ts implements un {
   private static final int c = 8;
   public static final up<ts> a = new up<ts>() {
      public ts a(DataInput $$0, tz $$1) {
         $$1.b(8L);
         return ts.b;
      }

      @Override
      public uk.b a(DataInput $$0, uk $$1, tz $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, tz $$2) {
      }

      @Override
      public void b(DataInput $$0, tz $$1) {
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
   public static final ts b = new ts();

   private ts() {
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
   public up<ts> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.p_();
   }

   public ts e() {
      return this;
   }

   @Override
   public void a(ur $$0) {
      $$0.a(this);
   }

   @Override
   public uk.b a(uk $$0) {
      return $$0.a();
   }
}
