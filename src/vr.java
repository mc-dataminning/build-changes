import java.io.DataInput;
import java.io.IOException;

public interface vr<T extends vp> {
   T c(DataInput var1, vb var2) throws IOException;

   vm.b a(DataInput var1, vm var2, vb var3) throws IOException;

   default void b(DataInput $$0, vm $$1, vb $$2) throws IOException {
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

   void a(DataInput var1, int var2, vb var3) throws IOException;

   void b(DataInput var1, vb var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static vr<uu> a(final int $$0) {
      return new vr<uu>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public uu a(DataInput $$0x, vb $$1) throws IOException {
            throw this.c();
         }

         @Override
         public vm.b a(DataInput $$0x, vm $$1, vb $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, vb $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, vb $$1) throws IOException {
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

   public interface a<T extends vp> extends vr<T> {
      @Override
      default void b(DataInput $$0, vb $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, vb $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends vp> extends vr<T> {
      @Override
      default void a(DataInput $$0, int $$1, vb $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
