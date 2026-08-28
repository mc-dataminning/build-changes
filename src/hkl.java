import javax.annotation.Nullable;

public abstract class hkl implements AutoCloseable {
   @Nullable
   protected flh a;
   protected boolean b;

   public void a(boolean $$0) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't change its clamp before something initializes it");
      } else {
         this.a.a($$0 ? flf.b : flf.a);
      }
   }

   public void a(bau $$0, boolean $$1) {
      this.a($$0.a(this.b), $$1);
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get change its filter before something initializes it");
      } else {
         this.a.a($$0 ? flg.b : flg.a, $$1);
      }
   }

   @Override
   public void close() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }
   }

   public flh a() {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
      } else {
         return this.a;
      }
   }
}
