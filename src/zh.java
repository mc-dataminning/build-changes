import java.util.Optional;

public class zh implements va<ws> {
   private final ti a;
   private final Optional<byte[]> b;
   private final boolean c;

   public zh(ti $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zh(sl $$0) {
      this.a = $$0.l();
      this.b = $$0.b(sl::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sl::a);
      $$0.a(this.c);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public ti a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
