import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uh implements vc {
   private static final int c = 8;
   public static final ve<uh> a = new ve<uh>() {
      public uh a(DataInput $$0, uo $$1) {
         $$1.b(8L);
         return uh.b;
      }

      @Override
      public uz.b a(DataInput $$0, uz $$1, uo $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uo $$2) {
      }

      @Override
      public void b(DataInput $$0, uo $$1) {
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
   public static final uh b = new uh();

   private uh() {
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
   public ve<uh> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.r_();
   }

   public uh e() {
      return this;
   }

   @Override
   public void a(vg $$0) {
      $$0.a(this);
   }

   @Override
   public uz.b a(uz $$0) {
      return $$0.a();
   }
}
