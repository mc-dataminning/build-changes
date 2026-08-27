import java.io.DataInput;
import java.io.IOException;

public interface sp<T extends sn> {
   T c(DataInput var1, sc var2) throws IOException;

   sk.b a(DataInput var1, sk var2, sc var3) throws IOException;

   default void b(DataInput $$0, sk $$1, sc $$2) throws IOException {
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

   void a(DataInput var1, int var2, sc var3) throws IOException;

   void b(DataInput var1, sc var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static sp<rv> a(final int $$0) {
      return new sp<rv>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public rv a(DataInput $$0x, sc $$1) throws IOException {
            throw this.c();
         }

         @Override
         public sk.b a(DataInput $$0x, sk $$1, sc $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, sc $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, sc $$1) throws IOException {
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

   public interface a<T extends sn> extends sp<T> {
      @Override
      default void b(DataInput $$0, sc $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, sc $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends sn> extends sp<T> {
      @Override
      default void a(DataInput $$0, int $$1, sc $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
