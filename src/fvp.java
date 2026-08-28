import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class fvp implements AutoCloseable {
   private static final ald a = ald.b("textures/misc/unknown_server.png");
   private static final int b = 64;
   private static final int c = 64;
   private final hgu d;
   private final ald e;
   @Nullable
   private hgf f;
   private boolean g;

   private fvp(hgu $$0, ald $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static fvp a(hgu $$0, String $$1) {
      return new fvp($$0, ald.b("worlds/" + af.a($$1, ald::b) + "/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public static fvp b(hgu $$0, String $$1) {
      return new fvp($$0, ald.b("servers/" + Hashing.sha1().hashUnencodedChars($$1) + "/icon"));
   }

   public void a(fgo $$0) {
      if ($$0.a() == 64 && $$0.b() == 64) {
         try {
            this.c();
            if (this.f == null) {
               this.f = new hgf($$0);
            } else {
               this.f.a($$0);
               this.f.d();
            }

            this.d.a(this.e, this.f);
         } catch (Throwable var3) {
            $$0.close();
            this.a();
            throw var3;
         }
      } else {
         $$0.close();
         throw new IllegalArgumentException("Icon must be 64x64, but was " + $$0.a() + "x" + $$0.b());
      }
   }

   public void a() {
      this.c();
      if (this.f != null) {
         this.d.c(this.e);
         this.f.close();
         this.f = null;
      }
   }

   public ald b() {
      return this.f != null ? this.e : a;
   }

   @Override
   public void close() {
      this.a();
      this.g = true;
   }

   private void c() {
      if (this.g) {
         throw new IllegalStateException("Icon already closed");
      }
   }
}
