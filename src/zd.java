import java.util.Optional;

public class zd implements uw<wo> {
   private final te a;
   private final Optional<byte[]> b;
   private final boolean c;

   public zd(te $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zd(sh $$0) {
      this.a = $$0.l();
      this.b = $$0.b(sh::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sh::a);
      $$0.a(this.c);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public te a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
