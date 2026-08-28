import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uu implements vp {
   private static final int c = 8;
   public static final vr<uu> a = new vr<uu>() {
      public uu a(DataInput $$0, vb $$1) {
         $$1.b(8L);
         return uu.b;
      }

      @Override
      public vm.b a(DataInput $$0, vm $$1, vb $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, vb $$2) {
      }

      @Override
      public void b(DataInput $$0, vb $$1) {
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
   public static final uu b = new uu();

   private uu() {
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
   public vr<uu> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public uu e() {
      return this;
   }

   @Override
   public void a(vt $$0) {
      $$0.a(this);
   }

   @Override
   public vm.b a(vm $$0) {
      return $$0.a();
   }
}
