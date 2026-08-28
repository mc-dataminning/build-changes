import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ty implements ut {
   private static final int c = 8;
   public static final uv<ty> a = new uv<ty>() {
      public ty a(DataInput $$0, uf $$1) {
         $$1.b(8L);
         return ty.b;
      }

      @Override
      public uq.b a(DataInput $$0, uq $$1, uf $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uf $$2) {
      }

      @Override
      public void b(DataInput $$0, uf $$1) {
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
   public static final ty b = new ty();

   private ty() {
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
   public uv<ty> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.p_();
   }

   public ty e() {
      return this;
   }

   @Override
   public void a(ux $$0) {
      $$0.a(this);
   }

   @Override
   public uq.b a(uq $$0) {
      return $$0.a();
   }
}
