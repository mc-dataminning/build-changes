import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class to implements uj {
   private static final int c = 8;
   public static final ul<to> a = new ul<to>() {
      public to a(DataInput $$0, tv $$1) {
         $$1.b(8L);
         return to.b;
      }

      @Override
      public ug.b a(DataInput $$0, ug $$1, tv $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, tv $$2) {
      }

      @Override
      public void b(DataInput $$0, tv $$1) {
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
   public static final to b = new to();

   private to() {
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
   public ul<to> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public to e() {
      return this;
   }

   @Override
   public void a(un $$0) {
      $$0.a(this);
   }

   @Override
   public ug.b a(ug $$0) {
      return $$0.a();
   }
}
