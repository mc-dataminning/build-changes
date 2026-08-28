import java.io.DataInput;
import java.io.IOException;

public interface ve<T extends vc> {
   T c(DataInput var1, uo var2) throws IOException;

   uz.b a(DataInput var1, uz var2, uo var3) throws IOException;

   default void b(DataInput $$0, uz $$1, uo $$2) throws IOException {
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

   void a(DataInput var1, int var2, uo var3) throws IOException;

   void b(DataInput var1, uo var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static ve<uh> a(final int $$0) {
      return new ve<uh>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public uh a(DataInput $$0x, uo $$1) throws IOException {
            throw this.c();
         }

         @Override
         public uz.b a(DataInput $$0x, uz $$1, uo $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, uo $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, uo $$1) throws IOException {
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

   public interface a<T extends vc> extends ve<T> {
      @Override
      default void b(DataInput $$0, uo $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, uo $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends vc> extends ve<T> {
      @Override
      default void a(DataInput $$0, int $$1, uo $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
