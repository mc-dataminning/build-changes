import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ul implements vg {
   private static final int c = 8;
   public static final vi<ul> a = new vi<ul>() {
      public ul a(DataInput $$0, us $$1) {
         $$1.b(8L);
         return ul.b;
      }

      @Override
      public vd.b a(DataInput $$0, vd $$1, us $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, us $$2) {
      }

      @Override
      public void b(DataInput $$0, us $$1) {
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
   public static final ul b = new ul();

   private ul() {
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
   public vi<ul> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public ul e() {
      return this;
   }

   @Override
   public void a(vk $$0) {
      $$0.a(this);
   }

   @Override
   public vd.b a(vd $$0) {
      return $$0.a();
   }
}
