import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sl implements tg {
   private static final int c = 8;
   public static final ti<sl> a = new ti<sl>() {
      public sl a(DataInput $$0, ss $$1) {
         $$1.b(8L);
         return sl.b;
      }

      @Override
      public td.b a(DataInput $$0, td $$1, ss $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, ss $$2) {
      }

      @Override
      public void b(DataInput $$0, ss $$1) {
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
   public static final sl b = new sl();

   private sl() {
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
   public ti<sl> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.t_();
   }

   public sl e() {
      return this;
   }

   @Override
   public void a(tk $$0) {
      $$0.a(this);
   }

   @Override
   public td.b a(td $$0) {
      return $$0.a();
   }
}
