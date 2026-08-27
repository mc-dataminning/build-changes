import java.io.DataInput;
import java.io.IOException;

public interface rt<T extends rr> {
   T b(DataInput var1, int var2, rh var3) throws IOException;

   ro.b a(DataInput var1, ro var2) throws IOException;

   default void b(DataInput $$0, ro $$1) throws IOException {
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

   static rt<ra> a(final int $$0) {
      return new rt<ra>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public ra a(DataInput $$0x, int $$1, rh $$2) throws IOException {
            throw this.c();
         }

         @Override
         public ro.b a(DataInput $$0x, ro $$1) throws IOException {
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

   public interface a<T extends rr> extends rt<T> {
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

   public interface b<T extends rr> extends rt<T> {
      @Override
      default void a(DataInput $$0, int $$1) throws IOException {
         for (int $$2 = 0; $$2 < $$1; $$2++) {
            this.a($$0);
         }
      }
   }
}
