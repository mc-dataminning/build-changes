import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public final class ub implements uy {
   private static final int c = 8;
   public static final va<ub> a = new va<ub>() {
      public ub a(DataInput $$0, ui $$1) {
         $$1.b(8L);
         return ub.b;
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, ui $$2) {
      }

      @Override
      public void b(DataInput $$0, ui $$1) {
      }

      @Override
      public String a() {
         return "END";
      }

      @Override
      public String b() {
         return "TAG_End";
      }
   };
   public static final ub b = new ub();

   private ub() {
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
   public va<ub> c() {
      return a;
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public ub e() {
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
