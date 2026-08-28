import java.io.DataInput;
import java.io.IOException;

public interface vm<T extends vk> {
   T c(DataInput var1, uw var2) throws IOException;

   vh.b a(DataInput var1, vh var2, uw var3) throws IOException;

   default void b(DataInput $$0, vh $$1, uw $$2) throws IOException {
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

   void a(DataInput var1, int var2, uw var3) throws IOException;

   void b(DataInput var1, uw var2) throws IOException;

   default boolean d() {
      return false;
   }

   String a();

   String b();

   static vm<up> a(final int $$0) {
      return new vm<up>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public up a(DataInput $$0x, uw $$1) throws IOException {
            throw this.c();
         }

         @Override
         public vh.b a(DataInput $$0x, vh $$1, uw $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, uw $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, uw $$1) throws IOException {
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

   public interface a<T extends vk> extends vm<T> {
      @Override
      default void b(DataInput $$0, uw $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, uw $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends vk> extends vm<T> {
      @Override
      default void a(DataInput $$0, int $$1, uw $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
