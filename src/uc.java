import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uc implements ux {
   private static final int c = 8;
   public static final uz<uc> a = new uz<uc>() {
      public uc a(DataInput $$0, uj $$1) {
         $$1.b(8L);
         return uc.b;
      }

      @Override
      public uu.b a(DataInput $$0, uu $$1, uj $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, uj $$2) {
      }

      @Override
      public void b(DataInput $$0, uj $$1) {
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
   public static final uc b = new uc();

   private uc() {
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
   public uz<uc> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public uc e() {
      return this;
   }

   @Override
   public void a(vb $$0) {
      $$0.a(this);
   }

   @Override
   public uu.b a(uu $$0) {
      return $$0.a();
   }
}
