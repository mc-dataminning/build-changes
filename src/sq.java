import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sq implements tl {
   private static final int c = 8;
   public static final tn<sq> a = new tn<sq>() {
      public sq a(DataInput $$0, sx $$1) {
         $$1.b(8L);
         return sq.b;
      }

      @Override
      public ti.b a(DataInput $$0, ti $$1, sx $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, sx $$2) {
      }

      @Override
      public void b(DataInput $$0, sx $$1) {
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
   public static final sq b = new sq();

   private sq() {
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
   public tn<sq> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public sq e() {
      return this;
   }

   @Override
   public void a(tp $$0) {
      $$0.a(this);
   }

   @Override
   public ti.b a(ti $$0) {
      return $$0.a();
   }
}
