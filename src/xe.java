import javax.annotation.Nullable;

public class xe implements uo<ur> {
   public static final int a = 40;
   private final String b;
   private final String c;
   private final boolean d;
   @Nullable
   private final sw e;

   public xe(String $$0, String $$1, boolean $$2, @Nullable sw $$3) {
      if ($$1.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + $$1.length() + ")");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public xe(sf $$0) {
      this.b = $$0.s();
      this.c = $$0.e(40);
      this.d = $$0.readBoolean();
      this.e = $$0.c(sf::l);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.writeBoolean(this.d);
      $$0.a(this.e, sf::a);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   @Nullable
   public sw e() {
      return this.e;
   }
}
