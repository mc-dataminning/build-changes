import java.io.DataInput;
import java.io.IOException;

public interface ru<T extends rs> {
   T c(DataInput var1, rh var2) throws IOException;

   rp.b a(DataInput var1, rp var2, rh var3) throws IOException;

   default void b(DataInput $$0, rp $$1, rh $$2) throws IOException {
      switch ($$1.b(this)) {
         case a:
            this.a($$0, $$1, $$2);
         case c:
         default:
            break;
         case b:
            this.b($$0, $$2);
      }
   }

   void a(DataInput var1, int var2, rh var3) throws IOException;

   void b(DataInput var1, rh var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static ru<ra> a(final int $$0) {
      return new ru<ra>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public ra a(DataInput $$0x, rh $$1) throws IOException {
            throw this.c();
         }

         @Override
         public rp.b a(DataInput $$0x, rp $$1, rh $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, rh $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, rh $$1) throws IOException {
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

   public interface a<T extends rs> extends ru<T> {
      @Override
      default void b(DataInput $$0, rh $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, rh $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends rs> extends ru<T> {
      @Override
      default void a(DataInput $$0, int $$1, rh $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
