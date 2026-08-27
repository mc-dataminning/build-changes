import java.io.DataInput;
import java.io.IOException;

public interface rp<T extends rn> {
   T b(DataInput var1, int var2, rd var3) throws IOException;

   rk.b a(DataInput var1, rk var2) throws IOException;

   default void b(DataInput $$0, rk $$1) throws IOException {
      switch ($$1.b(this)) {
         case a:
            this.a($$0, $$1);
         case c:
         default:
            break;
         case b:
            this.a($$0);
      }
   }

   void a(DataInput var1, int var2) throws IOException;

   void a(DataInput var1) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static rp<qw> a(final int $$0) {
      return new rp<qw>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public qw a(DataInput $$0x, int $$1, rd $$2) throws IOException {
            throw this.c();
         }

         @Override
         public rk.b a(DataInput $$0x, rk $$1) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x) throws IOException {
            throw this.c();
         }

         @Override
         public String a() {
            return "INVALID[" + $$0 + "]";
         }

         @Override
         public String b() {
            return "UNKNOWN_" + $$0;
         }
      };
   }

   public interface a<T extends rn> extends rp<T> {
      @Override
      default void a(DataInput $$0) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends rn> extends rp<T> {
      @Override
      default void a(DataInput $$0, int $$1) throws IOException {
         for (int $$2 = 0; $$2 < $$1; $$2++) {
            this.a($$0);
         }
      }
   }
}
