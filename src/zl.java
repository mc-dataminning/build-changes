import java.util.Optional;

public class zl implements ve<wx> {
   private final tm a;
   private final Optional<byte[]> b;
   private final boolean c;

   public zl(tm $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zl(sp $$0) {
      this.a = $$0.l();
      this.b = $$0.b(sp::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sp::a);
      $$0.a(this.c);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public tm a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
