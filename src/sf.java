import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sf implements ta {
   private static final int c = 8;
   public static final tc<sf> a = new tc<sf>() {
      public sf a(DataInput $$0, sm $$1) {
         $$1.b(8L);
         return sf.b;
      }

      @Override
      public sx.b a(DataInput $$0, sx $$1, sm $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, sm $$2) {
      }

      @Override
      public void b(DataInput $$0, sm $$1) {
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
   public static final sf b = new sf();

   private sf() {
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
   public tc<sf> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public sf e() {
      return this;
   }

   @Override
   public void a(te $$0) {
      $$0.a(this);
   }

   @Override
   public sx.b a(sx $$0) {
      return $$0.a();
   }
}
