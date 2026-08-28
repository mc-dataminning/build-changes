import java.io.DataInput;
import java.io.IOException;

public interface vf<T extends vd> {
   T c(DataInput var1, up var2) throws IOException;

   va.b a(DataInput var1, va var2, up var3) throws IOException;

   default void b(DataInput $$0, va $$1, up $$2) throws IOException {
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

   void a(DataInput var1, int var2, up var3) throws IOException;

   void b(DataInput var1, up var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static vf<ui> a(final int $$0) {
      return new vf<ui>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public ui a(DataInput $$0x, up $$1) throws IOException {
            throw this.c();
         }

         @Override
         public va.b a(DataInput $$0x, va $$1, up $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, up $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, up $$1) throws IOException {
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

   public interface a<T extends vd> extends vf<T> {
      @Override
      default void b(DataInput $$0, up $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, up $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends vd> extends vf<T> {
      @Override
      default void a(DataInput $$0, int $$1, up $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
