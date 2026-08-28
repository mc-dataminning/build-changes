import java.io.IOException;

public abstract class hjb extends hiv {
   private final alg c;

   public hjb(alg $$0) {
      this.c = $$0;
   }

   public alg e() {
      return this.c;
   }

   public void a(hjl $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.b = $$2;

      try (fiu $$3 = $$0.d()) {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(fiu $$0, boolean $$1, boolean $$2) {
      this.a = new fjr(this.c::toString, fjs.a, $$0.a(), $$0.b(), 1);
      this.a($$1, false);
      this.a($$2);
      this.a.a($$0);
   }

   public abstract hjl a(avd var1) throws IOException;
}
