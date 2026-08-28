import javax.annotation.Nullable;

public abstract class hiv implements AutoCloseable {
   @Nullable
   protected fjr a;
   protected boolean b;

   public void a(boolean $$0) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't change its clamp before something initializes it");
      } else {
         this.a.a($$0 ? fjp.b : fjp.a);
      }
   }

   public void a(bas $$0, boolean $$1) {
      this.a($$0.a(this.b), $$1);
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get change its filter before something initializes it");
      } else {
         this.a.a($$0 ? fjq.b : fjq.a, $$1);
      }
   }

   public int a() {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get its ID before something initializes it");
      } else {
         return this.a.d();
      }
   }

   public void b() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }
   }

   public void c() {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't bind it before something initializes it");
      } else {
         this.a.c();
      }
   }

   @Override
   public void close() {
   }

   public fjr d() {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
      } else {
         return this.a;
      }
   }
}
