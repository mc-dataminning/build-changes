import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uf implements va {
   private static final int c = 8;
   public static final vc<uf> a = new vc<uf>() {
      public uf a(DataInput $$0, um $$1) {
         $$1.b(8L);
         return uf.b;
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, um $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, um $$2) {
      }

      @Override
      public void b(DataInput $$0, um $$1) {
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
   public static final uf b = new uf();

   private uf() {
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
   public vc<uf> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public uf e() {
      return this;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public ux.b a(ux $$0) {
      return $$0.a();
   }
}
