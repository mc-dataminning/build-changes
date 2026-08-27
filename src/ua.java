import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ua implements uv {
   private static final int c = 8;
   public static final ux<ua> a = new ux<ua>() {
      public ua a(DataInput $$0, uh $$1) {
         $$1.b(8L);
         return ua.b;
      }

      @Override
      public us.b a(DataInput $$0, us $$1, uh $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uh $$2) {
      }

      @Override
      public void b(DataInput $$0, uh $$1) {
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
   public static final ua b = new ua();

   private ua() {
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
   public ux<ua> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public ua e() {
      return this;
   }

   @Override
   public void a(uz $$0) {
      $$0.a(this);
   }

   @Override
   public us.b a(us $$0) {
      return $$0.a();
   }
}
