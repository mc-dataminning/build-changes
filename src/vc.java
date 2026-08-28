import java.io.DataInput;
import java.io.IOException;

public interface vc<T extends va> {
   T c(DataInput var1, uj var2) throws IOException;

   ux.b a(DataInput var1, ux var2, uj var3) throws IOException;

   default void b(DataInput $$0, ux $$1, uj $$2) throws IOException {
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

   void a(DataInput var1, int var2, uj var3) throws IOException;

   void b(DataInput var1, uj var2) throws IOException;

   String a();

   String b();

   static vc<uc> a(final int $$0) {
      return new vc<uc>() {
         private IOException c() {
            return new IOException("Invalid tag id: " + $$0);
         }

         public uc a(DataInput $$0x, uj $$1) throws IOException {
            throw this.c();
         }

         @Override
         public ux.b a(DataInput $$0x, ux $$1, uj $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void a(DataInput $$0x, int $$1, uj $$2) throws IOException {
            throw this.c();
         }

         @Override
         public void b(DataInput $$0x, uj $$1) throws IOException {
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

   public interface a<T extends va> extends vc<T> {
      @Override
      default void b(DataInput $$0, uj $$1) throws IOException {
         $$0.skipBytes(this.c());
      }

      @Override
      default void a(DataInput $$0, int $$1, uj $$2) throws IOException {
         $$0.skipBytes(this.c() * $$1);
      }

      int c();
   }

   public interface b<T extends va> extends vc<T> {
      @Override
      default void a(DataInput $$0, int $$1, uj $$2) throws IOException {
         for (int $$3 = 0; $$3 < $$1; $$3++) {
            this.b($$0, $$2);
         }
      }
   }
}
