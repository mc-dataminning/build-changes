import java.util.Optional;

public class zl implements vd<ww> {
   private final tl a;
   private final Optional<byte[]> b;
   private final boolean c;

   public zl(tl $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zl(so $$0) {
      this.a = $$0.l();
      this.b = $$0.b(so::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b, so::a);
      $$0.a(this.c);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public tl a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
