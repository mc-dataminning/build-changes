import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ud implements uy {
   private static final int c = 8;
   public static final va<ud> a = new va<ud>() {
      public ud a(DataInput $$0, uk $$1) {
         $$1.b(8L);
         return ud.b;
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, uk $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uk $$2) {
      }

      @Override
      public void b(DataInput $$0, uk $$1) {
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
   public static final ud b = new ud();

   private ud() {
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
   public va<ud> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public ud e() {
      return this;
   }

   @Override
   public void a(vc $$0) {
      $$0.a(this);
   }

   @Override
   public uv.b a(uv $$0) {
      return $$0.a();
   }
}
