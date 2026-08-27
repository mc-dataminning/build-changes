import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ta implements tv {
   private static final int c = 8;
   public static final tx<ta> a = new tx<ta>() {
      public ta a(DataInput $$0, th $$1) {
         $$1.b(8L);
         return ta.b;
      }

      @Override
      public ts.b a(DataInput $$0, ts $$1, th $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, th $$2) {
      }

      @Override
      public void b(DataInput $$0, th $$1) {
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
   public static final ta b = new ta();

   private ta() {
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
   public tx<ta> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public ta e() {
      return this;
   }

   @Override
   public void a(tz $$0) {
      $$0.a(this);
   }

   @Override
   public ts.b a(ts $$0) {
      return $$0.a();
   }
}
