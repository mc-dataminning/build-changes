import java.io.DataInput;
import java.io.IOException;

public interface ul<T extends uj> {
   T c(DataInput var1, tv var2) throws IOException;

   ug.b a(DataInput var1, ug var2, tv var3) throws IOException;

   default void b(DataInput $$0, ug $$1, tv $$2) throws IOException {
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

   void a(DataInput var1, int var2, tv var3) throws IOException;

   void b(DataInput var1, tv var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static ul<to> a(final int $$0) {
      return new ul<to>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public to a(DataInput $$0x, tv $$1) throws IOException {
            throw this.c();
         }

         @Override
         public ug.b a(DataInput $$0x, ug $$1, tv $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, tv $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, tv $$1) throws IOException {
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

   public interface a<T extends uj> extends ul<T> {
      @Override
      default void b(DataInput $$0, tv $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, tv $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends uj> extends ul<T> {
      @Override
      default void a(DataInput $$0, int $$1, tv $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
