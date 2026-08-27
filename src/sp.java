import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sp implements tk {
   private static final int c = 8;
   public static final tm<sp> a = new tm<sp>() {
      public sp a(DataInput $$0, sw $$1) {
         $$1.b(8L);
         return sp.b;
      }

      @Override
      public th.b a(DataInput $$0, th $$1, sw $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, sw $$2) {
      }

      @Override
      public void b(DataInput $$0, sw $$1) {
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
   public static final sp b = new sp();

   private sp() {
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
   public tm<sp> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public sp e() {
      return this;
   }

   @Override
   public void a(to $$0) {
      $$0.a(this);
   }

   @Override
   public th.b a(th $$0) {
      return $$0.a();
   }
}
