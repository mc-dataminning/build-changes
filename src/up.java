import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class up implements vk {
   private static final int c = 8;
   public static final vm<up> a = new vm<up>() {
      public up a(DataInput $$0, uw $$1) {
         $$1.b(8L);
         return up.b;
      }

      @Override
      public vh.b a(DataInput $$0, vh $$1, uw $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uw $$2) {
      }

      @Override
      public void b(DataInput $$0, uw $$1) {
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
   public static final up b = new up();

   private up() {
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
   public vm<up> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public up e() {
      return this;
   }

   @Override
   public void a(vo $$0) {
      $$0.a(this);
   }

   @Override
   public vh.b a(vh $$0) {
      return $$0.a();
   }
}
