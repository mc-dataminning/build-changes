import java.io.DataInput;
import java.io.IOException;

public interface uv<T extends ut> {
   T c(DataInput var1, uf var2) throws IOException;

   uq.b a(DataInput var1, uq var2, uf var3) throws IOException;

   default void b(DataInput $$0, uq $$1, uf $$2) throws IOException {
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

   void a(DataInput var1, int var2, uf var3) throws IOException;

   void b(DataInput var1, uf var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static uv<ty> a(final int $$0) {
      return new uv<ty>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public ty a(DataInput $$0x, uf $$1) throws IOException {
            throw this.c();
         }

         @Override
         public uq.b a(DataInput $$0x, uq $$1, uf $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, uf $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, uf $$1) throws IOException {
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

   public interface a<T extends ut> extends uv<T> {
      @Override
      default void b(DataInput $$0, uf $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, uf $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends ut> extends uv<T> {
      @Override
      default void a(DataInput $$0, int $$1, uf $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
