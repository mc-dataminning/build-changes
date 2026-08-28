import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class tz implements uu {
   private static final int c = 8;
   public static final uw<tz> a = new uw<tz>() {
      public tz a(DataInput $$0, ug $$1) {
         $$1.b(8L);
         return tz.b;
      }

      @Override
      public ur.b a(DataInput $$0, ur $$1, ug $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, ug $$2) {
      }

      @Override
      public void b(DataInput $$0, ug $$1) {
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
   public static final tz b = new tz();

   private tz() {
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
   public uw<tz> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public tz e() {
      return this;
   }

   @Override
   public void a(uy $$0) {
      $$0.a(this);
   }

   @Override
   public ur.b a(ur $$0) {
      return $$0.a();
   }
}
