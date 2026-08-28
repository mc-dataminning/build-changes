import java.io.IOException;

public abstract class hjh extends hjb {
   private final alg c;

   public hjh(alg $$0) {
      this.c = $$0;
   }

   public alg c() {
      return this.c;
   }

   public void a(hjr $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.b = $$2;

      try (fiz $$3 = $$0.d()) {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(fiz $$0, boolean $$1, boolean $$2) {
      this.a = new fjw(this.c::toString, fjx.a, $$0.a(), $$0.b(), 1);
      this.a($$1, false);
      this.a($$2);
      this.a.a($$0);
   }

   public abstract hjr a(avd var1) throws IOException;
}
