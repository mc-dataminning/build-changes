import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ui implements vd {
   private static final int c = 8;
   public static final vf<ui> a = new vf<ui>() {
      public ui a(DataInput $$0, up $$1) {
         $$1.b(8L);
         return ui.b;
      }

      @Override
      public va.b a(DataInput $$0, va $$1, up $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, up $$2) {
      }

      @Override
      public void b(DataInput $$0, up $$1) {
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
   public static final ui b = new ui();

   private ui() {
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
   public vf<ui> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public ui e() {
      return this;
   }

   @Override
   public void a(vh $$0) {
      $$0.a(this);
   }

   @Override
   public va.b a(va $$0) {
      return $$0.a();
   }
}
