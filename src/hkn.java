import javax.annotation.Nullable;

public abstract class hkn implements AutoCloseable {
   @Nullable
   protected flj a;
   protected boolean b;

   public void a(boolean $$0) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't change its clamp before something initializes it");
      } else {
         this.a.a($$0 ? flh.b : flh.a);
      }
   }

   public void a(baw $$0, boolean $$1) {
      this.a($$0.a(this.b), $$1);
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get change its filter before something initializes it");
      } else {
         this.a.a($$0 ? fli.b : fli.a, $$1);
      }
   }

   @Override
   public void close() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }
   }

   public flj a() {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
      } else {
         return this.a;
      }
   }
}
