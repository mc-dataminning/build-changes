import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class um implements vh {
   private static final int c = 8;
   public static final vj<um> a = new vj<um>() {
      public um a(DataInput $$0, ut $$1) {
         $$1.b(8L);
         return um.b;
      }

      @Override
      public ve.b a(DataInput $$0, ve $$1, ut $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, ut $$2) {
      }

      @Override
      public void b(DataInput $$0, ut $$1) {
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
   public static final um b = new um();

   private um() {
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
   public vj<um> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public um e() {
      return this;
   }

   @Override
   public void a(vl $$0) {
      $$0.a(this);
   }

   @Override
   public ve.b a(ve $$0) {
      return $$0.a();
   }
}
