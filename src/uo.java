import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uo implements vj {
   private static final int c = 8;
   public static final vl<uo> a = new vl<uo>() {
      public uo a(DataInput $$0, uv $$1) {
         $$1.b(8L);
         return uo.b;
      }

      @Override
      public vg.b a(DataInput $$0, vg $$1, uv $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uv $$2) {
      }

      @Override
      public void b(DataInput $$0, uv $$1) {
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
   public static final uo b = new uo();

   private uo() {
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
   public vl<uo> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.u_();
   }

   public uo e() {
      return this;
   }

   @Override
   public void a(vn $$0) {
      $$0.a(this);
   }

   @Override
   public vg.b a(vg $$0) {
      return $$0.a();
   }
}
